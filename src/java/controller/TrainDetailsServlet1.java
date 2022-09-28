
package controller;
import DAO.trainDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.LinkedList;
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
public class TrainDetailsServlet1 extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Train/s Detail</title>");

            out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\"\n"
                    + "    integrity=\"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin=\"anonymous\">");
           
            out.println("</head>");
            out.println("<body>");
            String source, destination,doj;

            source = request.getParameter("source");
            destination = request.getParameter("destination");
            doj=request.getParameter("doj");  
            Date date=Date.valueOf(doj);
            HttpSession session=request.getSession(true);
            session.setAttribute("doj", date);
            

            trainDAO td = new trainDAO();
            LinkedList<Train> ld = new LinkedList();
           
            ld = td.findTrainDetails(source, destination,date);
           if(ld.isEmpty()){
               response.sendRedirect("errorTrainDetails.html");
           }
           
            
            out.println("<center>");
            out.println("<form action=passengerDetails.jsp method=post>");
            out.println("<table border=1 class=\"table\">");
            out.println("<thead class=\"thead-dark\">");
            out.println("<tr>");
            out.println("<th scope=\"col\"></th>");

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
            for (int i = 0; i < ld.size(); i++) {
                out.println("<tr>");
                Train t = new Train();
                t = ld.get(i);

                out.println("<tr>");
                int id = t.getTrain_no();
                out.println("<td><input type=radio class=\"btn-check-2-outlined\" id=\"btn-check-outlined\" autocomplete=\"off\" value=" + id + " name=trainNo required></td>");
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
            }
            out.println("</table>");
            out.println("<br>");

            out.println("<input type=text name= num placeholder=Total-Seats>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<br>");
            out.println("<button type=submit class=\"btn btn-info btn-lg\">Book Tickets</button>");
            out.println("<p class=mt-5 mb-3 text-muted>*In case of lesser or no seats available, seats will be in waiting</p>");
            out.println("<p class=mt-5 mb-3 text-muted>&copy; IRCTC by Yash Jain</p>");
            out.println("</center>");
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
