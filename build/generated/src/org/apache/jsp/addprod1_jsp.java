package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addprod1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--\n");
      out.write("To change this license header, choose License Headers in Project Properties.\n");
      out.write("To change this template file, choose Tools | Templates\n");
      out.write("and open the template in the editor.\n");
      out.write("-->\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>TODO supply a title</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("     <link rel=\"stylesheet\" href=\"fonts/material-icon/css/material-design-iconic-font.min.css\">\n");
      out.write("    <!-- Main css -->\n");
      out.write("    <link href=\"css/hnav.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write(" \n");
      out.write("<div class=\"popover\" id=\"menu\">\n");
      out.write(" <div class = 'content'>\n");
      out.write("  <a href=\"\" class=\"close\"></a>\n");
      out.write("   <div class = 'nav'>\n");
      out.write("    <ul class = 'nav_list'>\n");
      out.write("      \n");
      out.write("     \n");
      out.write("     <div class = 'nav_list_item'>\n");
      out.write("\t\t<li><a href=\"addprod.html\">Add Product</a></li>\n");
      out.write("      </div>\n");
      out.write("    <div class = 'nav_list_item'>\n");
      out.write("\t  <li><a href=\"ModelList.jsp\">Products</a></li>\n");
      out.write("      </div>\n");
      out.write("    <div class = 'nav_list_item'>\n");
      out.write("\t  <li><a href=\"ShoppingCart.jsp\">Bill</a></li>\n");
      out.write("      </div>\n");
      out.write("     <div class = 'nav_list_item'>\n");
      out.write("\t\t<li><a href=\"statusup.html\">Update</a></li>\n");
      out.write("      </div>\n");
      out.write("       <div class = 'nav_list_item'>\n");
      out.write("\t  <li><a href=\"salestable.jsp\">Sales table</a></li>\n");
      out.write("      </div>\n");
      out.write("        <div class = 'nav_list_item'>\n");
      out.write("\t  <li><a href=\"logout.jsp\">Logout</a></li>\n");
      out.write("      </div>\n");
      out.write("\t</ul>\n");
      out.write("  </div>\n");
      out.write(" </div>\n");
      out.write(" </div>\n");
      out.write(" \n");
      out.write("\n");
      out.write("       \n");
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
