package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Hello World!</h1>\n");
      out.write("        <form>\n");
      out.write("  <div class=\"form-row\">\n");
      out.write("    <div class=\"form-group col-md-6\">\n");
      out.write("      <label for=\"inputEmail4\">Email</label>\n");
      out.write("      <input type=\"email\" class=\"form-control\" id=\"inputEmail4\" placeholder=\"Email\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group col-md-6\">\n");
      out.write("      <label for=\"inputPassword4\">Password</label>\n");
      out.write("      <input type=\"password\" class=\"form-control\" id=\"inputPassword4\" placeholder=\"Password\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"inputAddress\">Address</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" id=\"inputAddress\" placeholder=\"1234 Main St\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"inputAddress2\">Address 2</label>\n");
      out.write("    <input type=\"text\" class=\"form-control\" id=\"inputAddress2\" placeholder=\"Apartment, studio, or floor\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-row\">\n");
      out.write("    <div class=\"form-group col-md-6\">\n");
      out.write("      <label for=\"inputCity\">City</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputCity\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group col-md-4\">\n");
      out.write("      <label for=\"inputState\">State</label>\n");
      out.write("      <select id=\"inputState\" class=\"form-control\">\n");
      out.write("        <option selected>Choose...</option>\n");
      out.write("        <option>...</option>\n");
      out.write("      </select>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form-group col-md-2\">\n");
      out.write("      <label for=\"inputZip\">Zip</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputZip\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <div class=\"form-check\">\n");
      out.write("      <input class=\"form-check-input\" type=\"checkbox\" id=\"gridCheck\">\n");
      out.write("      <label class=\"form-check-label\" for=\"gridCheck\">\n");
      out.write("        Check me out\n");
      out.write("      </label>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <button type=\"submit\" class=\"btn btn-primary\">Sign in</button>\n");
      out.write("</form>\n");
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
