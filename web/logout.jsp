<jsp:useBean id="t1" class="com.vbeans.LoginBean" scope="session"/>
<%
session.invalidate();
response.sendRedirect("index.jsp");

%>