package com.Edao;
import java.sql.*;
 public  class RegDao
{
	
    private static RegDao ld=null;
    public static RegDao getInstance()
    {
    if(ld==null)
    ld=new RegDao();
    return ld;
    }
    
    
    public int insertRecord(com.vbeans.RegLoginBean lb)
    {
       int rows=0;
     
       try
       {
       Connection c=com.dbconnection.LoadConnection.getConnection();
       PreparedStatement ps = c.prepareStatement("insert into register values(?,?,?,?,?,?,?)");   
       ps.setString(1,lb.getUsername());
       ps.setString(2,lb.getFname());
       ps.setString(3,lb.getLname());
       ps.setString(4,lb.getEmail());
       ps.setString(5,lb.getMobile());
       ps.setString(6,lb.getPass());
        ps.setString(7,"user");

       rows=ps.executeUpdate();
       return rows;   
       }catch(Exception e1){System.out.println(e1); 
       return rows;
        }
       
    }
}