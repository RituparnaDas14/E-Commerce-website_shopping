<!--A Design by W3layouts 
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html>
<head>
<title>Shopin A Ecommerce Category Flat Bootstrap Responsive Website Template | Contact :: w3layouts</title>
<link href="../css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- Custom Theme files -->
<!--theme-style-->
<link href="../css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Shopin Responsive web template, Bootstrap Web Templates, Flat Web Templates, AndroId Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!--theme-style-->
<link href="../css/style4.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<script src="../js/jquery.min.js"></script>
<!--- start-rate---->
   <script type="text/javascript">
		function show(a)
		{
		var ajx;
                
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
	ajx.open("GET",a,true);
	ajx.send();
	} 
     </script> 
<script src="../js/jstarbox.js"></script>
	<link rel="../stylesheet" href="css/jstarbox.css" type="text/css" media="screen" charset="utf-8" />
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
<!--header-->
<jsp:include page="../header.jsp"/>

<!--banner-->
	
		
			<div class="contact">
					
				<div class="contact-form">
					<div class="container">
					
			<div class="col-md-6 contact-left">
					<div class="address">
					<div class=" address-grid">
                                                        <div>
								<h3><a onclick="show('AdminEditProfile.jsp')">Edit Profile</a></h3>

								
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class=" address-grid ">
							<div class="address1">
                                                            <h3> <a href="AddProduct.jsp">Add Product</a></h3>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class=" address-grid ">
							<div class="address1">
                                                            <h3><a href="UpdateProduct.jsp">Update Product</a></h3>
							</div>
							<div class="clearfix"> </div>
						</div>
						<div class=" address-grid ">
							<div class="address1">
								<h3><a  onclick="show('AdminChangePass.jsp')">Change Password</a></h3>
							</div>
							<div class="clearfix"> </div>
						</div>
                                            <div class=" address-grid ">
							<div class="address1">
                                                            <h3><a href="ViewUsers.jsp">View Users</a></h3>
							</div>
							<div class="clearfix"> </div>
						</div>

                                            <div class=" address-grid ">
							<div class="address1">
								<h3><a href="">Logout</a></h3>
							</div>
							<div class="clearfix"> </div>
						</div>
</div>
				</div>
				<div class="col-md-6 contact-top" id="mydiv">
                                    <jsp:include page="AdminPanelBody.jsp"/>

				</div>
		
		
		
	</div>
<!--brand-->
                 
		<div class="container">
			<div class="brand">
				<div class="col-md-3 brand-grid">
					<img src="../images/ic.png" class="img-responsive" alt="">
				</div>
				<div class="col-md-3 brand-grid">
					<img src="../images/ic1.png" class="img-responsive" alt="">
				</div>
				<div class="col-md-3 brand-grid">
					<img src="../images/ic2.png" class="img-responsive" alt="">
				</div>
				<div class="col-md-3 brand-grid">
					<img src="../images/ic3.png" class="img-responsive" alt="">
				</div>
				<div class="clearfix"></div>
			</div>
			</div>
<!--//contact-->
<!--brand-->
		
			<!--//brand-->
		
	<!--//content-->
	<!--//footer-->
	        <jsp:include page="../footer.jsp"/>

		<!--//footer-->
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->

	<script src="../js/simpleCart.min.js"> </script>
<!-- slide -->
<script src="../js/bootstrap.min.js"></script>
 
</body>
</html>