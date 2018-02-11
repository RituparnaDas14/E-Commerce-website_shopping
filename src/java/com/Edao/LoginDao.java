package com.Edao;
import java.sql.*;
public  class LoginDao
{

    private static LoginDao ld=null;
    public static LoginDao getInstance()
    {
    if(ld==null)
    ld=new LoginDao();
    return ld;
    }

    public ResultSet verifyLogin(com.vbeans.LoginBean lb)
    {
    try
    {
    Connection c=com.dbconnection.LoadConnection.getConnection();
    PreparedStatement ps = c.prepareStatement("select * from register where email=? and password=?");
    ps.setString(1,lb.getEmail());
    ps.setString(2,lb.getPass());
    ResultSet rs=ps.executeQuery();
    return rs;
    } catch(Exception e1)
            {System.out.println(e1); 
            return null; 
            }
    }
}
