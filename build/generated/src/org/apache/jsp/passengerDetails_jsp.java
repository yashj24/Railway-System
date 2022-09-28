package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Passenger;

public final class passengerDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Passenger/s</title>\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel = \"stylesheet\" href = \"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\"\n");
      out.write("              integrity = \"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin = \"anonymous\" >\n");
      out.write("    </head>\n");
      out.write("    <body style = \"background-color: #EEEEEE\" >\n");
      out.write("        <form action = ConfirmDetailsServlet onsubmit=\"checkCaptcha\" method = \"post\" >\n");
      out.write("            ");

              
                String trainNo = request.getParameter("trainNo");
                int num = Integer.parseInt(request.getParameter("num"));
                session.setAttribute("trainNo", trainNo);
                session.setAttribute("num", num);
                
                for (int i = 1; i <= num; i++) {
                    out.println("<center>");
                    out.println("<h1>Passenger " + i + " Details</h1>");
                    out.println("</center>");
            
      out.write("\n");
      out.write("\n");
      out.write("            <div class = \"form-row\" >\n");
      out.write("                <div class = \"form-group col-md-6\" >\n");
      out.write("                    <label for = \"inputEmail4\" > First Name * </label>\n");
      out.write("                    ");
 out.println("<input type =text class = form-control name=fname" + i + " id=fname placeholder = \"First-Name\" required >"); 
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class = \"form-group col-md-6\" >\n");
      out.write("                    <label for = \"\" > Last Name * </label>\n");
      out.write("\n");
      out.write("                    ");
 out.println("<input type =text class = form-control name = lname" + i + "  id =fname placeholder =Last-Name required >"); 
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class = \"form-row\" >\n");
      out.write("\n");
      out.write("                <div class = \"form-group col-md-6\" >\n");
      out.write("                    <label for = \"inputEmail4\" > Age * </label>\n");
      out.write("                    ");
 out.println("<input type =number min=3 max=99 class = form-control name =age" + i + " id = age placeholder = Age required >");  
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <fieldset class=\"form-group\">\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                    <legend class=\"col-form-label col-sm-2 pt-0\">Gender *</legend>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <div class=\"form-check\">\n");
      out.write("                             ");
  out.println("<input class=form-check-input type=radio name=gender"+i+"  value=female checked>"); 
      out.write("\n");
      out.write("                            <label class=\"form-check-label\" for=\"gridRadios1\">\n");
      out.write("                                Female\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-check\">\n");
      out.write("                            ");
  out.println("<input class=form-check-input type=radio name=gender"+i+"  value=male>"); 
      out.write("\n");
      out.write("                            <label class=\"form-check-label\" for=\"gridRadios2\">\n");
      out.write("                                Male\n");
      out.write("                            </label>\n");
      out.write("                        </div>\n");
      out.write("                     \n");
      out.write("                    </div>\n");
      out.write("                            \n");
      out.write("                </div>\n");
      out.write("            </fieldset>\n");
      out.write("            <div class = \"form-row\" >\n");
      out.write("                <div class = \"form-group col-md-6\" >\n");
      out.write("                    <label for = \"inputEmail4\" > Email * </label>\n");
      out.write("                    ");
 out.println("<input type = email class = form-control name =email" + i + " id = email placeholder = Your-Registered-Email required >"); 
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class = \"form-group\" >\n");
      out.write("                <label> Mobile Number * </label>\n");
      out.write("                ");
 out.println("<input type = tel class = form-control name = mobile" + i + " id = mobile pattern=[0-9]{10} placeholder = Mobile required >"); 
      out.write("\n");
      out.write("            </div>\n");
      out.write("               \n");
      out.write("            </div>\n");
      out.write("            <div class = \"form-group\" >\n");
      out.write("                <label for = \"inputAddress\" > Address * </label>\n");
      out.write("                ");
 out.println("<input type =text class =form-control name = address" + i + " id = address placeholder = 1234-Main-St required >"); 
      out.write("\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("            <div class = \"form-row\" >\n");
      out.write("                <div class = \"form-group col-md-6\" >\n");
      out.write("                    <label for = \"inputCity\" > City * </label>\n");
      out.write("                    ");
 out.println("<input type = text class = form-control name = city" + i + " id = city required >"); 
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class = \"form-group col-md-4\" >\n");
      out.write("                    <label for = \"inputState\" > State * </label>\n");
      out.write("                    ");
 out.println("<select id = state name = state" + i + " class = form-control required >"); 
      out.write("\n");
      out.write("                    <option selected > Choose... </option>\n");
      out.write("                    <option value = \"Andhra Pradesh\" > Andhra Pradesh </option>\n");
      out.write("                    <option value = \"Andaman and Nicobar Islands\" > Andaman and Nicobar Islands </option>\n");
      out.write("                    <option value = \"Arunachal Pradesh\" > Arunachal Pradesh </option>\n");
      out.write("                    <option value = \"Assam\" > Assam </option>\n");
      out.write("                    <option value = \"Bihar\" > Bihar </option>\n");
      out.write("                    <option value = \"Chandigarh\" > Chandigarh </option>\n");
      out.write("                    <option value = \"Chhattisgarh\" > Chhattisgarh </option>\n");
      out.write("                    <option value = \"Dadar and Nagar Haveli\" > Dadar and Nagar Haveli </option>\n");
      out.write("                    <option value = \"Daman and Diu\" > Daman and Diu </option>\n");
      out.write("                    <option value = \"Delhi\" > Delhi </option>\n");
      out.write("                    <option value = \"Lakshadweep\" > Lakshadweep </option>\n");
      out.write("                    <option value = \"Puducherry\" > Puducherry </option>\n");
      out.write("                    <option value = \"Goa\" > Goa </option>\n");
      out.write("                    <option value = \"Gujarat\" > Gujarat </option>\n");
      out.write("                    <option value = \"Haryana\" > Haryana </option>\n");
      out.write("                    <option value = \"Himachal Pradesh\" > Himachal Pradesh </option>\n");
      out.write("                    <option value = \"Jammu and Kashmir\" > Jammu and Kashmir </option>\n");
      out.write("                    <option value = \"Jharkhand\" > Jharkhand </option>\n");
      out.write("                    <option value = \"Karnataka\" > Karnataka </option>\n");
      out.write("                    <option value = \"Kerala\" > Kerala </option>\n");
      out.write("                    <option value = \"Madhya Pradesh\" > Madhya Pradesh </option>\n");
      out.write("                    <option value = \"Maharashtra\" > Maharashtra </option>\n");
      out.write("                    <option value = \"Manipur\" > Manipur </option>\n");
      out.write("                    <option value = \"Meghalaya\" > Meghalaya </option>\n");
      out.write("                    <option value = \"Mizoram\" > Mizoram </option>\n");
      out.write("                    <option value = \"Nagaland\" > Nagaland </option>\n");
      out.write("                    <option value = \"Odisha\" > Odisha </option>\n");
      out.write("                    <option value = \"Punjab\" > Punjab </option>\n");
      out.write("                    <option value = \"Rajasthan\" > Rajasthan </option>\n");
      out.write("                    <option value = \"Sikkim\" > Sikkim </option>\n");
      out.write("                    <option value = \"Tamil Nadu\" > Tamil Nadu </option>\n");
      out.write("                    <option value = \"Telangana\" > Telangana </option>\n");
      out.write("                    <option value = \"Tripura\" > Tripura </option>\n");
      out.write("                    <option value = \"Uttar Pradesh\" > Uttar Pradesh </option>\n");
      out.write("                    <option value = \"Uttarakhand\" > Uttarakhand </option>\n");
      out.write("                    <option value = \"West Bengal\" > West Bengal </option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            ");
  };
      out.write("\n");
      out.write("\n");
      out.write("            <br >\n");
      out.write("            <br >\n");
      out.write("            <center >\n");
      out.write("                <div class = \"form-group\" >\n");
      out.write("                    <div class = \"form-check\" >\n");
      out.write("                        <input class = \"form-check-input\" type = \"checkbox\" id = \"gridCheck\" required >\n");
      out.write("                        <label class = \"form-check-label\" for = \"gridCheck\" >\n");
      out.write("                            I guarantee that the above information is correct.\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("                <button type = \"submit\" class = \"btn btn-warning\" > Submit Details </button>\n");
      out.write("            </center>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
