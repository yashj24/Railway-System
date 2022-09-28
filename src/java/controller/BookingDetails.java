/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.passengerDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Passenger;

/**
 *
 * @author HP
 */
public class BookingDetails extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        passengerDAO pd = new passengerDAO();
        int bookingID = Integer.parseInt(request.getParameter("bookingID"));
        HttpSession session = request.getSession();
        session.setAttribute("bookingId", bookingID);

        String forCancel = request.getParameter("hiddenForCancel");
        Passenger p = null;
        p = pd.bookingDetails(bookingID);
        session.setAttribute("trainNo", p.getTrainNo());
        session.setAttribute("status",p.getStatus());

        try {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>BookingDetails</title>");
            out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\"\n"
                    + "    integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">");

            out.println("</head>");
            out.println("<body>");
            if (p.getFirstName() == null) {
                out.println("<h2>Kindly check your Booking ID</h2>");
            } else {
                out.println("<form action=cancelBookingFinal method=post>");
                out.println("<center>");
                out.println("<table border=2>");
                out.println("<h1>Booking Details</h1>");
                out.println("<tr>");
                out.println("<th>Train No</th>");
                out.println("<th>First Name</th>");
                out.println("<th>Last Name</th>");
                out.println("<th>Age</th>");
                out.println("<th>Gender</th>");
                out.println("<th>Address</th>");
                out.println("<th>Mobile</th>");
                out.println("<th>Email</th>");
                out.println("<th>Seat Number</th>");
                out.println("<th>Status</th>");
                out.println(" </tr>");
                out.println("<tr>");
                Double mobile=p.getMobile();
                out.println("<td>" + p.getTrainNo() + "</td>");
                out.println("<td>" + p.getFirstName() + "</td>");
                out.println("<td>" + p.getLastName() + "</td>");
                out.println("<td>" + p.getAge() + "</td>");
                out.println("<td>" + p.getGender() + "</td>");
                out.println("<td>" + p.getAddress() + "</td>");
                out.println("<td>" + mobile.toString() + "</td>");
                out.println("<td>" + p.getEmail() + "</td>");
                out.println("<td>" + p.getSeatNo() + "</td>");
                if(p.getStatus().equals("Confirm")){
                out.println("<td style=\"color:Green;\">Confirm</td>");
            }else{
               out.println("<td style=\"color:Red;\">Waiting</td>");
               
            }
                out.println("</tr>");
                out.println("</table>");
                out.println("<br>");
                if (forCancel != null) {
                    //this page comes from bookingdetails.html and cancelBooking.html ,
//                    thus to know which page, i,ve added a hidden button in cancelBooking, as if so, it adds a cancel button in this page.
                    out.println("<button type=submit class=\"btn btn-danger btn-lg\">Cancel</button>");
                }
                out.println("<p class=mt-5 mb-3 text-muted>&copy; IRCTC by Yash Jain</p>");
                out.println("</center>");

                out.println("</form>");

            }

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
