/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author utkarsh
 */
@WebServlet(urlPatterns = {"/register"})
public class register extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            String a=request.getParameter("fname");
        String b=request.getParameter("lname");
        String c=request.getParameter("sname");
        String d=request.getParameter("email");
        String e=request.getParameter("pass");
           
              Class.forName("com.mysql.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smbs","root","1234");
                PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
                ps.setString(1, a);
                ps.setString(2, b);
                ps.setString(3, c);
                ps.setString(4, d);
                ps.setString(5, e);
                int i=ps.executeUpdate();
                if(i>0){
                out.println("Registered Successfully");
                 RequestDispatcher rd=request.getRequestDispatcher("index.html");
                 rd.forward(request, response);
                 
                }else{
                   
                  
                    RequestDispatcher rd=request.getRequestDispatcher("register");
                 rd.forward(request, response);
                   
                }
               
            
            
            
           
        }
        catch(Exception e){
            System.out.println(e);
            
            
        }
    }



}
