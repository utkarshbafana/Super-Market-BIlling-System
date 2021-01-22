/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author utkarsh
 */
@WebServlet(urlPatterns = {"/update"})
public class update extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            HttpSession session = request.getSession();
            String a=request.getParameter("cid");
            String b=request.getParameter("status");
            String c= request.getParameter("cnum");
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/smbs","root","1234");
            PreparedStatement ps=con.prepareStatement("update sales set status=? where cid=?");
           ps.setString(2, a);
            ps.setString(1, b);
           
             int i=ps.executeUpdate();
                     if(i>0){
          PreparedStatement ps1=con.prepareStatement("select * from sales where cid=?");
                     ps1.setString(1, a);

                     ResultSet rs=ps1.executeQuery();
 while(rs.next()){
    
        String p = rs.getString(1);
        String q = rs.getString(2);
        Integer f = rs.getInt(4);
       String s = rs.getString(5);
        Twilio.init("AC59627eb05c9665db59e9216781fe7789","44be4323f8f25bb33833a508cb176ce5");
Message message = Message.creator(
    new PhoneNumber("+91"+q),
    new PhoneNumber("+13342139136"),
    "Dear "+p+", Your Total amount is "+f+" and Your amount has been "+s)
.create();                    
                         
  
response.sendRedirect("statusup.html");
                   }

                


                     }
            
            
        }catch(Exception e){
            System.out.println(e);
        }
    }



}
