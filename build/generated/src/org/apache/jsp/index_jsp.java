package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>Document</title>\n");
      out.write("<style>\n");
      out.write("body{\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    font-family: Georgia, 'Times New Roman', Times, serif;\n");
      out.write("    background: linear-gradient(120deg,#2980b9,#8e44ad);\n");
      out.write("    height: 100vh;\n");
      out.write("}\n");
      out.write(".center{\n");
      out.write("    position: absolute;\n");
      out.write("    top:50%;\n");
      out.write("    left:50%;\n");
      out.write("    transform: translate(-50%,-50%);\n");
      out.write("    width: 400px;\n");
      out.write("    background: white;\n");
      out.write("}\n");
      out.write(".center h1{\n");
      out.write("    text-align: center;\n");
      out.write("    padding:0 0 20px 0;\n");
      out.write("    border-bottom: 1px solid silver;\n");
      out.write("}\n");
      out.write(".center form{\n");
      out.write("    padding: 0 40px;\n");
      out.write("    box-sizing:border-box;\n");
      out.write("}\n");
      out.write("form .txt_field{\n");
      out.write("    position: relative;\n");
      out.write("    border-bottom: 2px solid #adadad;\n");
      out.write("    margin:30px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".txt_field input{\n");
      out.write("    width: 100%;\n");
      out.write("    padding:0 5px;\n");
      out.write("    height: 40px;\n");
      out.write("    font-size:16px;\n");
      out.write("    border: none;\n");
      out.write("    background: none;\n");
      out.write("    outline: none;\n");
      out.write("}\n");
      out.write(".txt_field label{\n");
      out.write("    position: absolute;\n");
      out.write("    left:5px;\n");
      out.write("    color:#adadad;\n");
      out.write("    transform: translateY(-50%);\n");
      out.write("    font-size: 16px;\n");
      out.write("    pointer-events: none;\n");
      out.write("    top:-5px;\n");
      out.write("    color:#2691d9;\n");
      out.write("}\n");
      out.write("\n");
      out.write("input[type=\"submit\"]{\n");
      out.write("    width: 100%;\n");
      out.write("    height: 50px;\n");
      out.write("    border:1px solid;\n");
      out.write("    background-color: #2691d9;\n");
      out.write("    color: white;\n");
      out.write("    border-radius:25px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"center\">\n");
      out.write("        <h1>Login</h1>\n");
      out.write("    <form action=\"Auth\" method=\"post\">\n");
      out.write("    <div class=\"txt_field\">\n");
      out.write("    <label>Username</label>\n");
      out.write("    <input type=\"text\" name=\"username\" id=\"username\">\n");
      out.write("    </div>\n");
      out.write("    <div class=\"txt_field\">\n");
      out.write("        <label>Password</label>\n");
      out.write("        <input type=\"text\" name=\"password\" id=\"password\">\n");
      out.write("        </div>\n");
      out.write("        <form>\n");
      out.write("            <input type=\"Submit\" name=\"Submit\">\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
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
