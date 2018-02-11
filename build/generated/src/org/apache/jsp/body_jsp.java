package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dbconnection.LoadConnection;
import java.sql.*;

public final class body_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"a2a_kit a2a_kit_size_32 a2a_floating_style a2a_vertical_style\" style=\"left: 0px; top: 150px;\">\n");
      out.write("    <a class=\"a2a_button_facebook\"></a>\n");
      out.write("    <a class=\"a2a_button_twitter\"></a>\n");
      out.write("    <a class=\"a2a_button_google_plus\"></a>\n");
      out.write("    <a class=\"a2a_button_pinterest\"></a>\n");
      out.write("    <a class=\"a2a_dd\" href=\"https://www.addtoany.com/share\"></a>\n");
      out.write("</div>\n");
      out.write("<div class=\"content\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("                            <!--content-->\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t<div class=\"content-top\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 col-md\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-1\">\n");
      out.write("\t\t\t\t\t\t <a href=\"single.html\" class=\"b-link-stroke b-animate-go  thickbox\">\n");
      out.write("\t\t   <img src=\"images/pi.jpg\" class=\"img-responsive\" alt=\"\"/><div class=\"b-wrapper1 long-img\"><p class=\"b-animate b-from-right    b-delay03 \">Lorem ipsum</p><label class=\"b-animate b-from-right    b-delay03 \"></label><h3 class=\"b-animate b-from-left    b-delay03 \">Trendy</h3></div></a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t<!---<a href=\"single.html\"><img src=\"images/pi.jpg\" class=\"img-responsive\" alt=\"\"></a>-->\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-2\">\n");
      out.write("\t\t\t\t\t\t\t<span>Hot Deal</span>\n");
      out.write("\t\t\t\t\t\t\t<h2><a href=\"single.html\">Luxurious &amp; Trendy</a></h2>\n");
      out.write("\t\t\t\t\t\t\t<p>Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years</p>\n");
      out.write("\t\t\t\t\t\t\t<a href=\"single.html\" class=\"buy-now\">Buy Now</a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 col-md1\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-3\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/pi1.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-pic\">\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem Ipsum</p>\n");
      out.write("\t\t\t\t\t\t\t\t<label></label>\n");
      out.write("\t\t\t\t\t\t\t\t<h5>For Men</h5>\n");
      out.write("\t\t\t\t\t\t\t</div></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-3\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/pi2.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-pic\">\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem Ipsum</p>\n");
      out.write("\t\t\t\t\t\t\t\t<label></label>\n");
      out.write("\t\t\t\t\t\t\t\t<h5>For Kids</h5>\n");
      out.write("\t\t\t\t\t\t\t</div></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-3\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"single.html\"><img src=\"images/pi3.jpg\" class=\"img-responsive\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-pic\">\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem Ipsum</p>\n");
      out.write("\t\t\t\t\t\t\t\t<label></label>\n");
      out.write("\t\t\t\t\t\t\t\t<h5>For Women</h5>\n");
      out.write("\t\t\t\t\t\t\t</div></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t<!--products-->\n");
      out.write("\t\t\t<div class=\"content-mid\">\n");
      out.write("\t\t\t\t<h3>Trending Items</h3>\n");
      out.write("\t\t\t\t<label class=\"line\"></label>\n");
      out.write("\t\t\t\t<div class=\"mid-popular\">\n");
      out.write("\t\t\t\t\t");

                                        try
                                            {
                                            Connection c=LoadConnection.getConnection();
                                            PreparedStatement ps = c.prepareStatement("select * from product where id > (select MAX(id) -10 FROM product) ");
                                           
                                            ResultSet rs=ps.executeQuery();
                                            while(rs.next())
                                            {
      out.write("\n");
      out.write("                                              \t<div class=\"col-md-3 item-grid simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t<div class=\" mid-pop\">\n");
      out.write("\t\t\t\t\t<div class=\"pro-img\">\n");
      out.write("                                            <img src=\"images/");
      out.print(rs.getString("image"));
      out.write("\" class=\"img-responsive\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t<div class=\"zoom-icon \">\n");
      out.write("\t\t\t\t\t\t<a class=\"picture\" href=\"images/");
      out.print(rs.getString("image"));
      out.write("\" rel=\"title\" class = \"b-link-stripe b-animate-go  thickbox\"><i class=\"glyphicon glyphicon-search icon \"></i></a>\n");
      out.write("                                                <a href=\"single.jsp?ok=");
      out.print(rs.getInt("id"));
      out.write("\"><i class=\"glyphicon glyphicon-menu-right icon\"></i></a>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"mid-1\">\n");
      out.write("\t\t\t\t\t\t<div class=\"women\">\n");
      out.write("\t\t\t\t\t\t<div class=\"women-top\">\n");
      out.write("                                                    <span>");
      out.print(rs.getString("brand"));
      out.write("</span><br>\n");
      out.write("\t\t\t\t\t\t\t<span>");
      out.print(rs.getString("gender"));
      out.write("</span>\n");
      out.write("                                                        <h6>");
      out.print(rs.getString("model"));
      out.write("  Size</h6>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"img item_add\">\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"images/ca.png\" alt=\"\"></a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"mid-2\">\n");
      out.write("\t\t\t\t\t\t\t\t<p ><label>$100.00</label><em class=\"item_price\">$");
      out.print(rs.getString("price"));
      out.write("</em></p>\n");
      out.write("\t\t\t\t\t\t\t\t  <div class=\"block\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"starbox small ghosting\"> </div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                            ");
}
                                            } catch(Exception e1)
                                                    {out.println(e1);
                                                    }
                                        
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--//products-->\n");
      out.write("\t\t\t<!--brand-->\n");
      out.write("\t\t\t<div class=\"brand\">\n");
      out.write("\t\t\t\t<div class=\"col-md-3 brand-grid\">\n");
      out.write("\t\t\t\t\t<img src=\"images/ic.png\" class=\"img-responsive\" alt=\"\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 brand-grid\">\n");
      out.write("\t\t\t\t\t<img src=\"images/ic1.png\" class=\"img-responsive\" alt=\"\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 brand-grid\">\n");
      out.write("\t\t\t\t\t<img src=\"images/ic2.png\" class=\"img-responsive\" alt=\"\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 brand-grid\">\n");
      out.write("\t\t\t\t\t<img src=\"images/ic3.png\" class=\"img-responsive\" alt=\"\">\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--//brand-->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>");
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
