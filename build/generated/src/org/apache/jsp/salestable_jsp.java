package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class salestable_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "addprod1.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 
       Class.forName("com.mysql.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/smbs","root","1234");
           PreparedStatement pst=con.prepareStatement("select * from sales");
           ResultSet rs=pst.executeQuery();
           
      out.write("\n");
      out.write("           \n");
      out.write("           \n");
      out.write("           <div class=\"table-wrap\">\n");
      out.write("  <table class=\"table table-xs-responsive table-hover\">\n");
      out.write("    <tr class=\"success\">\n");
      out.write("        <th >Customer Name</th>\n");
      out.write("        <th >Mob No.</th>\n");
      out.write("        <th >Email</th>\n");
      out.write("        <th >Amount</th>\n");
      out.write("        <th >Status</th>\n");
      out.write("        <th >Customer Id</th>\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("     ");

               while(rs.next()){
      out.write("\n");
      out.write("    \n");
      out.write("                <tr >\n");
      out.write("        \n");
      out.write("      \n");
      out.write("  \n");
      out.write("        <td class=\"table-primary\">");
      out.print(rs.getInt(1));
      out.write(" <input type=\"hidden\" name=\"modelNo\" value= ");
      out.print(rs.getInt(1));
      out.write("></td>\n");
      out.write("      \n");
      out.write("        <td class=\"table-light\" >");
      out.print(rs.getString(2));
      out.write("<input type=\"hidden\" name=\"description\" value=");
      out.print(rs.getString(2));
      out.write("></td>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("                   ");
}
      out.write("\n");
      out.write("</tr>                 \n");
      out.write("</table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
