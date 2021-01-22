<%-- 
    Document   : ShoppingCart
    Created on : 1 Nov, 2020, 11:56:33 AM
    Author     : utkarsh
--%>
<jsp:include page="addprod1.jsp"></jsp:include>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
    <link href="css/listcss.css" rel="stylesheet" type="text/css"/>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
 
<body>
 


<form method="post" action="customer.jsp">
    <div class="form-inline">
        <input type="text" name="cid" placeholder="Customer Id">
        <input type="text" name="name" placeholder="Customer name">
    <input type="text" name="num" placeholder="Mobile No.">
    <input type="email" name="email" placeholder="Email">
     <div class="select">
                
             <select name="status" id="cars">
                  <option selected disabled>Choose an option</option>
    <option value="Paid">Paid</option>
    <option value="pending">Pending</option>
    
     </select>
    </div>
    </div>
    
   <input type="hidden" name="ftotal" value="${cart.orderTotal}"/>
    <input type="submit" class=" btn1"  value="Confirm" >
</form>
<div class="table-wrap">
  <table class="table table-xs-responsive table-hover">
    <tr class="success">
     
  <tr >
      <th>Model</th>
      <th> Description</th>
    <th>Quantity</th>
    <th> Update</th>
    <th>Delete</th>
    <th>Unit Price</th>
    <th>SubTotal</th>
  </tr>
  <jsp:useBean id="cart" scope="session" class="shoopingcart.CartBean" />
  <c:if test="{cart.lineItemCount==0}">
  <tr>
  <td colspan="4"><font size="2" face="Verdana, Arial, Helvetica, sans-serif">- Cart is currently empty -<br/>
  </tr>
  </c:if>
  <c:forEach var="cartItem" items="${cart.cartItems}" varStatus="counter">
  <form name="item" method="POST" action="CartController">
  <tr>
      <td><c:out value="${cartItem.partNumber}"/></b></td>
      <td> <c:out value="${cartItem.modelDescription}"/></font></td>
      <td><input type='hidden' name='itemIndex' value='<c:out value="${counter.count}"/>'><input type='text' name="quantity" value='<c:out value="${cartItem.quantity}"/>' size='2'> </td><td><input type="submit" class=" btn"  name="action" value="Update"></td>
      <td><input type="submit" name="action" class=" btn"  value="Delete"></font></td>
    <td><c:out value="${cartItem.unitCost}"/></font></td>
    <td><c:out value="${cartItem.totalCost}"/></font></td>
  </tr>
  </form>
  </c:forEach>
  <tr>
    <td colspan="5"> </td>
    <td> </td>
    <th>Total:<c:out  value="${cart.orderTotal}"/></th>
    
  </tr>
  
   
  </table>
    

</body>
</html>