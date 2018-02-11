package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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

      out.write("<!--A Design by W3layouts \n");
      out.write("Author: W3layout\n");
      out.write("Author URL: http://w3layouts.com\n");
      out.write("License: Creative Commons Attribution 3.0 Unported\n");
      out.write("License URL: http://creativecommons.org/licenses/by/3.0/\n");
      out.write("-->\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>Shopin A Ecommerce Category Flat Bootstrap Responsive Website Template | Home :: w3layouts</title>\n");
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
      out.write("<link href=\"css/style4.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link rel=\"stylesheet\"  type=\"text/css\" href=\"css/style1.css\" />        \n");
      out.write("\t<script src=\"js/jquery-1.9.1.js\"></script>\n");
      out.write("<!--//theme-style-->\n");
      out.write("<script src=\"js/jquery.min.js\"></script>\n");
      out.write("<!--- start-rate---->  \n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\tfunction showProduct(a,b)\n");
      out.write("\t\t{\n");
      out.write("\t\tvar ajx;\n");
      out.write("            //  alert(a+b);\n");
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
      out.write("\t    document.getElementById(\"mydiv\").innerHTML=ajx.responseText;\n");
      out.write("\t   }\n");
      out.write("\t}\n");
      out.write("\tajx.open(\"GET\",\"product.jsp?cat=\"+a+\"&gen=\"+b,true);\n");
      out.write("\tajx.send();\n");
      out.write("\t} \n");
      out.write("     </script> \n");
      out.write("<script src=\"js/jstarbox.js\"></script>\n");
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
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("            <div id=\"mydiv\">\n");
      out.write("<!--banner-->\n");
      out.write("<div class=\"banner\">\n");
      out.write("<div class=\"container\">\n");
      out.write("<section class=\"rw-wrapper\">\n");
      out.write("\t\t\t\t<h1 class=\"rw-sentence\">\n");
      out.write("\t\t\t\t\t<span>Fashion &amp; Beauty</span>\n");
      out.write("\t\t\t\t\t<div class=\"rw-words rw-words-1\">\n");
      out.write("\t\t\t\t\t\t<span>Beautiful Designs</span>\n");
      out.write("\t\t\t\t\t\t<span>Top Shop</span>\n");
      out.write("\t\t\t\t\t\t<span> New Collection</span>\n");
      out.write("\t\t\t\t\t\t<span>Top Brands</span>\n");
      out.write("\t\t\t\t\t\t<span>Sale</span>\n");
      out.write("\t\t\t\t\t\t<span>Be you</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"rw-words rw-words-2\">\n");
      out.write("\t\t\t\t\t\t<span>Flat 50% off</span>\n");
      out.write("\t\t\t\t\t\t<span>New Summer Collection</span>\n");
      out.write("\t\t\t\t\t\t<span>New Sports Wear</span>\n");
      out.write("\t\t\t\t\t\t<span>Want More?</span>\n");
      out.write("\t\t\t\t\t\t<span>Get it Exclusively Here</span>\n");
      out.write("\t\t\t\t\t\t<span>Shop Now</span>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</h1>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t\t</div>\n");
      out.write("</div>\n");
      out.write("\t<!--content-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "body.jsp", out, false);
      out.write("\n");
      out.write("            </div>   ");
      out.write("      \n");
      out.write("\t<!--//content-->\n");
      out.write("\t<!--//footer-->\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("\t\t<!--//footer-->\n");
      out.write("             \n");
      out.write("<script async src=\"//static.addtoany.com/menu/page.js\"></script>\n");
      out.write("<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("<script src=\"js/simpleCart.min.js\"> </script>\n");
      out.write("<!-- slide -->\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<!--light-box-files -->\n");
      out.write("\t\t<script src=\"js/jquery.chocolat.js\"></script>\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"css/chocolat.css\" type=\"text/css\" media=\"screen\" charset=\"utf-8\">\n");
      out.write("\t\t<!--light-box-files -->\n");
      out.write("\t\t<script type=\"text/javascript\" charset=\"utf-8\">\n");
      out.write("\t\t$(function() {\n");
      out.write("\t\t\t$('a.picture').Chocolat();\n");
      out.write("\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("\n");
      out.write("<div id=\"example-popup\" class=\"popup\">\n");
      out.write("    <div class=\"popup-body\">\t<span class=\"popup-exit\"></span>\n");
      out.write("\n");
      out.write("        <div class=\"popup-content\">\n");
      out.write("            \t<h2 class=\"popup-title\">Login Form</h2>\n");
      out.write("                   <form action=\"lBean.jsp\">\n");
      out.write("                                    <input type=\"text\" placeholder=\"Email\" name=\"email\" required=\"\"><br/><br/>\n");
      out.write("                                    <input type=\"password\" placeholder=\"Password\"  name=\"pass\" required/><br/><br/>\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Login\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div id=\"example-popup1\" class=\"popup\">\n");
      out.write("    <div class=\"popup-body\">\t<span class=\"popup-exit\"></span>\n");
      out.write("\n");
      out.write("        <div class=\"popup-content\">\n");
      out.write("            \t<h2 class=\"popup-title\">Registration Form</h2>\n");
      out.write("                   <form action=\"lBean.jsp\">\n");
      out.write("                                    <input type=\"text\" placeholder=\"Email\" name=\"email\" required=\"\"><br/><br/>\n");
      out.write("                                    <input type=\"password\" placeholder=\"Password\"  name=\"pass\" required/><br/><br/>\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"Login\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"popup-overlay\"></div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<script type='text/javascript'>//<![CDATA[ \n");
      out.write("$(window).load(function(){\n");
      out.write("jQuery(document).ready(function ($) {\n");
      out.write("\n");
      out.write("    $('[data-popup-target]').click(function () {\n");
      out.write("        $('html').addClass('overlay');\n");
      out.write("        var activePopup = $(this).attr('data-popup-target');\n");
      out.write("        $(activePopup).addClass('visible');\n");
      out.write("\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    $(document).keyup(function (e) {\n");
      out.write("        if (e.keyCode == 27 && $('html').hasClass('overlay')) {\n");
      out.write("            clearPopup();\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    $('.popup-exit').click(function () {\n");
      out.write("        clearPopup();\n");
      out.write("\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    $('.popup-overlay').click(function () {\n");
      out.write("        clearPopup();\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    function clearPopup() {\n");
      out.write("        $('.popup.visible').addClass('transitioning').removeClass('visible');\n");
      out.write("        $('html').removeClass('overlay');\n");
      out.write("\n");
      out.write("        setTimeout(function () {\n");
      out.write("            $('.popup').removeClass('transitioning');\n");
      out.write("        }, 200);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("});\n");
      out.write("});//]]>  \n");
      out.write("\n");
      out.write("</script>\n");
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
