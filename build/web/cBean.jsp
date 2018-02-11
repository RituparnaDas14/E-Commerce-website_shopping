<%@page import="com.dbconnection.LoadConnection"%>
<%@page import="java.sql.*"%>


<%@page import="java.util.Properties"%>
<%@page import="javax.mail.*,javax.mail.internet.*"%>
<jsp:useBean id="t1" class="com.vbeans.ContactBean" scope="session"/>
<jsp:setProperty name="t1" property="*"/>
<%!
 String msg="";
 String to="";
%>
<%
    String str=t1.insert();
            if(str.equals("success"))
                response.sendRedirect("home.jsp");
            else
                response.sendRedirect("error.jsp");
 
            if(str.equals("success"))
                      response.sendRedirect("mailToAdmin.jsp");

            
             if(str.equals("success"))

    to=request.getParameter("email");
   
    try
    {
    Connection c=LoadConnection.getConnection();
    PreparedStatement ps = c.prepareStatement("select * from contact where email=?");
    ps.setString(1,to);
    ResultSet rs=ps.executeQuery();
    if(rs.next())
    {
        msg=rs.getString("message"); 
    }
    } catch(Exception e1)
            {out.println(e1);
            }


  Properties props = new Properties();
  props.put("mail.smtp.host", "smtp.gmail.com");
  props.put("mail.smtp.socketFactory.port", "465");
  props.put("mail.smtp.socketFactory.class",
        	"javax.net.ssl.SSLSocketFactory");
  props.put("mail.smtp.auth", "true");
  props.put("mail.smtp.port", "465");
 
  Session session1 = Session.getInstance(props,
   new javax.mail.Authenticator() {
   protected PasswordAuthentication getPasswordAuthentication() {
   return new PasswordAuthentication("letsfire21@gmail.com","hi2hello");
   }
  });
 
//compose message
  try 
  {
   MimeMessage message = new MimeMessage(session1);
   message.setFrom(new InternetAddress("letsfire21@gmail.com"));
   message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));
   message.setSubject("Thankyou Dear Coustomer");
   message.setText("thankyou for your helpful suggestions,we will be investigating the details of your feedback. Given below is your feedback "+"<br>"+msg);
   
   //send message
   Transport.send(message);
   out.println("message sent successfully");
   } catch (MessagingException e) {throw new RuntimeException(e);}
%>
%>