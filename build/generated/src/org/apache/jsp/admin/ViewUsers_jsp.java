package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dbconnection.LoadConnection;
import java.sql.*;

public final class ViewUsers_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("   \n");
      out.write("\n");
      out.write("\n");
      out.write("<!--A Design by W3layouts \n");
      out.write("Author: W3layout\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Shopin A Ecommerce Category Flat Bootstrap Responsive Website Template | Short Codes :: w3layouts</title>\n");
      out.write("<link href=\"../css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<!--theme-style-->\n");
      out.write("<link href=\"../css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\n");
      out.write("<!--//theme-style-->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Shopin Responsive web template, Bootstrap Web Templates, Flat Web Templates, AndroId Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!--theme-style-->\n");
      out.write("<link href=\"../css/style4.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\n");
      out.write("<!--//theme-style-->\n");
      out.write("<script src=\"../js/jquery.min.js\"></script>\n");
      out.write("<!--- start-rate---->\n");
      out.write("<script src=\"../js/jstarbox.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../css/jstarbox.css\" type=\"text/css\" media=\"screen\" charset=\"utf-8\" />\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\tjQuery(function() {\n");
      out.write("\t\t\tjQuery('.starbox').each(function() {\n");
      out.write("\t\t\t\tvar starbox = jQuery(this);\n");
      out.write("\t\t\t\t\tstarbox.starbox({\n");
      out.write("\t\t\t\t\taverage: starbox.attr('data-start-value'),\n");
      out.write("\t\t\t\t\tchangeable: starbox.hasClass('unchangeable') ? false : starbox.hasClass('clickonce') ? 'once' : true,\n");
      out.write("\t\t\t\t\tghosting: starbox.hasClass('ghosting'),\n");
      out.write("\t\t\t\t\tautoUpdateAverage: starbox.hasClass('autoupdate'),\n");
      out.write("\t\t\t\t\tbuttons: starbox.hasClass('smooth') ? false : starbox.attr('data-button-count') || 5,\n");
      out.write("\t\t\t\t\tstars: starbox.attr('data-star-count') || 5\n");
      out.write("\t\t\t\t\t}).bind('starbox-value-changed', function(event, value) {\n");
      out.write("\t\t\t\t\tif(starbox.hasClass('random')) {\n");
      out.write("\t\t\t\t\tvar val = Math.random();\n");
      out.write("\t\t\t\t\tstarbox.next().text(' '+val);\n");
      out.write("\t\t\t\t\treturn val;\n");
      out.write("\t\t\t\t\t} \n");
      out.write("\t\t\t\t})\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("<!---//End-rate---->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!--header-->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\t\n");
      out.write("\t<!--table-->\n");
      out.write("\t <div class=\"page-header\">\n");
      out.write("        <h3>Users</h3>\n");
      out.write("      </div>\n");
      out.write("  \n");
      out.write("  <div class=\"bs-example\" data-example-id=\"simple-table\">\n");
      out.write("    <table class=\"table\">\n");
      out.write("      <thead>\n");
      out.write("        <tr>\n");
      out.write("          <th>#</th>\n");
      out.write("          <th>First Name</th>\n");
      out.write("          <th>Last Name</th>\n");
      out.write("          <th>Username</th>\n");
      out.write("            <th>Email</th>\n");
      out.write("        </tr>\n");
      out.write("      </thead>\n");
      out.write("      <tbody>\n");
      out.write("          ");

                                        try
                                            {
                                            Connection c=LoadConnection.getConnection();
                                            PreparedStatement ps = c.prepareStatement("select * from register");
                                           
                                            ResultSet rs=ps.executeQuery();
                                            while(rs.next())
                                            {
      out.write("\n");
      out.write("                                        \n");
      out.write("        <tr>\n");
      out.write("          <th scope=\"row\">1</th>\n");
      out.write("          <td>");
      out.print(rs.getString("fname"));
      out.write("</td>\n");
      out.write("          <td>");
      out.print(rs.getString("lname"));
      out.write("</td>\n");
      out.write("          <td>");
      out.print(rs.getString("username"));
      out.write("</td>\n");
      out.write("          <td>");
      out.print(rs.getString("email"));
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        ");
}
                                            } catch(Exception e1)
                                                    {out.println(e1);
                                                    }
                                        
      out.write("\n");
      out.write("      </tbody>\n");
      out.write("    </table>\n");
      out.write("  </div><!-- /example -->\n");
      out.write("\t<!--//table-->\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\t\t\t<!--brand-->\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"brand\">\n");
      out.write("\t\t\t\t<div class=\"col-md-3 brand-grid\">\n");
      out.write("\t\t\t\t\t<img src=\"../images/ic.png\" class=\"img-responsive\" alt=\"\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 brand-grid\">\n");
      out.write("\t\t\t\t\t<img src=\"../images/ic1.png\" class=\"img-responsive\" alt=\"\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 brand-grid\">\n");
      out.write("\t\t\t\t\t<img src=\"../images/ic2.png\" class=\"img-responsive\" alt=\"\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 brand-grid\">\n");
      out.write("\t\t\t\t\t<img src=\"../images/ic3.png\" class=\"img-responsive\" alt=\"\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--//brand-->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t<!--//content-->\n");
      out.write("\t\t<!--//footer-->\n");
      out.write("\t                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../footer.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\t\t<!--//footer-->\n");
      out.write("\t<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("\n");
      out.write("\t<script src=\"js/simpleCart.min.js\"> </script>\n");
      out.write("<!-- slide -->\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write(" \n");
      out.write("</body>\n");
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
