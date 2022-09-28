package DAO;

import connect.myConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.LinkedList;


import model.Train;

public class trainDAO {

   

    public Train findTrainDetails(int trainNo,Date date) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        con = myConnection.getConnection();
        Train t = new Train();
        ResultSet rs = null;
        int i=1;

        String sql = "select * from railwayDetails where train_no = ? and doj=?";
        ps = con.prepareStatement(sql);
        ps.setInt(1, trainNo);
        ps.setDate(2, date);
        rs = ps.executeQuery();
        while (rs.next()) {
            
            t.setTrain_no(rs.getInt(1));
            t.setTrainName(rs.getString(2));
            t.setDeptStat(rs.getString(3));
            t.setArrStat(rs.getString(4));
            t.setDoj(rs.getDate(5));
            t.setSeatsAvail(rs.getInt(6));
            t.setFare(rs.getInt(7));
            t.setTotalSeats(rs.getInt(8));
            t.setArrival(rs.getTime(9));
            t.setDept(rs.getTime(10));
            System.out.println(i);
            System.out.println(t);
            i++;
        }

        return t;

    }

    public LinkedList findTrainDetails(String Source, String Destination,Date date) throws Exception {
        Connection con = null;
        PreparedStatement ps = null;
        con = myConnection.getConnection();
       
        ResultSet rs = null;
       

        String sql = "select * from railwayDetails where dept_stat=? and arri_stat=? and doj= ?";
        ps = con.prepareStatement(sql);
        ps.setString(1, Source);
        ps.setString(2, Destination);
        ps.setDate(3, date);
        rs = ps.executeQuery();
        LinkedList <Train> ld= new LinkedList();
 
       while (rs.next()) {
           Train t = new Train();
            
            t.setTrain_no(rs.getInt(1));
            t.setTrainName(rs.getString(2));
            t.setDeptStat(rs.getString(3));
            t.setArrStat(rs.getString(4));
            t.setDoj(rs.getDate(5));
            t.setSeatsAvail(rs.getInt(6));
            t.setFare(rs.getInt(7));
            t.setTotalSeats(rs.getInt(8));
            t.setArrival(rs.getTime(9));
            t.setDept(rs.getTime(10));
            
            
            ld.add(t);
        }

        return ld;

    }
    
    
    public Train bookTicket(int trainNo,int num) throws Exception{
        Connection con = null;
        PreparedStatement ps = null;
        PreparedStatement psUpdate = null;
        PreparedStatement psBooked = null;

        Train t=null;
         
       //this method even subtracts the tickets booked from database
        con = myConnection.getConnection();
        ResultSet rs= null;
        ResultSet rsBooked= null;
        String sql,sqlUpdate,sqlBooked;
        sql="select seats_avail from railwayDetails where train_no=?";
        sqlUpdate="update railwayDetails set seats_Avail=? where train_no=?";
        sqlBooked="select * from railwayDetails where train_no=?";
        ps=con.prepareStatement(sql);
        ps.setInt(1,trainNo);
       
        rs=ps.executeQuery();
        int n=0;
        if(rs.next()){
            n=rs.getInt(1);
        }
        
        
        
            //decrementing seats avail by 1
            System.out.println("Tickets Booked");
            psUpdate=con.prepareStatement(sqlUpdate);
            
            psUpdate.setInt(1, n-num);
            psUpdate.setInt(2,trainNo);
            psUpdate.executeUpdate();
            
            psBooked=con.prepareStatement(sqlBooked);
            psBooked.setInt(1,trainNo);
            
            rsBooked=psBooked.executeQuery();
            if(rsBooked.next()){
            while(num!=0){
            t=new Train();
            
            
            t.setTrain_no(rsBooked.getInt(1));
            t.setTrainName(rsBooked.getString(2));
            t.setDeptStat(rsBooked.getString(3));
            t.setArrStat(rsBooked.getString(4));
            t.setDoj(rsBooked.getDate(5));

            t.setFare(rsBooked.getInt(7));

            t.setArrival(rsBooked.getTime(9));
            t.setDept(rsBooked.getTime(10));
            num--;
                System.out.println(t);
            }
            
          
            }
            
            
       
        
        
        
       return t;
        
        
    }

}
