<%-- 
    Document   : ModelList
    Created on : 1 Nov, 2020, 11:55:19 AM
    Author     : utkarsh
--%>
<jsp:include page="addprod1.jsp"></jsp:include>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
    <link href="css/hnav.css" rel="stylesheet" type="text/css"/>
    <link href="css/listcss.css" rel="stylesheet" type="text/css"/>
</head>
 
<body>
    <% 
       Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smbs","root","1234");
           PreparedStatement pst=con.prepareStatement("select * from product");
           ResultSet rs=pst.executeQuery();
           %>

 <jsp:useBean id="cart" scope="session" class="shoopingcart.CartBean" />
  <c:if test="{cart.lineItemCount==0}">
 
   Cart is currently empty
  </c:if>

  items:<c:out  value="${cart.lineItemCount}"/> <input type="hidden" class="btn"  value="${cart.lineItemCount}"/>
<div class="table-wrap">
  <table class="table table-xs-responsive table-hover">
    <tr class="success">
        <th >ID</th>
        <th >Name</th>
        <th >Quantity</th>
        <th >Price</th>
        
    </tr>
    
  
  <%
               while(rs.next()){%>

    <form name="modelDetail1" method="POST" action="CartController">
        <tr >
        
      
  
        <td class="table-primary"><%=rs.getInt(1)%> <input type="hidden" name="modelNo" value= <%=rs.getInt(1)%>></td>
      
        <td class="table-light" ><%=rs.getString(2)%><input type="hidden" name="description" value=<%=rs.getString(2)%>></td>
        <td class="table-success"><input type="text" size="2" value="1" name="quantity"></td>
     
        <td > <%=rs.getInt(3)%><input type="hidden" name="price" value=<%=rs.getInt(3)%>></td></p><input type="hidden" name="action" value="add">
        
    <td > <input type="submit" class="btn" name="addToCart" value="Add"></td>
      </form>

      
      
      


           
 
                   <%}%>
</tr>                 
</table>
</div>
</body>
</html>