package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dbconnection.LoadConnection;
import java.sql.*;

public final class single_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!--A Design by W3layouts \n");
      out.write("Author: W3layout\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Shopin A Ecommerce Category Flat Bootstrap Responsive Website Template | Single :: w3layouts</title>\n");
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
      out.write("\t\tfunction showDesc(a)\n");
      out.write("\t\t{\n");
      out.write("\t\tvar ajx;\n");
      out.write(" \t   if (window.XMLHttpRequest)\n");
      out.write(" \t   {// If the browser if IE7+[or] Firefox[or] Chrome[or] Opera[or]Safari\n");
      out.write(" \t     ajx=new XMLHttpRequest();\n");
      out.write(" \t   }\n");
      out.write(" \t  else\n");
      out.write(" \t   {//If browser is IE6, IE5\n");
      out.write(" \t     ajx=new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write(" \t   }\n");
      out.write("\tajx.onreadystatechange=function()\n");
      out.write("\t{\n");
      out.write("\t  if (ajx.readyState==4 && ajx.status==200)\n");
      out.write("\t  { \n");
      out.write("\t    document.getElementById(\"desc\").innerHTML=ajx.responseText;\n");
      out.write("\t   }\n");
      out.write("\t}\n");
      out.write("\tajx.open(\"GET\",\"showDesc.jsp?id=\"+a,true);\n");
      out.write("\tajx.send();\n");
      out.write("\t} \n");
      out.write("     </script> \n");
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
      out.write("<!--header-->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("<!--banner-->\n");
      out.write("<div class=\"banner-top\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<h1>Single</h1>\n");
      out.write("\t\t<em></em>\n");
      out.write("                <h2><a href=\"index.jsp\">Home</a><label>/</label>Single</a></h2>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"single\">\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    \n");
      out.write("<div class=\"col-md-9\">\n");
      out.write("   \n");
      out.write("\t\n");
      out.write("     ");

         int id=Integer.parseInt(request.getParameter("ok"));
                                        try
                                            {
                                            Connection c=LoadConnection.getConnection();
                                            PreparedStatement ps = c.prepareStatement("select * from product where id=?");
                                            ps.setInt(1, id);
                                           
                                            ResultSet rs=ps.executeQuery();
                                            while(rs.next())
                                            {
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-5 grid\">\t\t\n");
      out.write("\t\t<div class=\"flexslider\">\n");
      out.write("\t\t\t  <ul class=\"slides\">\n");
      out.write("\t\t\t    <li data-thumb=\"images/");
      out.print(rs.getString("image"));
      out.write("\">\n");
      out.write("\t\t\t        <div class=\"thumb-image\"> <img src=\"images/");
      out.print(rs.getString("image"));
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
      out.write("\t\t\t    </li>\n");
      out.write("\t\t\t    <li data-thumb=\"images/");
      out.print(rs.getString("image1"));
      out.write("\">\n");
      out.write("\t\t\t         <div class=\"thumb-image\"> <img src=\"images/");
      out.print(rs.getString("image1"));
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
      out.write("\t\t\t    </li>\n");
      out.write("\t\t\t    <li data-thumb=\"images/");
      out.print(rs.getString("image2"));
      out.write("\">\n");
      out.write("\t\t\t       <div class=\"thumb-image\"> <img src=\"images/");
      out.print(rs.getString("image2"));
      out.write("\" data-imagezoom=\"true\" class=\"img-responsive\"> </div>\n");
      out.write("\t\t\t    </li> \n");
      out.write("\t\t\t  </ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\t\n");
      out.write("<div class=\"col-md-7 single-top-in\">\n");
      out.write("    <div class=\"span_2_of_a1 simpleCart_shelfItem\">\n");
      out.write("\t\t\t\t<h3>Description</h3>\n");
      out.write("\t\t\t\t<p class=\"in-para\">");
      out.print(rs.getString("description"));
      out.write("</p>\n");
      out.write("\t\t\t    <div class=\"price_single\">\n");
      out.write("\t\t\t\t  <span class=\"reducedfrom item_price\">$");
      out.print(rs.getString("price"));
      out.write("</span>\n");
      out.write("\t\t\t\t <a >");
      out.print(rs.getString("model"));
      out.write("</a>\n");
      out.write("\t\t\t\t <div class=\"clearfix\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<h4 class=\"quick\">Quick Overview:</h4>\n");
      out.write("\t\t\t\t<p class=\"quick_desc\">");
      out.print(rs.getString("overview"));
      out.write("</p>\n");
      out.write("\t\t\t    <div class=\"wish-list\">\n");
      out.write("\t\t\t\t \t<ul>\n");
      out.write("\t\t\t\t \t\t<li class=\"wish\"><a href=\"#\"><span class=\"glyphicon glyphicon-check\" aria-hidden=\"true\"></span>Add to Wishlist</a></li>\n");
      out.write("\t\t\t\t \t    <li class=\"compare\"><a href=\"#\"><span class=\"glyphicon glyphicon-resize-horizontal\" aria-hidden=\"true\"></span>Add to Compare</a></li>\n");
      out.write("\t\t\t\t \t</ul>\n");
      out.write("\t\t\t\t </div>\n");
      out.write("\t\t\t\t <div class=\"quantity\"> \n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"quantity-select\">                           \n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"entry value-minus\">&nbsp;</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"entry value\"><span>1</span></div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"entry value-plus active\">&nbsp;</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("                                 ");
}
                                            } catch(Exception e1)
                                                    {out.println(e1);
                                                    }
                                        
      out.write("\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<!--quantity-->\n");
      out.write("\t<script>\n");
      out.write("    $('.value-plus').on('click', function(){\n");
      out.write("    \tvar divUpd = $(this).parent().find('.value'), newVal = parseInt(divUpd.text(), 10)+1;\n");
      out.write("    \tdivUpd.text(newVal);\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    $('.value-minus').on('click', function(){\n");
      out.write("    \tvar divUpd = $(this).parent().find('.value'), newVal = parseInt(divUpd.text(), 10)-1;\n");
      out.write("    \tif(newVal>=1) divUpd.text(newVal);\n");
      out.write("    });\n");
      out.write("\t</script>\n");
      out.write("\t<!--quantity-->\n");
      out.write("\t\t\t\t \n");
      out.write("\t\t\t    <a href=\"#\" class=\"add-to item_add hvr-skew-backward\">Add to cart</a>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t<!---->\n");
      out.write("\t\t\t<div class=\"tab-head\">\n");
      out.write("\t\t\t <nav class=\"nav-sidebar\">\n");
      out.write("\t\t<ul class=\"nav tabs\">\n");
      out.write("                    <li class=\"active\"><a onclick=\"showDesc(9)\" data-toggle=\"tab\">Product Description</a></li>\n");
      out.write("          <li class=\"\"><a href=\"#tab2\" data-toggle=\"tab\">Additional Information</a></li> \n");
      out.write("          <li class=\"\"><a href=\"#tab3\" data-toggle=\"tab\">Reviews</a></li>  \n");
      out.write("\t\t</ul>\n");
      out.write("\t</nav>\n");
      out.write("                            \n");
      out.write("\t<div class=\"tab-content one\" id=\"desc\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("  </div>\n");
      out.write("  <div class=\"clearfix\"></div>\n");
      out.write("  </div>\n");
      out.write("\t\t\t<!---->\t\n");
      out.write("</div>\n");
      out.write("<!----->\n");
      out.write("\n");
      out.write("<div class=\"col-md-3 product-bottom product-at\">\n");
      out.write("\t\t\t<!--categories-->\n");
      out.write("\t\t\t\t<div class=\" rsidebar span_1_of_left\">\n");
      out.write("\t\t\t\t\t\t<h4 class=\"cate\">Categories</h4>\n");
      out.write("\t\t\t\t\t\t\t <ul class=\"menu-drop\">\n");
      out.write("\t\t\t\t\t\t\t<li class=\"item1\"><a href=\"#\">Men </a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"cute\">\n");
      out.write("\t\t\t\t\t\t\t\t\t <li class=\"subitem1\"><a href=\"product.jsp\">Cute Kittens </a></li>\n");
      out.write("                                                                    <li class=\"subitem2\"><a href=\"product.jsp\">Strange Stuff </a></li>\n");
      out.write("                                                                    <li class=\"subitem3\"><a href=\"product.jsp\">Automatic Fails </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"item2\"><a href=\"#\">Women </a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"cute\">\n");
      out.write("\t\t\t\t\t\t\t\t\t <li class=\"subitem1\"><a href=\"product.jsp\">Cute Kittens </a></li>\n");
      out.write("                                                                    <li class=\"subitem2\"><a href=\"product.jsp\">Strange Stuff </a></li>\n");
      out.write("                                                                    <li class=\"subitem3\"><a href=\"product.jsp\">Automatic Fails </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"item3\"><a href=\"#\">Kids</a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"cute\">\n");
      out.write("\t\t\t\t\t\t\t\t\t <li class=\"subitem1\"><a href=\"product.jsp\">Cute Kittens </a></li>\n");
      out.write("                                                                    <li class=\"subitem2\"><a href=\"product.jsp\">Strange Stuff </a></li>\n");
      out.write("                                                                    <li class=\"subitem3\"><a href=\"product.jsp\">Automatic Fails </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"item4\"><a href=\"#\">Accessories</a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"cute\">\n");
      out.write("\t\t\t\t\t\t\t\t\t <li class=\"subitem1\"><a href=\"product.jsp\">Cute Kittens </a></li>\n");
      out.write("                                                                    <li class=\"subitem2\"><a href=\"product.jsp\">Strange Stuff </a></li>\n");
      out.write("                                                                    <li class=\"subitem3\"><a href=\"product.jsp\">Automatic Fails </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<li class=\"item4\"><a href=\"#\">Shoes</a>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"cute\">\n");
      out.write("\t\t\t\t\t\t\t\t\t <li class=\"subitem1\"><a href=\"product.jsp\">Cute Kittens </a></li>\n");
      out.write("                                                                    <li class=\"subitem2\"><a href=\"product.jsp\">Strange Stuff </a></li>\n");
      out.write("                                                                    <li class=\"subitem3\"><a href=\"product.jsp\">Automatic Fails </a></li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t<!--initiate accordion-->\n");
      out.write("\t\t\t\t\t\t<script type=\"text/javascript\">\n");
      out.write("\t\t\t\t\t\t\t$(function() {\n");
      out.write("\t\t\t\t\t\t\t    var menu_ul = $('.menu-drop > li > ul'),\n");
      out.write("\t\t\t\t\t\t\t           menu_a  = $('.menu-drop > li > a');\n");
      out.write("\t\t\t\t\t\t\t    menu_ul.hide();\n");
      out.write("\t\t\t\t\t\t\t    menu_a.click(function(e) {\n");
      out.write("\t\t\t\t\t\t\t        e.preventDefault();\n");
      out.write("\t\t\t\t\t\t\t        if(!$(this).hasClass('active')) {\n");
      out.write("\t\t\t\t\t\t\t            menu_a.removeClass('active');\n");
      out.write("\t\t\t\t\t\t\t            menu_ul.filter(':visible').slideUp('normal');\n");
      out.write("\t\t\t\t\t\t\t            $(this).addClass('active').next().stop(true,true).slideDown('normal');\n");
      out.write("\t\t\t\t\t\t\t        } else {\n");
      out.write("\t\t\t\t\t\t\t            $(this).removeClass('active');\n");
      out.write("\t\t\t\t\t\t\t            $(this).next().stop(true,true).slideUp('normal');\n");
      out.write("\t\t\t\t\t\t\t        }\n");
      out.write("\t\t\t\t\t\t\t    });\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t});\n");
      out.write("\t\t\t\t\t\t</script>\n");
      out.write("<!--//menu-->\n");
      out.write(" <section  class=\"sky-form\">\n");
      out.write("\t\t\t\t\t<h4 class=\"cate\">Discounts</h4>\n");
      out.write("\t\t\t\t\t <div class=\"row row1 scroll-pane\">\n");
      out.write("\t\t\t\t\t\t <div class=\"col col-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\" checked=\"\"><i></i>Upto - 10% (20)</label>\n");
      out.write("\t\t\t\t\t\t </div>\n");
      out.write("\t\t\t\t\t\t <div class=\"col col-4\">\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>40% - 50% (5)</label>\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>30% - 20% (7)</label>\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>10% - 5% (2)</label>\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"checkbox\"><input type=\"checkbox\" name=\"checkbox\"><i></i>Other(50)</label>\n");
      out.write("\t\t\t\t\t\t </div>\n");
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
      out.write("\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\t\t<!--brand-->\n");
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
      out.write("\t<!--//content-->\n");
      out.write("\t\t<!--//footer-->\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\t\t<!--//footer-->\n");
      out.write("<script src=\"js/imagezoom.js\"></script>\n");
      out.write("\n");
      out.write("\t<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script defer src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" />\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("// Can also be used with $(document).ready()\n");
      out.write("$(window).load(function() {\n");
      out.write("  $('.flexslider').flexslider({\n");
      out.write("    animation: \"slide\",\n");
      out.write("    controlNav: \"thumbnails\"\n");
      out.write("  });\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\t<script src=\"js/simpleCart.min.js\"> </script>\n");
      out.write("<!-- slide -->\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
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
