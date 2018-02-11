

package com.vbeans;


import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProductBean {
     private String brand;
     private int price;
    private String model;
    private String image;
    private String image1;
    private String image2;
    private String gender;
     private String description;
    private String overview;
    private String additionalInfo;
    private String review;
        private int discount;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    

    public String insert()
{
    try
    {
        int rows=com.Edao.ProductDao.getInstance().insertRecord(this);
        if(rows>0)
        {
            return "success";
        }
        else
        {
            return "error";
        }
    } catch(Exception e1){System.out.println(e1);
           return "error";
     }		
    }
    
    public String update(int id)
{
    try
    {
        int rows=com.Edao.ProductDao.getInstance().updateRecord(this,id);
        if(rows>0)
        {
            return "success";
        }
        else
        {
            return "error";
        }
    } catch(Exception e1){System.out.println(e1);
           return "error";
     }		
    }

}