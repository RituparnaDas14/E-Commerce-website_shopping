/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Edao;
import java.sql.*;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author Ira Bhatnagar
 */
public class ContactDao {
  

 
	
    private static ContactDao ld=null;
    public static ContactDao getInstance()
    {
    if(ld==null)
    ld=new ContactDao();
    return ld;
    }
    
    
    public int insertRecord(com.vbeans.ContactBean lb)
    {
       int rows=0;
     
       try
       {
       Connection c=com.dbconnection.LoadConnection.getConnection();
       PreparedStatement ps = c.prepareStatement("insert into contact values(?,?,?,?)");   
       ps.setString(1,lb.getName());
       ps.setString(2,lb.getEmail());
       ps.setString(3,lb.getSubject());
       ps.setString(4,lb.getMessage());
      
       rows=ps.executeUpdate();
       return rows;   
       }catch(Exception e1){System.out.println(e1); 
       return rows;
        }
       
    }
}
    

