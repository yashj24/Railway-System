package DAO;

import connect.myConnection;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import model.Passenger;






public class passengerDAO {

    
    public static ArrayList<Integer> Sno(int num){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs=null;
        int sno=0;
        ArrayList ar= new ArrayList();
        try{
            con = myConnection.getConnection();
            String sql= "select max(Sno) from passengerdetails";
            ps=con.prepareStatement(sql);
            rs= ps.executeQuery();
            if(rs.next()){
                sno= rs.getInt(1);
                
            }
            for(int i=0;i<num;i++){
                ar.add(++sno);
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        return ar;
    }
    
    
    public boolean insertDetails(LinkedList<Passenger> L) {
        Connection con = null;
        PreparedStatement psInsert = null;
        int n = 0;

        try {

            con = myConnection.getConnection();
           
            for (int i = 0; i < L.size(); i++) {
                Passenger p = new Passenger();

                p = L.get(i);

                String sqlInsert = null;
                sqlInsert = "insert into passengerdetails values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                psInsert = con.prepareStatement(sqlInsert);
                
                psInsert.setString(1, p.getFirstName());
                psInsert.setString(2, p.getLastName());
                psInsert.setInt(3, p.getAge());
                psInsert.setDouble(4, p.getMobile());
                psInsert.setString(5, p.getEmail());
                psInsert.setString(6, p.getCity());
                psInsert.setString(7, p.getState());
                psInsert.setString(8, p.getAddress());
                psInsert.setString(9, p.getGender());
                psInsert.setInt(10, p.getBookingID());
                psInsert.setString(11, p.getSeatNo());
                psInsert.setInt(12, p.getTrainNo());
                psInsert.setString(13, p.getStatus());
                psInsert.setInt(14, p.getSno());
               
                

                n=psInsert.executeUpdate();

            }
            if (n > 0) {
                return true;
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return false;
    }

    public static ArrayList<String> seatNo(int count) {
        int max = 99;
        int min = 1;
        ArrayList<String> al = new ArrayList();
        Random random = new Random();
        char randomChar;
        int n = (int) (Math.random() * (max - min + 1) + min);
        randomChar = (char) (random.nextInt(26) + 'A');

        for (int i = 0; i < count; i++) {
            String num = randomChar + "-" + n;
            al.add(num);
            ++n;
        }
        return al;

    }

    public Passenger bookingDetails(int bookingID) {
        Passenger p = new Passenger();

        Connection con = null;
        PreparedStatement ps = null;
        String sql = null;
        ResultSet rs = null;
        try {
            con = myConnection.getConnection();
            sql = "select * from passengerdetails where bookingid=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1, bookingID);
            rs = ps.executeQuery();
            if (rs.next()) {
                p.setFirstName(rs.getString(1));
                p.setLastName(rs.getString(2));
                p.setAge(rs.getInt(3));
                p.setMobile(rs.getDouble(4));
                p.setEmail(rs.getString(5));
                p.setAddress(rs.getString(8));
                p.setGender(rs.getString(9));
                p.setSeatNo(rs.getString(11));
                p.setTrainNo(rs.getInt(12));
                p.setStatus(rs.getString(13));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

        return p;
    }

    public boolean cancelBooking(int bookingID,int trainNo) {
        Connection con = null;
        PreparedStatement ps = null;
        PreparedStatement psDelete = null;
        PreparedStatement psUpdate = null;
        boolean t=false;
        //this method even adds the tickets cancelled from database
        try {
            con = myConnection.getConnection();

            ResultSet rs = null;
            
            String sql,sqlUpdate,sqlDelete;
            
            
            
            
            
            sql = "select seats_avail from railwayDetails where train_no=?";
            sqlUpdate = "update railwayDetails set seats_Avail=? where train_no=?";
            
            //to update seatno by 1
            ps=con.prepareStatement(sql);
            ps.setInt(1, trainNo);
            rs=ps.executeQuery();
            rs.next();
            int seatNo=rs.getInt(1);
            seatNo++;
            psUpdate=con.prepareStatement(sqlUpdate);
            psUpdate.setInt(1, seatNo);
            psUpdate.setInt(2, trainNo);
            int m=psUpdate.executeUpdate();
            System.out.println("sql update -"+m);
            
            //delete passenger details from table
            sqlDelete = "delete from passengerdetails where bookingid=?";
            psDelete = con.prepareStatement(sqlDelete);
            psDelete.setInt(1, bookingID);
            int n = psDelete.executeUpdate();
             if (n > 0) {
                 return true;
               
            }

        } catch (Exception e) {
            System.out.println(e);
        }
       
        return false;

    }

     public static String encrypt(String pass){
         
        String encryptedpassword = null;  
        try   
        {  
            /* MessageDigest instance for MD5. */  
            MessageDigest m = MessageDigest.getInstance("MD5");  
              
            /* Add plain-text password bytes to digest using MD5 update() method. */  
            m.update(pass.getBytes());  
              
            /* Convert the hash value into bytes */   
            byte[] ba = m.digest();  
              
            /* The bytes array has bytes in decimal form. Converting it into hexadecimal format. */  
            StringBuilder s = new StringBuilder();  
            for(int i=0; i< ba.length ;i++)  
            {  
                s.append(Integer.toString((ba[i] & 0xff) + 0x100, 16).substring(1));  
            }  
              
          
            encryptedpassword = s.toString();  
        }   
        catch (NoSuchAlgorithmException e)   
        {  
            e.printStackTrace();  
        }  
          
        
        
        
        return encryptedpassword;
    }
    
    public boolean signUp(Passenger P,String pass){
        
        Connection con=null;
        PreparedStatement ps= null;
        String sql=null;
        
        try{
            con= myConnection.getConnection();
            sql="insert into passengercredentials values(?,?,?,?,?,?,?)";
            ps=con.prepareStatement(sql);
            ps.setString(1, P.getFirstName());
            ps.setString(2, P.getLastName());
            ps.setInt(3, P.getAge());
            ps.setString(4, P.getGender());
            ps.setDouble(5, P.getMobile());
            ps.setString(6, P.getEmail());
            ps.setString(7,encrypt(pass));
            int n=ps.executeUpdate();
           if(n>0){
            return true;
        }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        return false;
    }
    
    
    public boolean login(String email,String pass){
        
         Connection con=null;
        PreparedStatement ps= null;
        String sql=null;
        
        ResultSet rs= null;
        
        try{
            con= myConnection.getConnection();
            sql="select * from passengercredentials where email=? and password=?";
            ps=con.prepareStatement(sql);
           
            pass= passengerDAO.encrypt(pass);
             ps.setString(1, email);
             ps.setString(2, pass);
           rs=ps.executeQuery();
           if(rs.next()){
            return true;
        }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        return false;
    }
    
    public static String generateCaptchaString() {
        Random random=new Random();
	int length = 7 + (Math.abs(random.nextInt()) % 3);
      

	StringBuffer captchaStringBuffer = new StringBuffer();
	for (int i = 0; i < length; i++) {
		int baseCharNumber = Math.abs(random.nextInt()) % 62;
		int charNumber = 0;
		if (baseCharNumber < 26) {
			charNumber = 65 + baseCharNumber;
		}
		else if (baseCharNumber < 52){
			charNumber = 97 + (baseCharNumber - 26);
		}
		else {
			charNumber = 48 + (baseCharNumber - 52);
		}
		captchaStringBuffer.append((char)charNumber);
	}

	return captchaStringBuffer.toString();
}
  
    
    
    public void confirmAfterCancel(int bookingId,int trainNo){
        //this method confirms a waiting ticket after cancellation of a ticket.
        //it is used in cancelBookingFinal.java where it checks if the ticket cancelled was a confirm ticket
        Connection con=null;
        PreparedStatement ps=null;
        ResultSet rs= null;
        String sql=null;
        String sql1=null; // this is to take out min sno where status is waiting
        int sno=0;
        Passenger p= new Passenger();
        p=bookingDetails(bookingId); 
        
        try{
            con=myConnection.getConnection();
            sql1="select min(sno) from passengerdetails WHERE STATUS =? and trainNo=?";
            sql="update passengerdetails set status=? , seatNo=? where status=? and Sno=? and trainNo=?";
            ps=con.prepareStatement(sql1);
            ps.setString(1,"Waiting");
            ps.setInt(2, trainNo);     
            rs=ps.executeQuery();
            if(rs.next()){
                sno=rs.getInt(1);
            }
            ps=con.prepareStatement(sql);
            ps.setString(1, "Confirm");
             ps.setString(2, p.getSeatNo());
            ps.setString(3, "Waiting");
            ps.setInt(4, sno);
            ps.setInt(5, trainNo);
            ps.executeUpdate();
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    
    
    

}
