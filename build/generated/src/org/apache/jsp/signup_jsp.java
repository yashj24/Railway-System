package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>SignUp</title>\n");
      out.write("\n");
      out.write("        <link rel = \"stylesheet\" href = \"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\"\n");
      out.write("              integrity = \"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin = \"anonymous\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"index.jsp\">\n");
      out.write("            <section class=\"vh-100\" style=\"background-color: #eee;\">\n");
      out.write("                <div class=\"container h-100\">\n");
      out.write("                    <div class=\"row d-flex justify-content-center align-items-center h-100\">\n");
      out.write("                        <div class=\"col-lg-12 col-xl-11\">\n");
      out.write("                            <div class=\"card text-black\" style=\"border-radius: 25px;\">\n");
      out.write("                                <div class=\"card-body p-md-5\">\n");
      out.write("                                    <div class=\"row justify-content-center\">\n");
      out.write("                                        <div class=\"col-md-10 col-lg-6 col-xl-5 order-2 order-lg-1\">\n");
      out.write("\n");
      out.write("                                            <p class=\"text-center h1 fw-bold mb-5 mx-1 mx-md-4 mt-4\">Sign up</p>\n");
      out.write("\n");
      out.write("                                            <form class=\"mx-1 mx-md-4\">\n");
      out.write("\n");
      out.write("                                                <div class=\"d-flex flex-row align-items-center mb-4\">\n");
      out.write("\n");
      out.write("                                                    <div class=\"form-outline flex-fill mb-0\">\n");
      out.write("                                                        <label class=\"form-label\">First Name</label>\n");
      out.write("                                                        <input type=\"text\" name=\"fName\" class=\"form-control\" placeholder = \"First Name\" required/>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"d-flex flex-row align-items-center mb-4\">\n");
      out.write("\n");
      out.write("                                                    <div class=\"form-outline flex-fill mb-0\">\n");
      out.write("                                                        <label class=\"form-label\" >Last Name</label>\n");
      out.write("                                                        <input type=\"text\" name=\"lName\" placeholder = \"Last Name\" class=\"form-control\" required/>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"d-flex flex-row align-items-center mb-4\">\n");
      out.write("\n");
      out.write("                                                    <div class=\"form-outline flex-fill mb-0\">\n");
      out.write("                                                        <label class=\"form-label\" >Age</label>\n");
      out.write("                                                        <input type =number  max=99 min=18 name=\"age\" id=\"age\" class=\"form-control\" placeholder = Age required />\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <fieldset class=\"form-group\">\n");
      out.write("                                                    <div class=\"row\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                        <legend class=\"col-form-label col-sm-5 pt-0\">Gender</legend>\n");
      out.write("                                                        <div class=\"col-sm-15\">\n");
      out.write("                                                            <div class=\"form-check\">\n");
      out.write("                                                                <input class=\"form-check-input\" type=\"radio\" name=\"gender\" value=\"male\" checked>\n");
      out.write("                                                                <label class=\"form-check-label\">\n");
      out.write("                                                                    Male\n");
      out.write("                                                                </label>\n");
      out.write("                                                            </div>\n");
      out.write("                                                            <div class=\"form-check\">\n");
      out.write("                                                                <input class=\"form-check-input\" type=\"radio\" name=\"gender\"  value=\"female\">\n");
      out.write("                                                                <label class=\"form-check-label\" >\n");
      out.write("                                                                    Female\n");
      out.write("                                                                </label>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </fieldset>\n");
      out.write("\n");
      out.write("                                                <div class=\"d-flex flex-row align-items-center mb-4\">\n");
      out.write("\n");
      out.write("                                                    <div class=\"form-outline flex-fill mb-0\">\n");
      out.write("                                                        <label class=\"form-label\" >Mobile</label>\n");
      out.write("                                                        <input type = tel  name = mobile pattern=[0-9]{10} class=\"form-control\" placeholder = 9876543210 required >\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <div class=\"d-flex flex-row align-items-center mb-4\">\n");
      out.write("\n");
      out.write("                                                    <div class=\"form-outline flex-fill mb-0\">\n");
      out.write("                                                        <label class=\"form-label\">Your Email</label>\n");
      out.write("                                                        <input type=\"email\" placeholder = \"123@abc.com\" name=\"email\" class=\"form-control\" required />\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"d-flex flex-row align-items-center mb-4\">\n");
      out.write("\n");
      out.write("                                                    <div class=\"form-outline flex-fill mb-0\">\n");
      out.write("                                                        <label class=\"form-label\" >Password</label>\n");
      out.write("                                                        <input type=\"password\" id=\"password\" name=\"password\" class=\"form-control\" placeholder = Password required />\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"d-flex flex-row align-items-center mb-4\">\n");
      out.write("\n");
      out.write("                                                    <div class=\"form-outline flex-fill mb-0\">\n");
      out.write("                                                        <label class=\"form-label\">Repeat your password</label>\n");
      out.write("                                                        <input type=\"password\" id=\"confirm_password\" name=\"confirm_password\" placeholder = \"Confirm Password\" class=\"form-control\"  required/>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                <div class=\"form-check d-flex justify-content-center mb-5\">\n");
      out.write("                                                    <input class=\"\" type=\"checkbox\" value=\"\" required >I agree all statements in  <a href=\"#!\">Terms of service</a></input>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                </div>\n");
      out.write("                                                 \n");
      out.write("\n");
      out.write("                                                <div class=\"d-flex justify-content-center mx-4 mb-3 mb-lg-4\">\n");
      out.write("                                                    <button type=\"submit\" onclick=\" return Validate()\" class=\"btn btn-primary btn-lg\">Register</button>\n");
      out.write("                                                    \n");
      out.write("                                                </div>\n");
      out.write("                                                <div>\n");
      out.write("                                                    <p> Already have a account? <a href=\"login.jsp\">Login</a></p>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                            </form>\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-10 col-lg-6 col-xl-7 d-flex align-items-center order-1 order-lg-2\">\n");
      out.write("\n");
      out.write("                                            <img src=\"https://bsmedia.business-standard.com/_media/bs/img/article/2019-09/30/full/1569790979-4055.jpg\"\n");
      out.write("                                                 class=\"img-fluid\" alt=\"Sample image\">\n");
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                        \n");
      out.write("                                    </div>\n");
      out.write("                                    <p class=\"mt-5 mb-3 text-muted\">&copy; IRCTC by Yash Jain</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </section>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function Validate() {\n");
      out.write("                var password = document.getElementById(\"password\").value;\n");
      out.write("                var confirmPassword = document.getElementById(\"confirm_password\").value;\n");
      out.write("                var age = document.getElementById(\"age\").value;\n");
      out.write("                if (password != confirmPassword) {\n");
      out.write("                    alert(\"Passwords do not match.\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                if (age < 18 || age > 99) {\n");
      out.write("                    alert(\"Age must be above 18\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
