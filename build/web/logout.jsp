<%-- 
    Document   : logout
    Created on : 6 Dec, 2020, 12:11:00 PM
    Author     : utkarsh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            session.invalidate();
        RequestDispatcher  rs= request.getRequestDispatcher("login.html");
        rs.forward(request, response);
        
        %>
    </body>
</html>
