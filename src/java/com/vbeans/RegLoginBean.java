package com.vbeans;
import java.sql.*;
 public  class RegLoginBean
{

private String username;
private String fname;
private String lname;
private String email;
private String mobile;

private String pass;
public void setUsername(String username)
{
this.username=username;
}
public void setFname(String fname)
{
this.fname=fname;
}
public void setPass(String pass)
{
this.pass=pass;
}
public void setLname(String lname)
{
this.lname=lname;
}
public void setEmail(String email)
{
this.email=email;
}
public void setMobile(String mobile)
{
this.mobile=mobile;
}




public String getUsername()
{

return username;
}
public String getPass()
{

return pass;
}
public String getFname()
{
return fname;
}
public String getLname()
{
return lname;
}
public String getEmail()
{
return email;
}
public String getMobile()
{
return mobile;
}



public String insert()
{
    try
    {
        int rows=com.Edao.RegDao.getInstance().insertRecord(this);
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
