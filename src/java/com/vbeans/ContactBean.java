/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.vbeans;
import java.sql.*;


public class ContactBean 
{

private String name;
private String email;
private String subject;
private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



public String insert()
{
    try
    {
        int rows=com.Edao.ContactDao.getInstance().insertRecord(this);
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


