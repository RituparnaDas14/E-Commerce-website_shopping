<!--A Design by W3layouts 
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>Shopin A Ecommerce Category Flat Bootstrap Responsive Website Template | Home :: w3layouts</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Shopin Responsive web template, Bootstrap Web Templates, Flat Web Templates, AndroId Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--theme-style-->
<link href="css/style4.css" rel="stylesheet" type="text/css" media="all" />
<link rel="stylesheet"  type="text/css" href="css/style1.css" />        
	<script src="js/jquery-1.9.1.js"></script>
<!--//theme-style-->
<script src="js/jquery.min.js"></script>
<!--- start-rate---->  
<script type="text/javascript">
		function showProduct(a,b)
		{
		var ajx;
            //  alert(a+b);
 	   if (window.XMLHttpRequest)
 	   {// If the browser if IE7+[or] Firefox[or] Chrome[or] Opera[or]Safari
 	     ajx=new XMLHttpRequest();
 	   }
 	  else
 	   {//If browser is IE6, IE5
 	     ajx=new ActiveXObject("Microsoft.XMLHTTP");
 	   }
	ajx.onreadystatechange=function()
	{
	  if (ajx.readyState==4 && ajx.status==200)
	  { 
	    document.getElementById("mydiv").innerHTML=ajx.responseText;
	   }
	}
	ajx.open("GET","product.jsp?cat="+a+"&gen="+b,true);
	ajx.send();
	} 
     </script> 
<script src="js/jstarbox.js"></script>
	<link rel="stylesheet" href="css/jstarbox.css" type="text/css" media="screen" charset="utf-8" />
		<script type="text/javascript">
			jQuery(function() {
			jQuery('.starbox').each(function() {
				var starbox = jQuery(this);
					starbox.starbox({
					average: starbox.attr('data-start-value'),
					changeable: starbox.hasClass('unchangeable') ? false : starbox.hasClass('clickonce') ? 'once' : true,
					ghosting: starbox.hasClass('ghosting'),
					autoUpdateAverage: starbox.hasClass('autoupdate'),
					buttons: starbox.hasClass('smooth') ? false : starbox.attr('data-button-count') || 5,
					stars: starbox.attr('data-star-count') || 5
					}).bind('starbox-value-changed', function(event, value) {
					if(starbox.hasClass('random')) {
					var val = Math.random();
					starbox.next().text(' '+val);
					return val;
					} 
				})
			});
		});
		</script>
<!---//End-rate---->

</head>
<body>
            <jsp:include page="header.jsp"/>
            <div id="mydiv">
<!--banner-->
<div class="banner">
<div class="container">
<section class="rw-wrapper">
				<h1 class="rw-sentence">
					<span>Fashion &amp; Beauty</span>
					<div class="rw-words rw-words-1">
						<span>Beautiful Designs</span>
						<span>Top Shop</span>
						<span> New Collection</span>
						<span>Top Brands</span>
						<span>Sale</span>
						<span>Be you</span>
					</div>
					<div class="rw-words rw-words-2">
						<span>Flat 50% off</span>
						<span>New Summer Collection</span>
						<span>New Sports Wear</span>
						<span>Want More?</span>
						<span>Get it Exclusively Here</span>
						<span>Shop Now</span>
					</div>
				</h1>
			</section>
			</div>
</div>
	<!--content-->
        <jsp:include page="body.jsp"/>
            </div>   <%--   close mydiv   --%>      
	<!--//content-->
	<!--//footer-->
        <jsp:include page="footer.jsp"/>
		<!--//footer-->
             
<script async src="//static.addtoany.com/menu/page.js"></script>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/simpleCart.min.js"> </script>
<!-- slide -->
<script src="js/bootstrap.min.js"></script>
<!--light-box-files -->
		<script src="js/jquery.chocolat.js"></script>
		<link rel="stylesheet" href="css/chocolat.css" type="text/css" media="screen" charset="utf-8">
		<!--light-box-files -->
		<script type="text/javascript" charset="utf-8">
		$(function() {
			$('a.picture').Chocolat();
		});
		</script>

<div id="example-popup" class="popup">
    <div class="popup-body">	<span class="popup-exit"></span>

        <div class="popup-content">
            	<h2 class="popup-title">Login Form</h2>
                   <form action="lBean.jsp">
                                    <input type="text" placeholder="Email" name="email" required=""><br/><br/>
                                    <input type="password" placeholder="Password"  name="pass" required/><br/><br/>
					<input type="submit" value="Login">
			</div>
			</form>
        </div>
    </div>
</div>
<div id="example-popup1" class="popup">
    <div class="popup-body">	<span class="popup-exit"></span>

        <div class="popup-content">
            	<h2 class="popup-title">Registration Form</h2>
                   <form action="lBean.jsp">
                                    <input type="text" placeholder="Email" name="email" required=""><br/><br/>
                                    <input type="password" placeholder="Password"  name="pass" required/><br/><br/>
					<input type="submit" value="Login">
			</div>
			</form>
        </div>
    </div>
</div>
<div class="popup-overlay"></div>
</body>
</html>
<script type='text/javascript'>//<![CDATA[ 
$(window).load(function(){
jQuery(document).ready(function ($) {

    $('[data-popup-target]').click(function () {
        $('html').addClass('overlay');
        var activePopup = $(this).attr('data-popup-target');
        $(activePopup).addClass('visible');

    });

    $(document).keyup(function (e) {
        if (e.keyCode == 27 && $('html').hasClass('overlay')) {
            clearPopup();
        }
    });

    $('.popup-exit').click(function () {
        clearPopup();

    });

    $('.popup-overlay').click(function () {
        clearPopup();
    });

    function clearPopup() {
        $('.popup.visible').addClass('transitioning').removeClass('visible');
        $('html').removeClass('overlay');

        setTimeout(function () {
            $('.popup').removeClass('transitioning');
        }, 200);
    }

});
});//]]>  

</script>
