<%-- 
    Document   : salestable
    Created on : 25 Nov, 2020, 11:16:21 AM
    Author     : utkarsh
--%>
<jsp:include page="addprod1.jsp"></jsp:include>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/listcss.css" rel="stylesheet" type="text/css"/>
        
        <title>JSP Page</title>
    </head>
    <body>
        <% 
       Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smbs","root","1234");
           PreparedStatement pst=con.prepareStatement("select * from sales");
           ResultSet rs=pst.executeQuery();
           %>
           
           
           <div class="table-wrap">
  <table class="table table-xs-responsive table-hover">
    <tr class="success">
        <th >Customer Name</th>
        <th >Mob No.</th>
        <th >Email</th>
        <th >Amount</th>
        <th >Status</th>
        <th >Customer Id</th>
    </tr>
    
     <%
               while(rs.next()){%>
    
                <tr >
        
      
  
        <td class="table-primary"><%=rs.getString(1)%> <input type="hidden" name="cname" value= <%=rs.getString(1)%>></td>
      
        <td class="table-light" ><%=rs.getString(2)%><input type="hidden" name="cnum" value=<%=rs.getString(2)%>></td>
        <td class="table-primary"><%=rs.getString(3)%> <input type="hidden" name="email" value= <%=rs.getString(3)%>></td>
      
        <td class="table-light" ><%=rs.getInt(4)%><input type="hidden" name="total" value=<%=rs.getInt(4)%>></td>
        <td class="table-primary"><%=rs.getString(5)%> <input type="hidden" name="status" value= <%=rs.getString(5)%>></td>
      
        <td class="table-light" ><%=rs.getInt(6)%><input type="hidden" name="cid" value=<%=rs.getInt(6)%>></td>
        
        
                   <%}%>
</tr>                 
</table>
    </body>
</html>
