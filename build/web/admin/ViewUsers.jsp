   
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
<title>Shopin A Ecommerce Category Flat Bootstrap Responsive Website Template | Short Codes :: w3layouts</title>
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
<!--header-->
<jsp:include page="../header.jsp"/>

	
	<!--table-->
	 <div class="page-header">
        <h3>Users</h3>
      </div>
  
  <div class="bs-example" data-example-id="simple-table">
    <table class="table">
      <thead>
        <tr>
         
          <th>First Name</th>
          <th>Last Name</th>
          <th>Username</th>
            <th>Email</th>
               <th>Mobile</th>   
               <th>Password</th>
        </tr>
      </thead>
      <tbody>
          <%
                                        try
                                            {
                                            Connection c=LoadConnection.getConnection();
                                            PreparedStatement ps = c.prepareStatement("select * from register");
                                           
                                            ResultSet rs=ps.executeQuery();
                                            while(rs.next())
                                            {%>
                                        
        <tr>
       
          <td><%=rs.getString("fname")%></td>
          <td><%=rs.getString("lname")%></td>
          <td><%=rs.getString("username")%></td>
          <td><%=rs.getString("email")%></td>
          <td><%=rs.getString("mobile")%></td>
          <td><%=rs.getString("password")%></td>
        
        </tr>
        
        <%}
                                            } catch(Exception e1)
                                                    {out.println(e1);
                                                    }
                                        %>
      </tbody>
    </table>
  </div><!-- /example -->
	<!--//table-->
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
			<!--//brand-->
			</div>
			
		</div>
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