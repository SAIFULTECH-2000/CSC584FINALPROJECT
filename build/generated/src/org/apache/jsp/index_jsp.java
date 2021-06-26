package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.List;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

if(null!=session.getAttribute("username")){
response.sendRedirect("Dashboard.jsp");
}


      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!--\r\n");
      out.write("To change this license header, choose License Headers in Project Properties.\r\n");
      out.write("To change this template file, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Login</title>\r\n");
      out.write("    <link rel = \"icon\" href =\"img/214281.jpg\" type=\"image/x-icon\">\r\n");
      out.write("     <link href=\"dist/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    font-family: Georgia, 'Times New Roman', Times, serif;\r\n");
      out.write("    background: linear-gradient(120deg,#2980b9,#8e44ad);\r\n");
      out.write("    height: 100vh;\r\n");
      out.write("}\r\n");
      out.write(".center{\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top:50%;\r\n");
      out.write("    left:50%;\r\n");
      out.write("    transform: translate(-50%,-50%);\r\n");
      out.write("    width: 400px;\r\n");
      out.write("    background: white;\r\n");
      out.write("}\r\n");
      out.write(".center h1{\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    padding:0 0 20px 0;\r\n");
      out.write("    border-bottom: 1px solid silver;\r\n");
      out.write("}\r\n");
      out.write(".center form{\r\n");
      out.write("    padding: 0 40px;\r\n");
      out.write("    box-sizing:border-box;\r\n");
      out.write("}\r\n");
      out.write("form .txt_field{\r\n");
      out.write("    position: relative;\r\n");
      out.write("    border-bottom: 2px solid #adadad;\r\n");
      out.write("    margin:30px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".txt_field input{\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    padding:0 5px;\r\n");
      out.write("    height: 40px;\r\n");
      out.write("    font-size:16px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    background: none;\r\n");
      out.write("    outline: none;\r\n");
      out.write("}\r\n");
      out.write(".txt_field label{\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    left:5px;\r\n");
      out.write("    color:#adadad;\r\n");
      out.write("    transform: translateY(-50%);\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    pointer-events: none;\r\n");
      out.write("    top:-5px;\r\n");
      out.write("    color:#2691d9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=\"submit\"]{\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 50px;\r\n");
      out.write("    border:1px solid;\r\n");
      out.write("    background-color: #2691d9;\r\n");
      out.write("    color: white;\r\n");
      out.write("    border-radius:25px;\r\n");
      out.write("}\r\n");
      out.write(".centerImg{\r\n");
      out.write("  display: block;\r\n");
      out.write("  margin-left: auto;\r\n");
      out.write("  margin-right: auto;\r\n");
      out.write("  width: 50%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"center\">\r\n");
      out.write("         ");

        String popup =(String) request.getAttribute("message");
        if(popup !=null){
        
      out.write("\r\n");
      out.write("        <font color=\"green\">\r\n");
      out.write("            <p>&nbsp;");
      out.print(popup);
      out.write("</p>\r\n");
      out.write("        </font>\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("        <img src=\"img/214281.jpg\" width=\"100\" height=\"100\"  class=\"centerImg\">\r\n");
      out.write("        <h1>Login</h1>\r\n");
      out.write("    <form action=\"Auth\" method=\"post\">\r\n");
      out.write("    <div class=\"txt_field\">\r\n");
      out.write("    <label>Username</label>\r\n");
      out.write("    <input type=\"text\" name=\"username\" id=\"username\">\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"txt_field\">\r\n");
      out.write("        <label>Password</label>\r\n");
      out.write("        <input type=\"text\" name=\"password\" id=\"password\">\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("            <input type=\"Submit\" name=\"Submit\">\r\n");
      out.write("        </form><br>\r\n");
      out.write("        ");

        List errorMsgs = (List) request.getAttribute("errorMsgs");
        if(errorMsgs!=null){
        
      out.write("\r\n");
      out.write("        <font color=\"red\">\r\n");
      out.write("            <ul>");

                Iterator items = errorMsgs.iterator();
                while(items.hasNext()){
                    String message =(String) items.next();
                
      out.write("\r\n");
      out.write("                <li>\r\n");
      out.write("                    ");
      out.print( message);
      out.write("\r\n");
      out.write("                </li>\r\n");
      out.write("                ");
}
      out.write("\r\n");
      out.write("            </ul>\r\n");
      out.write("        </font>\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
