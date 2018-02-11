<%@page import="com.oreilly.servlet.MultipartRequest"%>
<jsp:useBean id="p1" class="com.vbeans.ProductBean" scope="session"/>
<jsp:setProperty name="p1" property="*"/>

<%
 
    MultipartRequest m=new MultipartRequest(request,"C:\\Users\\Ira Bhatnagar\\Documents\\NetBeansProjects\\shoppingWeb\\web\\images",10*1024*1024);
    int id=Integer.parseInt(m.getParameter("id"));
    if(id==0)
    {
      String brand=m.getParameter("brand");
      int price=Integer.parseInt(m.getParameter("price"));
        String model=m.getParameter("model");
         String image=m.getOriginalFileName("image");
          String image1=m.getOriginalFileName("image1");
           String image2=m.getOriginalFileName("image2");
        String gender=m.getParameter("gender");
         String description=m.getParameter("description");
          String overview=m.getParameter("overview");
           String additionalInfo=m.getParameter("additionalInfo");
            String review=m.getParameter("review");
             int discount=Integer.parseInt(m.getParameter("discount"));

         
          out.println("uploaded successfully");
      

    p1.setBrand(brand);p1.setPrice(price);p1.setModel(model);p1.setImage(image);p1.setImage1(image1);p1.setImage2(image2);p1.setGender(gender);
    p1.setDescription(description);p1.setOverview(overview);p1.setAdditionalInfo(additionalInfo);p1.setReview(review);p1.setDiscount(discount);
     String str=p1.insert();
    if(str.equals("success"))
        response.sendRedirect("AdminPanel.jsp");
    else
        response.sendRedirect("error.jsp");
    }
    else
    {
    
      String brand=m.getParameter("brand");
      int price=Integer.parseInt(m.getParameter("price"));
        String model=m.getParameter("model");
         String image=m.getOriginalFileName("image");
          String image1=m.getOriginalFileName("image1");
           String image2=m.getOriginalFileName("image2");
        String gender=m.getParameter("gender");
         String description=m.getParameter("description");
          String overview=m.getParameter("overview");
           String additionalInfo=m.getParameter("additionalInfo");
            String review=m.getParameter("review");
             int discount=Integer.parseInt(m.getParameter("discount"));

         
          out.println("uploaded successfully");
      

    p1.setBrand(brand);p1.setPrice(price);p1.setModel(model);p1.setImage(image);p1.setImage1(image1);p1.setImage2(image2);p1.setGender(gender);
    p1.setDescription(description);p1.setOverview(overview);p1.setAdditionalInfo(additionalInfo);p1.setReview(review);p1.setDiscount(discount);
     String str=p1.update(id);
    if(str.equals("success"))
        response.sendRedirect("AdminPanel.jsp");
    else
        response.sendRedirect("error.jsp");    
    }
%>
