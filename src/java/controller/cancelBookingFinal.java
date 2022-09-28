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

/**
 *
 * @author HP
 */
public class cancelBookingFinal extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* This page is tp confirm cancellation */
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Cancellation</title>"); 
            out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\"\n"
                    + "    integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">");

            out.println("</head>");
            out.println("<body>");
            HttpSession session= request.getSession();
            passengerDAO pd = new passengerDAO();
            int bookingId=Integer.parseInt(session.getAttribute("bookingId").toString());
            int trainNo=Integer.parseInt(session.getAttribute("trainNo").toString());
            String status=session.getAttribute("status").toString();
                if(status.equals("Confirm")){
                pd.confirmAfterCancel(bookingId, trainNo); //this method will confirm a waiting ticket after cancellation of a confirm ticket
            }
           if(pd.cancelBooking(bookingId,trainNo)){
             
            out.println("<center>");
             
            out.println("<h1>Booking has been cancelled.</h1>");
            out.println("<h2>Payment has been initiated.</h2>");
            out.println("<h2>You can close/back the page.Do not refresh.</h2>");
             out.println("<p class=mt-5 mb-3 text-muted>&copy; IRCTC by Yash Jain</p>");
           out.println("</center>");
           }
           else{
               out.println("<h1>There was some error, please try again</h1>");
               out.println("<center>");
                out.println("<p class=mt-5 mb-3 text-muted>&copy; IRCTC by Yash Jain</p>");
                out.println("</center>");
               }
            out.println("</body>");
            out.println("</html>");
            
          
            
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
