package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <meta name=\"description\" content=\"\">\n");
      out.write("        <meta name=\"author\" content=\"Mark Otto, Jacob Thornton, and Bootstrap contributors\">\n");
      out.write("        <meta name=\"generator\" content=\"Jekyll v3.8.5\">\n");
      out.write("        <title>SignIn</title>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <link rel = \"stylesheet\" href = \"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\"\n");
      out.write("              integrity = \"sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh\" crossorigin = \"anonymous\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body class=\"text-center\">\n");
      out.write("        <form class=\"form\" method=\"post\" action=\"index.jsp\">\n");
      out.write("            <br><br>\n");
      out.write("            <img class=\"mb-4\" src=\"https://upload.wikimedia.org/wikipedia/en/thumb/4/45/IRCTC_Logo.svg/1200px-IRCTC_Logo.svg.png\" alt=\"\" width=\"100\" height=\"100\">\n");
      out.write("            <h1 class=\"h3 mb-3 font-weight-normal\">Sign In</h1>\n");
      out.write("          \n");
      out.write("              <label>Email address:</label>\n");
      out.write("                     <input type=\"email\" name=\"loginEmail\"  placeholder=\"Email address\" required autofocus>\n");
      out.write("               \n");
      out.write("                    <label >Password:</label></td>\n");
      out.write("                    <td>  <input type=\"password\" name=\"loginPass\"  placeholder=\"Password\" required>\n");
      out.write("                \n");
      out.write("            \n");
      out.write("\n");
      out.write("            <button class=\"btn btn-lg btn-primary \" type=\"submit\">Sign in</button>\n");
      out.write("            <p> Don't have a account? <a href=\"signup.jsp\">SignUp</a></p>\n");
      out.write("            <p class=\"mt-5 mb-3 text-muted\">&copy; IRCTC by Yash Jain</p>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
