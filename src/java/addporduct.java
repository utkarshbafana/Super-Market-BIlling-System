/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author utkarsh
 */
@WebServlet(urlPatterns = {"/addporduct"})
//@MultipartConfig(maxFileSize = 16177215) 
public class addporduct extends HttpServlet {

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
          try (PrintWriter out = response.getWriter()) {
      //  InputStream fis = null;
         String a=request.getParameter("pid");
           String b=request.getParameter("pname");
           String c=request.getParameter("price");
          // String d=request.getParameter("path");
           
      /*      Part filePart = request.getPart("path");
        if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());

            // obtains input stream of the upload file
           // fis = filePart.getInputStream();
        }*/
      
          
           
           Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smbs","root","1234");
//            File images= new File(d);
                PreparedStatement ps=con.prepareStatement("insert into product values(?,?,?)");      
                ResultSet rs= null;
                ps.setString(1, a);
                ps.setString(2, b);
                ps.setString(3, c);
               /* if (fis != null) {
                // fetches input stream of the upload file for the blob column
                ps.setBlob(4, fis);
            }
        //        ps.setBinaryStream(4, (InputStream) fis, (int) (images.length()));*/
                int count = ps.executeUpdate();
               if(count>0){
                
                  
                  response.sendRedirect("addprod.html");
               } else{
                  out.print(" Not Inserted Successfully"); 
               }
               
            
        }catch(Exception e){
            System.out.println(e);
        }
        



        
        
    

    }   

}
