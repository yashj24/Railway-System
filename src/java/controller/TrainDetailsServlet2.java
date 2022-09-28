/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.trainDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Train;

/**
 *
 * @author HP
 */
public class TrainDetailsServlet2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Train Detail</title>");
            out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\"\n"
                    + "    integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">");
           
            out.println("</head>");
            out.println("<body>");
            String doj= request.getParameter("doj");
            Date date= Date.valueOf(doj);
            int trainNumByUser;

            trainNumByUser = Integer.parseInt(request.getParameter("trainNo"));
            HttpSession session = request.getSession(true);
            session.setAttribute("trainNumByUser", trainNumByUser);
            session.setAttribute("doj", date);
            Train t = new Train();
            trainDAO td = new trainDAO();
            t = td.findTrainDetails(trainNumByUser,date);
            
            if(t.getTrain_no()==0){
                response.sendRedirect("errorTrainDetails.html");
                
            }
            
            out.println("<center>");
            out.println("<form method=post action=passengerDetails.jsp>");
            out.println("<table border=1 class=\"table\">");
            out.println("<thead class=\"thead-dark\">");
            out.println("<tr>");

            out.println("<th scope=\"col\">Train Number</th>");
            out.println("<th scope=\"col\">Departure Station</th>");
            out.println("<th scope=\"col\">Arrival Station</th>");
            out.println("<th scope=\"col\">Date Of Journey</th>");
            out.println("<th scope=\"col\">Arrival Time</th>");
            out.println("<th scope=\"col\">Departure Time</th>");
            out.println("<th scope=\"col\">Fare</th>");
            out.println("<th scope=\"col\">Seats Available</th>");
            out.println("</tr>");
            out.println(" </thead>");
            out.println("<tr>");
            out.println("<td>" + t.getTrain_no() + "</td>");
            out.println("<td>" + t.getDeptStat() + "</td>");
            out.println("<td>" + t.getArrStat() + "</td>");
            out.println("<td>" + t.getDoj() + "</td>");
            out.println("<td>" + t.getArrival()+ "</td>");
                out.println("<td>" + t.getDept()+ "</td>");
            out.println("<td>" + t.getFare() + "</td>");
            out.println("<td>" + t.getSeatsAvail() + "</td>");
            out.println("<tr>");

            out.println("</tr>");
            out.println("</table>");
            out.println("<br>");
            out.println("<input type=number min=1  name= num placeholder=" + "Total-Seats" + " required>");
            out.println("<td><input type=hidden  value=" + t.getTrain_no() + " name=trainNo ></td>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<button class=\"btn btn-info btn-lg\"  type=submit>Book Tickets</button>");
             out.println("<p class=mt-5 mb-3 text-muted>&copy; IRCTC by Yash Jain</p>");
            out.println("</form>");

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
