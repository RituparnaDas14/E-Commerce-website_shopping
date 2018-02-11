             <%@page import="com.dbconnection.LoadConnection"%>
<%@page import="java.sql.*"%>
<%
             int id=Integer.parseInt(request.getParameter("id"));
             String str=request.getParameter("col");

                                        try
                                            {
                                            Connection c=LoadConnection.getConnection();
                                            PreparedStatement ps = c.prepareStatement("select "+str+" from product where id=?");
                                            ps.setInt(1, id);
                                           
                                            ResultSet rs=ps.executeQuery();
                                            while(rs.next())
                                            {%>
                                            <div class="tab-pane active text-style" id="tab1">
 <div class="facts">
									  <p > <%=rs.getString(str)%></p>
										        
							        </div>

</div>

                                            <%}
                                            } catch(Exception e1)
                                                    {out.println(e1);
                                                    }
                                        %>