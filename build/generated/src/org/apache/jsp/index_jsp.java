package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAO.passengerDAO;
import model.Passenger;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>IRCTC</title>\n");
      out.write("       \n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"./css/styles1.css\">\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-image: url(https://thebrandhopper.com/wp-content/uploads/2021/01/Indian-Railway-Catering-and-Tourism-Corporation.png)\">\n");
      out.write("        ");

            String fName=null;
             fName = request.getParameter("fName");
            String lName = request.getParameter("lName");
            String age = request.getParameter("age");
            String mobile = request.getParameter("mobile");
            String pass=request.getParameter("password");
           
            int intAge=0;
            double doubleMobile=0;
            //not parsed directly as they can be null, because this page is action of two pages= login and signup and then csn give number format exception
            if(age!=null && mobile!=null){
                intAge= Integer.parseInt(age);
                doubleMobile= Double.parseDouble(mobile);
                 
            }
            String gender = request.getParameter("gender");
            String email = request.getParameter("email");
            
           //login email and loginpass are email and password from login page
            String loginEmail= request.getParameter("loginEmail");
             String loginPass= request.getParameter("loginPass");

            Passenger p = new Passenger();
            passengerDAO pd = new passengerDAO();
            p.setFirstName(fName);
            p.setLastName(lName);
            p.setAge(intAge);
            p.setMobile(doubleMobile);
            p.setEmail(email);
            p.setGender(gender);

            if (pd.signUp(p, pass) || pd.login(loginEmail, loginPass) || pd.login(email, pass)) {
           //  third or condition because if user refreshes the page after signup
        
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <div class=\"indexLinks\">\n");
      out.write("        <a class=\"btn btn-info\" href=\"BookTickets.html\">Book Tickets</a>\n");
      out.write("       \n");
      out.write("        <a class=\"btn btn-info\" href=\"TrainDetails.html\">Train between Stations</a>\n");
      out.write("      \n");
      out.write("        <a class=\"btn btn-info\" href=\"BookingDetails.html\">Booking Details</a>\n");
      out.write("     \n");
      out.write("        <a class=\"btn btn-info\" href=\"cancelBooking.html\">Cancel Booking</a>\n");
      out.write("        \n");
      out.write("      \n");
      out.write("        </div>\n");
      out.write("    </center>\n");
      out.write(" <!--this else if condition is for signup page invalid-->\n");
      out.write("    ");
 } else if(fName!=null) { 
      out.write("\n");
      out.write("    <script>\n");
      out.write("        alert(\"Email already exists\");\n");
      out.write("    </script>\n");
      out.write("<!--this else condition is for login page invalid-->\n");
      out.write("       ");
 } else if(!pd.login(loginEmail, loginPass)){
      out.write("\n");
      out.write("        <script>\n");
      out.write("        alert(\"Invalid Credentials\");\n");
      out.write("    </script>\n");
      out.write("    ");
 } else{
           out.println("<a class=btn btn-info href=signup.jsp>SignUp</a> <a class=btn btn-info href=login.jsp>Login</a>");
       }
      out.write("\n");
      out.write("\n");
      out.write("    <center> \n");
      out.write("    <footer> <p class=\"mt-5 mb-3 text-muted\">&copy; IRCTC by Yash Jain</p></footer>\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
