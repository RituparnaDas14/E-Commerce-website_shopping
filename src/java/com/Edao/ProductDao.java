package com.Edao;

import java.sql.*;

public class ProductDao {
     private static ProductDao ld=null;
    public static ProductDao getInstance()
    {
    if(ld==null)
    ld=new ProductDao();
    return ld;
    }

    
    
     public int insertRecord(com.vbeans.ProductBean lb)
    {
       int rows=0;
     
          try {
   Connection c=com.dbconnection.LoadConnection.getConnection();
  PreparedStatement ps = c.prepareStatement("insert into product (brand,price,model,image,image1,image2,gender,description,overview,additionalInfo,review,discount) values (?,?,?,?,?,?,?,?,?,?,?,?)");
          ps.setString(1,lb.getBrand());
           ps.setInt(2,lb.getPrice());
            ps.setString(3,lb.getModel());
             ps.setString(4,lb.getImage());
             ps.setString(5,lb.getImage1());
             ps.setString(6,lb.getImage2());
             ps.setString(7,lb.getGender());
             ps.setString(8,lb.getDescription());
             ps.setString(9,lb.getOverview());
             ps.setString(10,lb.getAdditionalInfo());
             ps.setString(11,lb.getReview());
             ps.setInt(12,lb.getDiscount());

         
              rows=ps.executeUpdate();
       return rows;   
       }catch(Exception e1){System.out.println(e1); 
       return rows;
        }
       
    }
    public int updateRecord(com.vbeans.ProductBean lb,int id)
    {
       int rows=0;
     
          try {
   Connection c=com.dbconnection.LoadConnection.getConnection();
  PreparedStatement ps = c.prepareStatement("update product set brand=?,price=?,model=?,image=?,image1=?,image2=?,gender=?,description=?,overview=?,additionalInfo=?,review=?,discount=? where id=?");
          ps.setString(1,lb.getBrand());
           ps.setInt(2,lb.getPrice());
            ps.setString(3,lb.getModel());
             ps.setString(4,lb.getImage());
             ps.setString(5,lb.getImage1());
             ps.setString(6,lb.getImage2());
             ps.setString(7,lb.getGender());
             ps.setString(8,lb.getDescription());
             ps.setString(9,lb.getOverview());
             ps.setString(10,lb.getAdditionalInfo());
             ps.setString(11,lb.getReview());
             ps.setInt(12,lb.getDiscount());
             ps.setInt(13,id);

         System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
              rows=ps.executeUpdate();System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
       return rows;   
       }catch(Exception e1){System.out.println(e1); 
       return rows;
        }
       
    }
}