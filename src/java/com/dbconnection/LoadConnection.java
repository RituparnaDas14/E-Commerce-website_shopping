package com.dbconnection;
import java.sql.*;
public class LoadConnection
{
    private static Connection  con=null;
    public static Connection getConnection()
    {
        try
        {
        String driver=System.getProperty("dbdriver");
        String url=System.getProperty("dburl");
        String user=System.getProperty("dbuser");
        String password=System.getProperty("dbpassword");

        if(con==null)
        {
        Class.forName(driver);
        con=DriverManager.getConnection(url,user,password);
        }
        return con;
        }catch(Exception e)
        {
            return con;
        }

    }

}