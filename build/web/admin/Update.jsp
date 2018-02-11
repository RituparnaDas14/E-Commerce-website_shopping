
<%@page import="com.dbconnection.LoadConnection"%>
<%@page import="java.sql.*"%>
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
<script src="../js/jstarbox.js"></script>
	<link rel="stylesheet" href="../css/jstarbox.css" type="text/css" media="screen" charset="utf-8" />
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

<!--banner-->

			<div class="contact">
					
				<div class="contact-form">
					<div class="container">
					
	
				<div class="col-md-6 contact-top">
	 <%
         int id=Integer.parseInt(request.getParameter("ok"));
                                        try
                                            {
                                            Connection c=LoadConnection.getConnection();
                                            PreparedStatement ps = c.prepareStatement("select * from product where id=?");
                                            ps.setInt(1, id);
                                           
                                            ResultSet rs=ps.executeQuery();
                                            if(rs.next())
                                            {%>
	
		
					<h3>Update Product</h3>
                                        <form action="productBean.jsp" method="post" enctype="multipart/form-data">
                                            <input type="hidden" name="id" value="<%=id%>"/>
						<div>
							<span>Brand</span>		
                                                        <input type="text" name="brand" value="<%=rs.getString("brand")%>"/>						
                                                </div>
                                                  <div>
							<span>Gender</span><br>		
                                                        <input type="radio" value="<%=rs.getString("gender")%>" name="gender"/>Men	
                                                        <input type="radio" value="<%=rs.getString("gender")%>" name="gender" />Women						

						</div>
						<div>
							<span>Price</span>		
                                                        <input type="text" value="<%=rs.getString("price")%>" name="price" >						
						</div>
						<div>
							<span>Model</span>		
                                                        <input type="text" value="<%=rs.getString("model")%>" name="model">	
						</div>
                                                  <div>
							<span>Description</span>		
                                                        <input type="text" name="description" value="<%=rs.getString("description")%>" required/>						
                                                </div>
                                                  <div>
							<span>Quick Overview</span>		
                                                        <input type="text" name="overview" value="<%=rs.getString("overview")%>" required/>						
                                                </div>
                                                  <div>
							<span>Additional Information</span>		
                                                        <input type="text" name="additionalInfo" value="<%=rs.getString("additionalInfo")%>" required/>						
                                                </div>
                                                  <div>
							<span>Review</span>		
                                                        <input type="text" name="review" value="<%=rs.getString("review")%>" required/>						
                                                </div>
                                                                                  <div>
							<span>Discount</span>		
                                                        <input type="text" value="<%=rs.getString("discount")%>" name="discount" >						
						</div>
		
						<div>
							<span> Image</span>		
                                                        <input type="file" name="image"  required/>
						</div>
                                                  <div>
							<span> Image1</span>		
                                                        <input type="file" name="image1" required/>
						</div>
                                                  <div>
							<span> Image2</span>		
                                                        <input type="file" name="image2" required/>
						</div>
						<label class="hvr-skew-backward">
								<input type="submit" value="Update Item" >
						</label>
           
                                                </form>	
                                                <%}
                                            } catch(Exception e1)
                                                    {out.println(e1);
                                                    }
                                        %>
   
				</div>
		<div class="clearfix"></div>
		</div>
		</div>
		   
		
	</div>

<!--//contact-->
<!--brand-->
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
			<!--//brand-->
		
			<!--//brand-->
		
	<!--//content-->
	<!--//footer-->
	        <jsp:include page="../footer.jsp"/>

		<!--//footer-->
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->

	<script src="js/simpleCart.min.js"> </script>
<!-- slide -->
<script src="js/bootstrap.min.js"></script>
 
</body>
</html>