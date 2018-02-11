   <%@page import="com.dbconnection.LoadConnection"%>
<%@page import="java.sql.*"%>
<div class="a2a_kit a2a_kit_size_32 a2a_floating_style a2a_vertical_style" style="left: 0px; top: 150px;">
    <a class="a2a_button_facebook"></a>
    <a class="a2a_button_twitter"></a>
    <a class="a2a_button_google_plus"></a>
    <a class="a2a_button_pinterest"></a>
    <a class="a2a_dd" href="https://www.addtoany.com/share"></a>
</div>
<div class="content">
			<div class="container">
                            <!--content-->
		
				<div class="content-top">
					<div class="col-md-6 col-md">
						<div class="col-1">
                                                    <a href="product.jsp" class="b-link-stroke b-animate-go  thickbox">
		   <img src="images/pi.jpg" class="img-responsive" alt=""/><div class="b-wrapper1 long-img"><p class="b-animate b-from-right    b-delay03 ">Fashion</p><label class="b-animate b-from-right    b-delay03 "></label><h3 class="b-animate b-from-left    b-delay03 ">Trendy</h3></div></a>

							<!---<a href="single.html"><img src="images/pi.jpg" class="img-responsive" alt=""></a>-->
						</div>
						<div class="col-2">
							<span>Hot Deal</span>
                                                        <h2><a href="product.jsp">Luxurious Clothes Trendy</a></h2>
                                                        <a href="product.jsp" class="buy-now">Buy Now</a>
						</div>
					</div>
					<div class="col-md-6 col-md1">
						<div class="col-3">
                                                    <a href="product.jsp"><img src="images/pi1.jpg" class="img-responsive" alt="">
							<div class="col-pic">
								<p>Clothing</p>
								<label></label>
								<h5>For Men</h5>
							</div></a>
						</div>
						<div class="col-3">
                                                    <a href="product.jsp"><img src="images/pi2.jpg" class="img-responsive" alt="">
							<div class="col-pic">
								<p>Clothing</p>
								<label></label>
								<h5>For Kids</h5>
							</div></a>
						</div>
						<div class="col-3">
                                                    <a href="product.jsp"><img src="images/pi3.jpg" class="img-responsive" alt="">
							<div class="col-pic">
								<p>Clothing</p>
								<label></label>
								<h5>For Women</h5>
							</div></a>
						</div>
					</div>
					<div class="clearfix"></div>
				</div>

				
				<!--products-->
			<div class="content-mid">
				<h3>Trending Items</h3>
				<label class="line"></label>
				<div class="mid-popular">
					<%
                                        try
                                            {
                                            Connection c=LoadConnection.getConnection();
                                            PreparedStatement ps = c.prepareStatement("select * from product where id > (select MAX(id) -3 FROM product) ");
                                           
                                            ResultSet rs=ps.executeQuery();
                                            while(rs.next())
                                            {%>
                                              	<div class="col-md-3 item-grid simpleCart_shelfItem">
					<div class=" mid-pop">
					<div class="pro-img">
                                            <img src="images/<%=rs.getString("image")%>" class="img-responsive" alt="">
						<div class="zoom-icon ">
						<a class="picture" href="images/<%=rs.getString("image")%>" rel="title" class = "b-link-stripe b-animate-go  thickbox"><i class="glyphicon glyphicon-search icon "></i></a>
                                                <a href="single.jsp?ok=<%=rs.getInt("id")%>"><i class="glyphicon glyphicon-menu-right icon"></i></a>
						</div>
						</div>
						<div class="mid-1">
						<div class="women">
						<div class="women-top">
                                                    <span><%=rs.getString("brand")%></span><br>
							<span><%=rs.getString("gender")%></span>
                                                        <h6><%=rs.getString("model")%></h6>
							</div>
							<div class="img item_add">
								<a href="#"><img src="images/ca.png" alt=""></a>
							</div>
							<div class="clearfix"></div>
							</div>
							<div class="mid-2">
								<p ><label>$100.00</label><em class="item_price">$<%=rs.getString("price")%></em></p>
								  <div class="block">
									<div class="starbox small ghosting"> </div>
								</div>
								
								<div class="clearfix"></div>
							</div>
							
						</div>
					</div>
					</div>
                                            <%}
                                            } catch(Exception e1)
                                                    {out.println(e1);
                                                    }
                                        %>
				
					<div class="clearfix"></div>
				</div>
			</div>
			<!--//products-->
			<!--brand-->
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
			<!--//brand-->
			</div>
			
		</div>