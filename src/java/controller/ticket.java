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
import java.util.ArrayList;
import java.util.LinkedList;
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
public class ticket extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        LinkedList<Passenger> ld = new LinkedList<>();
        passengerDAO pd = new passengerDAO();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Ticket</title>");
        out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\"\n"
                + "    integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">");
        out.println("<link rel=\"stylesheet\" href=\"./css/styles2.css \">");

        out.println("</head>");
        out.println("<body>");
      
       
       
        try {

            int tNo, n;
            HttpSession session = request.getSession();
            tNo = Integer.parseInt(session.getAttribute("trainNo").toString());
            n = Integer.parseInt(session.getAttribute("num").toString());
            //these are available seats to book and waiting seats to book
            int totalWaiting = Integer.parseInt(session.getAttribute("totalWaiting").toString());
            int totalConfirm = Integer.parseInt(session.getAttribute("totalConfirm").toString());
            ArrayList<Integer> ar= passengerDAO.Sno(n);
            for (int i = 1; i <= n; i++) {
                String fname = session.getAttribute("fname" + i).toString();
                String lname = session.getAttribute("lname" + i).toString();
                int age = Integer.parseInt(session.getAttribute("age" + i).toString());
                double mobile = Double.parseDouble(session.getAttribute("mobile" + i).toString());
                String email = session.getAttribute("email" + i).toString();
                String address = session.getAttribute("address" + i).toString();
                String gender = session.getAttribute("gender" + i).toString();
                String city = session.getAttribute("city" + i).toString();
                String state = session.getAttribute("state" + i).toString();
                int bookingID = Integer.parseInt(session.getAttribute("bookingID" + i).toString());
                String seatNo = session.getAttribute("seat" + i).toString();
                String status = session.getAttribute("status" + i).toString();

                Passenger p = new Passenger();
                p.setFirstName(fname);
                p.setLastName(lname);
                p.setAge(age);
                p.setMobile(mobile);
                p.setEmail(email);
                p.setAddress(address);
                p.setCity(city);
                p.setState(state);
                p.setGender(gender);
                p.setBookingID(bookingID);
                p.setSeatNo(seatNo);
                p.setTrainNo(tNo);
                p.setStatus(status);
                p.setSno(ar.get(i-1));
                ld.add(p);

            }
            trainDAO td = new trainDAO();
            Train t=null;
            if (pd.insertDetails(ld)) {
                t = td.bookTicket(tNo, n);
            } else {
                response.sendRedirect("errorConfirmation.html");
            }

            

           
            

            out.println("<center>");
          
            out.println("<br>");
            out.println("<br>");

            out.println("<table  style=\"background-color: #DFDFDE; filter: alpha(opacity=40); opacity: 0.95;border:5px #8D8DAA solid;\">");

            out.println("<tr>");
            out.println("<h3>शुभ यात्रा   Happy Journey</h3>");
            out.println("</tr>");
            out.println("<div id=watermarkTicket>");
            out.println("<img src=\"https://images-na.ssl-images-amazon.com/images/I/814NZySS89L.png\" alt=\"...\" />");
            out.println("<tr>");
            out.println("<th>Booking ID</th>");
            for (int i = 1; i <= n; i++) {
                out.println("<td>" + session.getAttribute("bookingID" + i) + "</td>");

            }
            out.println("</tr>");
            out.println("<tr>");
            out.println("<th>Train No.: </th>");
            out.println("<td>" + t.getTrain_no() + "</td>");
            out.println("<th>Train Name:</th>");
            out.println("<td>" + t.getTrainName() + "</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<th>Source:</th>");
            out.println("<td>" + t.getDeptStat() + "</td>");

            out.println("<th>Destination:</th>");
            out.println("<td>" + t.getArrStat() + "</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<th>Date Of Journey:</th>");
            out.println("<td>" + session.getAttribute("doj") + "</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<th>Arrival Time:</th>");
            out.println("<td>" + t.getArrival() + "</td>");

            out.println("<th>Departure Time:</th>");
            out.println("<td>" + t.getDept() + "</td>");
            out.println("</tr>");

            out.println("<tr>");
            out.println("<th>Total Seat/s:</th>");
            out.println("<td>" + n + "</td>");
            out.println("<th>Seat Number/s:</th>");
            for (int i = 1; i <= totalConfirm; i++) {
                out.println("<td>" + session.getAttribute("seat" + i) + "</td>");

            }
            out.println("</tr>");
            out.println("<tr>");
            out.println("<th>Confirmed Seat/s:</th>");
            out.println("<td>" + totalConfirm + "</td>");
            out.println("<th>Waiting Seat/s:</th>");
            out.println("<td>" + totalWaiting + "</td>");

            out.println("</tr>");

            out.println("</table>");
            out.println("</div>");
            out.println("<p><br><br>*Kindly note the Booking ID/s for future reference</>");
             out.println("<p><br><br>*Keep checking booking details in case of waiting seat</>");
            out.println("<p class=mt-5 mb-3 text-muted>&copy; IRCTC by Yash Jain</p>");
            out.println("</center>");

            out.println("</body>");
            out.println("</html>");
        } catch (Exception e) {
            out.println(e);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
