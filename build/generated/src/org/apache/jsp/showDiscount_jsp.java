package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dbconnection.LoadConnection;
import java.sql.*;

public final class showDiscount_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
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
      out.write("<title>Shopin A Ecommerce Category Flat Bootstrap Responsive Website Template | Products :: w3layouts</title>\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- Custom Theme files -->\n");
      out.write("<!--theme-style-->\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\n");
      out.write("<!--//theme-style-->\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Shopin Responsive web template, Bootstrap Web Templates, Flat Web Templates, AndroId Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<!--theme-style-->\n");
      out.write("<link href=\"css/style4.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\t\n");
      out.write("<!--//theme-style-->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<!--- start-rate---->\n");
      out.write("<script src=\"js/jstarbox.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/jstarbox.css\" type=\"text/css\" media=\"screen\" charset=\"utf-8\" />\n");
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
      out.write("<link href=\"css/form.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!--banner\n");
      out.write("<div class=\"banner-top\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<h1>Single</h1>\n");
      out.write("\t\t<em></em>\n");
      out.write("                <h2><a href=\"index.jsp\">Home</a><label>/</label>Single</a></h2>\n");
      out.write("\t</div>\n");
      out.write("</div>-->\n");
      out.write("\t<!--content-->\n");
      out.write("\t\t<div class=\"product\">\n");
      out.write("\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"col-md-9\">\n");
      out.write("\t\t\t<div class=\"mid-popular\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t");

                                        try
                                            {
                                            Connection c=LoadConnection.getConnection();
                                            PreparedStatement ps = c.prepareStatement("select * from product where discount between ? and ?");
                                            ps.setInt(1,Integer.parseInt(request.getParameter("range1")) );
                                          ps.setInt(2,Integer.parseInt(request.getParameter("range2")) );

                                           
                                            ResultSet rs=ps.executeQuery();
                                            while(rs.next())
                                            {
                                              
                                                                         
      out.write("\n");
      out.write("                                             \n");
      out.write("                                                                         \n");
      out.write("                                                                          \t<div class=\"col-md-4 item-grid simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t\t<div class=\" mid-pop\">\n");
      out.write("\t\t\t\t\t<div class=\"pro-img\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/");
      out.print(rs.getString("image"));
      out.write("\" class=\"img-responsive\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t<div class=\"zoom-icon \">\n");
      out.write("\t\t\t\t\t\t<a class=\"picture\" href=\"images/");
      out.print(rs.getString("image"));
      out.write("\" rel=\"title\" class=\"b-link-stripe b-animate-go  thickbox\"><i class=\"glyphicon glyphicon-search icon \"></i></a>\n");
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
      out.write("                                                        <h6><a href=\"single.jsp\">Shirt</a></h6>\n");
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
      out.write("\t\t\t<div class=\"col-md-3 product-bottom\">\n");
      out.write("\t\t\t<!--categories-->\n");
      out.write("\t\t\t\t\n");
      out.write(" <section  class=\"sky-form\">\n");
      out.write("\t\t\t\t\t<h4 class=\"cate\">Discounts</h4>\n");
      out.write("\t\t\t\t\t <div class=\"row row1 scroll-pane\">\n");
      out.write("\t\t\t\t\t\t <div class=\"col col-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" checked=\"\"><i></i>Upto - 10% (20)</label>\n");
      out.write("\t\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t\t\t <div class=\"col col-4\">\n");
      out.write("                                                       <label class=\"checkbox\"><a  onclick=\"select(40,50)\"><input type=\"checkbox\" name=\"checkbox\"><i></i>40% - 50% (5)</a></label>\n");
      out.write("                                                     <label class=\"checkbox\"><a  onclick=\"select(30,20)\"><input type=\"checkbox\" name=\"checkbox\"><i></i>30% - 20% (7)</a></label>\n");
      out.write("                                                     <label class=\"checkbox\"><a  onclick=\"select(10,5)\"><input type=\"checkbox\" name=\"checkbox\"><i></i>10% - 5% (2)</a></label>\n");
      out.write("                                                     <label class=\"checkbox\"><a  onclick=\"select(50,100)\"><input type=\"checkbox\" name=\"checkbox\"><i></i>Other(50)</a></label>\n");
      out.write("\t\t\t\t\t\t \t </div>\n");
      out.write("\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t </section> \t\t\t\t \t\t\t\t \n");
      out.write("\t\t\t\t \n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t <!---->\n");
      out.write("\t\t\t\t\t <section  class=\"sky-form\">\n");
      out.write("\t\t\t\t\t\t<h4 class=\"cate\">Type</h4>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row row1 scroll-pane\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col col-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" checked=\"\"><i></i>Sofa Cum Beds (30)</label>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col col-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>Bags  (30)</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>Caps & Hats (30)</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>Jackets & Coats   (30)</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>Jeans  (30)</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>Shirts   (30)</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>Sunglasses  (30)</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>Swimwear  (30)</label>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t   </section>\n");
      out.write("\t\t\t\t   \t\t<section  class=\"sky-form\">\n");
      out.write("\t\t\t\t\t\t<h4 class=\"cate\">Brand</h4>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row row1 scroll-pane\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col col-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" checked=\"\"><i></i>Roadstar</label>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col col-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>Levis</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>Persol</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>Nike</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>Edwin</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" ><i></i>New Balance</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>Paul Smith</label>\n");
      out.write("\t\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>Ray-Ban</label>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t   </section>\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t</div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t<!--products-->\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<!--//products-->\n");
      out.write("\t\t<!--brand-->\n");
      out.write("\t\t<div class=\"container\">\n");
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
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<!--//brand-->\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t</div>\n");
      out.write("\t<script src=\"js/simpleCart.min.js\"> </script>\n");
      out.write("<!-- slide -->\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write(" <!--light-box-files -->\n");
      out.write("\t\t<script src=\"js/jquery.chocolat.js\"></script>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/chocolat.css\" type=\"text/css\" media=\"screen\" charset=\"utf-8\">\n");
      out.write("\t\t<!--light-box-files -->\n");
      out.write("\t\t<script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("\t\t$(function() {\n");
      out.write("\t\t\t$('a.picture').Chocolat();\n");
      out.write("\t\t});\n");
      out.write("\t\t</script>\n");
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
