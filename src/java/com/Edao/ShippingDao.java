/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Edao;

import java.sql.*;


/**
 *
 * @author Ira Bhatnagar
 */
public class ShippingDao {
    
 private static ShippingDao ld=null;
    public static ShippingDao getInstance()
    {
    if(ld==null)
    ld=new ShippingDao();
    return ld;
    }
    
    
    public int insertRecord(com.vbeans.ShippingBean lb)
    {
       int rows=0;
     
       try
       {
       Connection c=com.dbconnection.LoadConnection.getConnection();
       PreparedStatement ps = c.prepareStatement("insert into shipping (name,email,address,city,state,country,mobile) values(?,?,?,?,?,?,?)");   
       ps.setString(1,lb.getName());
       ps.setString(2,lb.getEmail());
       ps.setString(3,lb.getAddress());
       ps.setString(4,lb.getCity());
       ps.setString(5,lb.getState());
       ps.setString(6,lb.getCountry());
       ps.setString(7,lb.getMobile());
      
       rows=ps.executeUpdate();
       return rows;   
       }catch(Exception e1){System.out.println(e1); 
       return rows;
        }
       
    }
}
