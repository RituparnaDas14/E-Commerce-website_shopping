<jsp:useBean id="t1" class="com.vbeans.LoginBean"/>
<jsp:setProperty name="t1" property="*"/>
<%
    String str=t1.validate();
            if(str.equals("success"))
            {
                session.setAttribute("email",t1.getEmail());
                response.sendRedirect("index.jsp");
            }
             if(str.equals("admin"))
    {
        session.setAttribute("email",t1.getEmail());
       
 response.sendRedirect("ADMIN1/admipanel.jsp");
    }
    if(str.equals("login"))
    {
        request.setAttribute("msg","username and password not match");
        RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
        rd.forward(request, response);
    }
 
           if(str.equals("error"))
        response.sendRedirect("error.jsp");
  %>


  