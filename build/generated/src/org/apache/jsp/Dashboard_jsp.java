package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Person.Staff;

public final class Dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

if(null==session.getAttribute("username")){
response.sendRedirect("index.jsp");
}


      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Dashboard</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("body{\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    font-family: Georgia, 'Times New Roman', Times, serif;\r\n");
      out.write("    background: linear-gradient(120deg,#2980b9,#8e44ad);\r\n");
      out.write("    height: 100vh;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".card {\r\n");
      out.write("  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);\r\n");
      out.write("  width: 40%;\r\n");
      out.write("  background-color: white;\r\n");
      out.write("  margin-left: auto;\r\n");
      out.write("  margin-right: auto;\r\n");
      out.write("}\r\n");
      out.write("table {\r\n");
      out.write("  font-family: arial, sans-serif;\r\n");
      out.write("  border-collapse: collapse;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  margin: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("td, th {\r\n");
      out.write("  border: 1px solid #dddddd;\r\n");
      out.write("  text-align: left;\r\n");
      out.write("  padding: 8px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tr:nth-child(even) {\r\n");
      out.write("  background-color: #dddddd;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".topnav {\r\n");
      out.write("  position: relative;\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  background-color: #333;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav a {\r\n");
      out.write("  float: left;\r\n");
      out.write("  color: #f2f2f2;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 14px 16px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  font-size: 17px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav a:hover {\r\n");
      out.write("  background-color: #ddd;\r\n");
      out.write("  color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav a.active {\r\n");
      out.write("  background-color: #5f04aa;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav-centered a {\r\n");
      out.write("  float: none;\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  top: 50%;\r\n");
      out.write("  left: 50%;\r\n");
      out.write("  transform: translate(-50%, -50%);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".topnav-right {\r\n");
      out.write("  float: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Responsive navigation menu (for mobile devices) */\r\n");
      out.write("@media screen and (max-width: 600px) {\r\n");
      out.write("  .topnav a, .topnav-right {\r\n");
      out.write("    float: none;\r\n");
      out.write("    display: block;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .topnav-centered a {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    top: 0;\r\n");
      out.write("    left: 0;\r\n");
      out.write("    transform: none;\r\n");
      out.write("  }\r\n");
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
      out.write("}                                                                                    \r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("    \r\n");
      out.write("<!-- Top navigation -->\r\n");
      out.write("<div class=\"topnav\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Centered link -->\r\n");
      out.write("    <div class=\"topnav-centered\">\r\n");
      out.write("      <a href=\"dashboard.html\" class=\"active\">Dashboard</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("    <!-- Left-aligned links (default) -->\r\n");
      out.write("    <a href=\"dashboard.html\">Dashboard</a>\r\n");
      out.write("    <a href=\"blooddonation.html\">Blood Donation</a>\r\n");
      out.write("    <a href=\"donation.html\">Donation Information</a>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <!-- Right-aligned links -->\r\n");
      out.write("    <div class=\"topnav-right\">\r\n");
      out.write("      <a href=\"submission.html\">Submission</a>\r\n");
      out.write("      <a href=\"hospital.html\">Hospital</a>\r\n");
      out.write("      <a href=\"logout\">Logout</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("  </div>\r\n");
      out.write("        <h1 style=\"margin-left:0px;color:white; text-align: center \">Profile</h1>\r\n");
      out.write("        \r\n");
      out.write("        <div class=\"card\" >\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <table style=\"width:100%\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Name:");
      out.print(session.getAttribute("username"));
      out.write("</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Email:</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Position:</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("        </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      <h1  style=\"margin-left:0px;color:white; text-align: center \">Blood Types Inventory</h1>\r\n");
      out.write("      <div class=\"card\" >\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <table style=\"width:100%\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <th>Blood Type</th>\r\n");
      out.write("                  <th>Quantity(Bags)</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td>A</td>\r\n");
      out.write("                  <td>1000</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td>B</td>\r\n");
      out.write("                  <td>750</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>AB</td>\r\n");
      out.write("                    <td>1200</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>O</td>\r\n");
      out.write("                    <td>450</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </table>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      \r\n");
      out.write("      <h1  style=\"margin-left:0px;color:white; text-align: center \">Staff List</h1>\r\n");
      out.write("      <div class=\"card\" >\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <table style=\"width:100%\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <th>Name</th>\r\n");
      out.write("                  <th>Position</th>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td>Nur Sakina</td>\r\n");
      out.write("                  <td>Nurse</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                  <td>Ahmad Ali</td>\r\n");
      out.write("                  <td>Doctor</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Manaf Mamat</td>\r\n");
      out.write("                    <td>Nurse</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>Ravindren Singh</td>\r\n");
      out.write("                    <td>Nurse</td>\r\n");
      out.write("                </tr>\r\n");
      out.write("              </table>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
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