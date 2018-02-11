<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@page import="com.cart.Cart"%>
<%@page import="com.cart.CartItem"%>

<!DOCTYPE html>
<html>
<head>
<title>Shopin A Ecommerce Category Flat Bootstrap Responsive Website Template | Checkout :: w3layouts</title>
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
<!--//theme-style-->
<script src="js/jquery.min.js"></script>
<!--- start-rate---->
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
<!--header-->
<jsp:include page="header.jsp"/>
<!--banner
<div class="banner-top">
	<div class="container">
		<h1>Single</h1>
		<em></em>
                <h2><a href="index.jsp">Home</a><label>/</label>Single</a></h2>
	</div>
</div>-->
<jsp:useBean id="crt" class="com.cart.Cart" scope="session"/>
<jsp:setProperty name="crt" property="*" />

<%
     String str=(String)session.getAttribute("email");
    if(str==null)
    {
     response.sendRedirect("index.jsp");
    }
if(crt.getBrand()=="")
{
out.println("<div align='center'>Welcome</div>");
}


ArrayList al=(ArrayList)session.getAttribute("cartdetail");

if(al==null)
{
//out.println("Please add the material in the cart");
out.println("<font size='+1' color='#FGHTRE'>Cart is Empty</font>");

}
 %>


<div class="container">
	<div class="check-out">
	<div class="bs-example4" data-example-id="simple-responsive-table">
    <div class="table-responsive">
    	    <table class="table-heading simpleCart_shelfItem">
		  <tr>
			<th class="table-grid">Item</th>
					
			<th>Prices</th>
			<th >Delivery </th>
			<th>Subtotal</th>
		  </tr>
 <%
Iterator it=al.iterator();
int i=0;
double grant_total=0.0;
out.println("<form action='updatecart.jsp'>");
while(it.hasNext())
{
	

	CartItem c=(CartItem)it.next();	
	double total=c.getPrice()*c.getQuantity();	
	grant_total+=total;
	i++;
        %>
		  <tr class="cart-header">

                      <td class="ring-in"><a href="#" class="at-in"><img src="images/<%=c.getImage() %>" class="img-responsive" alt=""></a>
			<div class="sed">
                            <h5><a href="#"><%=c.getBrand() %></a></h5>
				<p>(<%=c.getDescription() %> ) </p>
			
			</div>
			<div class="close1"> </div></td>
			<td>$<%=c.getPrice()%></td>
			<td>FREE SHIPPING</td>
			<td class="item_price">$<%=grant_total%></td>
                        <td class="add-check"><a class="item_add hvr-skew-backward" href="removecart.jsp?index=<%=i%>">Delete</a></td>

			
		  </tr>
		 <%}%>
		  
	</table>
	</div>
	</div>
	<div class="produced">
            <a href="shipping.jsp" class="hvr-skew-backward">Proceed To Buy</a>
	 </div>
    </div>
</div>

<!--//login-->
<!--brand-->
		<div class="container">
			<div class="brand">
				<div class="col-md-3 brand-grid">
					<img src="images/ic.png" class="img-responsive" alt="">
				</div>
				<div class="col-md-3 brand-grid">
					<img src="images/ic1.png" class="img-responsive" alt="">
				</div>
				<div class="col-md-3 brand-grid">
					<img src="images/ic2.png" class="img-responsive" alt="">
				</div>
				<div class="col-md-3 brand-grid">
					<img src="images/ic3.png" class="img-responsive" alt="">
				</div>
				<div class="clearfix"></div>
			</div>
			</div>
			<!--//brand-->
			
	<!--//content-->
	<!--//footer-->
        <jsp:include page="footer.jsp"/>
		<!--//footer-->
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->

	<script src="js/simpleCart.min.js"> </script>
<!-- slide -->
<script src="js/bootstrap.min.js"></script>
<!--login-->
	<script>$(document).ready(function(c) {
					$('.close1').on('click', function(c){
						$('.cart-header').fadeOut('slow', function(c){
							$('.cart-header').remove();
						});
						});	  
					});
			   </script>
<script>$(document).ready(function(c) {
					$('.close2').on('click', function(c){
						$('.cart-header1').fadeOut('slow', function(c){
							$('.cart-header1').remove();
						});
						});	  
					});
			   </script>
			   <script>$(document).ready(function(c) {
					$('.close3').on('click', function(c){
						$('.cart-header2').fadeOut('slow', function(c){
							$('.cart-header2').remove();
						});
						});	  
					});
			   </script> 
</body>
</html>