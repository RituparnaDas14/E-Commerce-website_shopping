
<%@page import="java.util.ArrayList"%>
<%@page import="com.dbconnection.LoadConnection"%>
<%@page import="java.sql.*;"%>
        

<!--header-->
<div class="header">
<div class="container">
		<div class="head">
			<div class=" logo">
				<a href="index.jsp"><img src="images/logo.png" alt=""></a>	
			</div>
		</div>
	</div>
	<div class="header-top" >
		<div class="container">
		<div class="col-sm-5 col-md-offset-2  header-login">
					<ul >
                                            
                                               <%
                                                String name="";
                                                String str=(String)session.getAttribute("email");
                                                   try
                                                  {
                                                         Connection c=LoadConnection.getConnection();
                                                         PreparedStatement ps = c.prepareStatement("select * from register where email=?");
                                                                 ps.setString(1,str);
                                                             ResultSet rs=ps.executeQuery();
                                                         if(rs.next())
                                                          {
                                                              name=rs.getString("username"); 
                                                          }
                                                          } catch(Exception e1)
                                                       {out.println(e1);
                                                          }
                                                if(str==null)
                                                {%>    
                                                
                                            <li><a href="login.jsp">Login</a ></li>                                           
                                            <li><a href="register.jsp">Register</a></li>
                                      
                                             <li><a id="popup_window" data-popup-target="#example-popup" >login</a></li>
                        <li><a id="popup_window" data-popup-target="#example-popup1">reg</a></li>
                                              <%  }
                                                else
                                                {%>
                                            <li><a href="checkout.jsp">Checkout</a></li>
                                            <li><a href="logout.jsp">Logout</a>  <label style="color: white;">   welcome:  <%=name%></label></li> 
                                             
                                               <% }
                                            %>
						
					</ul>
				</div>
				
			
                       
				<div class="clearfix"> </div>
		</div>
		</div>
		
		<div class="container">
		
			<div class="head-top">
			
		 <div class="col-sm-8 col-md-offset-2 h_menu4">
				<nav class="navbar nav_bottom" role="navigation">
 
 <!-- Brand and toggle get grouped for better mobile display -->
  <div class="navbar-header nav_2">
      <button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
     
   </div> 

   <!-- Collect the nav links, forms, and other content for toggling -->
    <div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
        <ul class="nav navbar-nav nav_1">
            <li><a class="color" href="index.jsp">Home</a></li>
            
    		<li class="dropdown mega-dropdown active">
			    <a class="color1" href="#" class="dropdown-toggle" data-toggle="dropdown">Women<span class="caret"></span></a>				
				<div class="dropdown-menu ">
                    <div class="menu-top">
						<div class="col1">
							<div class="h_nav">
								<h4>Clothing</h4>
									<ul>
                                                                            <li><a onclick="showProduct('shirt','Women')" >Shirt</a></li>
										<li><a onclick="showProduct('Tshirt','Women')">Tshirt</a></li>
                                                                                <li><a onclick="showProduct('Coat','Women')">Jackets & Coats</a></li>
										<li><a onclick="showProduct('Jeans','Women')">Jeans</a></li>
										
										
									</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Footwear</h4>
								<ul>
                                                                  <li><a onclick="showProduct('Shoes','Women')">Shoes, Boots & Trainers</a></li>

										
									</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Accessories</h4>
									<ul>
                                                                           <li><a onclick="showProduct('Sunglasses','Women')">Sunglasses</a></li>
                                                                   <li><a onclick="showProduct('Hat','Women')">Caps & Hats</a></li>	
                                                                  <li><a onclick="showProduct('Jewelry','Women')">Jewelery</a></li>
                                                                   <li><a onclick="showProduct('Bag','Women')">Bags</a></li>
</ul>	
								
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Featured</h4>
								<ul>
                                                                           <li><a onclick="showProduct('Sunglasses','Women')">Sunglasses</a></li>
									 <li><a onclick="showProduct('shirt','Women')" >Shirt</a></li>
										<li><a onclick="showProduct('Tshirt','Women')">T-shirt</a></li>
                                                                                <li><a onclick="showProduct('Coat','Women')">Jackets & Coats</a></li>
										<li><a onclick="showProduct('Jeans','Women')">Jeans</a></li>								</ul>	
							</div>							
						</div>
						<div class="col1 col5">
						<img src="images/me.png" class="img-responsive" alt="">
						</div>
						<div class="clearfix"></div>
					</div>                  
				</div>				
			</li>
                            		<li class="dropdown mega-dropdown active">

			    <a class="color1" href="#" class="dropdown-toggle" data-toggle="dropdown">Men<span class="caret"></span></a>				
				<div class="dropdown-menu ">
                    <div class="menu-top">
						<div class="col1">
							<div class="h_nav">
								<h4>Clothing</h4>
									<ul>
                                                                            <li><a onclick="showProduct('shirt','men')" >Shirt</a></li>
										<li><a onclick="showProduct('Tshirt','men')" >T-shirt</a></li>
                                                                                <li><a onclick="showProduct('Coat','men')" >Jackets & Coats</a></li>
										<li><a onclick="showProduct('Jeans','men')" >Jeans</a></li>
										
										
									</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Footwear</h4>
								<ul>
                                                                  <li><a onclick="showProduct('Shoes','men')" >Shoes, Boots & Trainers</a></li>

										
									</ul>	
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Accessories</h4>
									<ul>
                                                                           <li><a onclick="showProduct('Sunglasses','men')" >Sunglasses</a></li>
                                                                   <li><a onclick="showProduct('Hat','men')" >Caps & Hats</a></li>	
                                                                  <li><a onclick="showProduct('Jewelry','men')" >Jewelery</a></li>
</ul>	
								
							</div>							
						</div>
						<div class="col1">
							<div class="h_nav">
								<h4>Featured</h4>
								<ul>
                                                                           <li><a onclick="showProduct('Sunglasses','men')" >Sunglasses</a></li>
									 <li><a onclick="showProduct('shirt','men')" >Shirt</a></li>
										<li><a onclick="showProduct('Tshirt','men')" >Tshirt</a></li>
                                                                                <li><a onclick="showProduct('Coat','men')" >Jackets & Coats</a></li>
										<li><a onclick="showProduct('Jeans','men')" >Jeans</a></li>								</ul>	
							</div>							
						</div>
						<div class="col1 col5">
						<img src="images/me1.png" class="img-responsive" alt="">
						</div>
						<div class="clearfix"></div>
					</div>                  
				</div>				
			</li>
                        <li><a class="color3" href="product.jsp">Sale</a></li>
                        <li><a class="color4" href="404.jsp">About</a></li>
                        <li><a class="color6" href="contact.jsp">Contact</a></li>
        </ul>
     </div><!-- /.navbar-collapse -->

</nav>
			</div>
			<div class="col-sm-2 search-right">
				<ul class="heart">
				<li>
                                    <a href="wishlist.jsp" >
				<span class="glyphicon glyphicon-heart" aria-hidden="true"></span>
				</a></li>
                                <li><a class="play-icon popup-with-zoom-anim" href="#small-dialog"><i class="glyphicon glyphicon-search"> 
                                           
                                        </i></a></li>
					</ul>
 <%                           
ArrayList al=(ArrayList)application.getAttribute("cartdetail");

if(al==null)
{%>
<div class="cart box_1">
                                            <a href="checkout.jsp">
						<h3> <div class="total">
							<span class="simpleCart_total"></span></div>
							<img src="images/cart.png" alt=""/></h3>
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">Empty Cart</a></p>

					</div>
<%}
else
{%>
   <div class="cart box_1">
                                            <a href="checkout.jsp">
						<h3> 
                                                    
                                                    <div class="total">
							<span class="simpleCart_total"></span></div>
							<img src="images/cart.png" alt=""/></h3>
						</a>
						<p><a href="javascript:;" class="simpleCart_empty">Empty Your Cart </a></p>
                                                <p><a href="checkout.jsp" class="simpleCart_empty">Added Item:<%=al.size()%> </a></p>

					</div> 
<%}%>
					
					<div class="clearfix"> </div>
					
						<!----->

						<!---pop-up-box---->					  
			<link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
			<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
			<!---//pop-up-box---->
			<div id="small-dialog" class="mfp-hide">
				<div class="search-top">
					<div class="login-search">
						<input type="submit" value="">
						<input type="text" value="Search.." onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'Search..';}else{check1(this.value);}">		
					</div>
					<p>Shopin</p>
				</div>				
			</div>
                        <script>
                            function check1(a)
                            {
                                window.location.href="search.jsp?k="+a;
                            }
                        </script>
		 <script>
			$(document).ready(function() {
			$('.popup-with-zoom-anim').magnificPopup({
			type: 'inline',
			fixedContentPos: false,
			fixedBgPos: true,
			overflowY: 'auto',
			closeBtnInside: true,
			preloader: false,
			midClick: true,
			removalDelay: 300,
			mainClass: 'my-mfp-zoom-in'
			});
																						
			});
		</script>		
						<!----->
			</div>
			<div class="clearfix"></div>
		</div>	
	</div>	
</div>