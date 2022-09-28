/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.passengerDAO;
import DAO.trainDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Passenger;
import model.Train;

/**
 *
 * @author HP
 */


public class ConfirmDetailsServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        trainDAO td = new trainDAO();
        Train t = new Train();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Confirmation</title>");

        out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\"\n"
                + "    integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">");



        out.println("</head>");
        out.println("<body>");
        
        //this page comes from two servlets, traindetailsservlet1 & 2

        HttpSession session = request.getSession();

        int n = Integer.parseInt(session.getAttribute("num").toString());
        int tNo = Integer.parseInt(session.getAttribute("trainNo").toString());
        String doj = session.getAttribute("doj").toString();
        Date date = Date.valueOf(doj);
       
        ArrayList<String> al = new ArrayList();
        al = passengerDAO.seatNo(n);
        
        int totalConfirm=0;
        int totalWaiting=0;
        

        out.println("<form method=post action=ticket>");
        out.println("<center>");
        out.println("<table border=2>");
        out.println("<h1>Passenger/s details</h1>");
        out.println("<tr>");
        out.println("<th>Train No.</th>");
        out.println("<th>First Name</th>");
        out.println("<th>Last Name</th>");
        out.println("<th>Age</th>");
        out.println("<th>Gender</th>");
        out.println("<th>Address</th>");
        out.println("<th>Mobile</th>");
        out.println("<th>Email</th>");
        out.println("<th>City</th>");
        out.println("<th>State</th>");
        out.println("<th>Status</th>");
        out.println(" </tr>");
        try {
            t = td.findTrainDetails(tNo, date);
        } catch (Exception e) {
            out.println(e);
        }
        int totalSeats= t.getSeatsAvail();
        for (int i = 1; i <= n; i++) {

            String fname = request.getParameter("fname" + i);
            session.setAttribute("fname" + i, fname);
            String lname = request.getParameter("lname" + i);
            session.setAttribute("lname" + i, lname);
            int age = Integer.parseInt(request.getParameter("age" + i));
            session.setAttribute("age" + i, age);
            String gender = request.getParameter("gender" + i);
            session.setAttribute("gender" + i, gender);
            double mobile = Double.parseDouble(request.getParameter("mobile" + i));
            session.setAttribute("mobile" + i, mobile);
            String email = request.getParameter("email" + i);
            session.setAttribute("email" + i, email);
            String address = request.getParameter("address" + i);
            session.setAttribute("address" + i, address);
            String city = request.getParameter("city" + i);
            session.setAttribute("city" + i, city);
            String state = request.getParameter("state" + i);
            session.setAttribute("state" + i, state);
            int max = 99999;
            int min = 10000;
            int bookingID = (int) (Math.random() * (max - min + 1) + min);
            session.setAttribute("bookingID" + i, bookingID);
            String seatNo = al.get(i - 1);
            session.setAttribute("seat" + i, seatNo);
            
            
            out.println("<tr>");
            out.println("<td>" + tNo + "</td>");
            out.println("<td>" + fname + "</td>");
            out.println("<td>" + lname + "</td>");
            out.println("<td>" + age + "</td>");
            out.println("<td>" + gender + "</td>");
            out.println("<td>" + address + "</td>");
            out.println("<td>" + mobile + "</td>");
            out.println("<td>" + email + "</td>");
            out.println("<td>" + city + "</td>");
            out.println("<td>" + state + "</td>");
            if(totalSeats>0){
                out.println("<td style=\"color:Green;\">Available</td>");
                session.setAttribute("status"+i, "Confirm");
                totalConfirm++;
            }else{
               out.println("<td style=\"color:Red;\">Waiting</td>");
               session.setAttribute("status"+i, "Waiting");
               totalWaiting++;
            }
            totalSeats--;
            
            session.setAttribute("totalConfirm", totalConfirm);
            session.setAttribute("totalWaiting", totalWaiting);
            
            out.println("</tr>");

        }
      

        out.println(" </table>");
        out.println("<br>");
        out.println("<br>");
        out.println("<h1>Train Details</h1>");
        out.println("<table border=2>");
        out.println("<tr>");
        out.println("<th>Train No. </th>");
        out.println("<th>Train Name </th>");
        out.println("<th>From Station </th>");
        out.println("<th>To Station</th>");
        out.println("<th>Date of journey</th>");
        out.println("<th>Arrival Time </th>");
        out.println("<th>Departure Time</th>");
        out.println("<th>Total Tickets </th>");
        out.println("<th>Total Amount </th>");
        out.println(" </tr>");

        out.println("<tr>");
        out.println("<td> " + t.getTrain_no() + "</td>");
        out.println("<td> " + t.getTrainName() + "</td>");
        out.println("<td>" + t.getDeptStat() + "</td>");
        out.println("<td> " + t.getArrStat() + "</td>");
        out.println("<td>" + t.getDoj() + "</td>");
        out.println("<td>" + t.getArrival() + "</td>");
        out.println("<td>" + t.getDept() + "</td>");
        out.println("<td>" + n + "</td>");
        out.println("<td> " + t.getFare() * n + "</td>");
        out.println(" </tr>");
      
        out.println(" </table>");
        out.println("<br>");
        out.println("<br>");
        out.println("<button id=payment class=\"btn btn-info btn-lg\">Confirm</button>");
         out.println("<p class=mt-5 mb-3 text-muted>&copy; IRCTC by Yash Jain</p>");
        out.println("</center>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
      
       

    }
    

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       // processRequest(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
