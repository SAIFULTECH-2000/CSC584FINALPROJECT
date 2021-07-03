package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import java.util.List;

public final class SuccessfulStaff_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.release();
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
      response.setContentType("text/html");
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
      out.write("\r\n");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      Person.Staff staff = null;
      synchronized (request) {
        staff = (Person.Staff) _jspx_page_context.getAttribute("staff", PageContext.REQUEST_SCOPE);
        if (staff == null){
          staff = new Person.Staff();
          _jspx_page_context.setAttribute("staff", staff, PageContext.REQUEST_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

    if (null == session.getAttribute("username")) {
        response.sendRedirect("index.jsp");

    }

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <title>Successful Staff</title>\r\n");
      out.write("        <link href=\"dist/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("    </head>\r\n");
      out.write(" <style>\r\n");
      out.write(".gradient-custom {\r\n");
      out.write("  /* fallback for old browsers */\r\n");
      out.write("  background: #2980b9;\r\n");
      out.write("\r\n");
      out.write("  /* Chrome 10-25, Safari 5.1-6 */\r\n");
      out.write("  background: -webkit-linear-gradient(to right, rgba(41, 128, 185, 1), rgba(142, 68, 173, 1));\r\n");
      out.write("\r\n");
      out.write("  /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */\r\n");
      out.write("  background: linear-gradient(to right, rgba(41, 128, 185, 1), rgba(142, 68, 173, 1))\r\n");
      out.write("}\r\n");
      out.write("/* Modify the backgorund color */\r\n");
      out.write(".navbar-custom {\r\n");
      out.write("  background-color: #333;\r\n");
      out.write("}\r\n");
      out.write(".my-custom-scrollbar {\r\n");
      out.write("position: relative;\r\n");
      out.write("height: 200px;\r\n");
      out.write("overflow: auto;\r\n");
      out.write("}\r\n");
      out.write(".table-wrapper-scroll-y {\r\n");
      out.write("display: block;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("    \r\n");
      out.write("    <body>\r\n");
      out.write("        \r\n");
      out.write("    </table>\r\n");
      out.write("   <body class=\"gradient-custom\">\r\n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-dark navbar-custom\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">BLOOD MANAGEMENT</a>\r\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("        <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("            <a href=\"dashboard.jsp\" aria-current=\"page\" class=\"nav-link active\">Dashboard</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item dropdown\">\r\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("             Donation\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                 <li> <a class=\"dropdown-item\" href=\"blooddonation.html\">Blood Donation</a></li>\r\n");
      out.write("                 <li> <a  class=\"dropdown-item\" href=\"donation_information.jsp\">Donation Information</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item dropdown\">\r\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("              Staff\r\n");
      out.write("            </a>\r\n");
      out.write("            <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("              <li> <a  class=\"dropdown-item\" href=\"RegisterStaff.jsp\">Register Staff</a></li>\r\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"ViewStaff.jsp\">View Staff</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("                 <a  class=\"nav-link\"  href=\"submission.html\">Submission</a>\r\n");
      out.write("          </li>\r\n");
      out.write("          <li class=\"nav-item dropdown\">\r\n");
      out.write("                            <a  class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                                Hospital\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\r\n");
      out.write("                                <li> <a  class=\"dropdown-item active\" href=\"RegisterHospital.jsp\">Register Hospital</a></li>\r\n");
      out.write("                                <li> <a class=\"dropdown-item active\" href=\"Hospital.jsp\">View Hospitals</a></li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </li>\r\n");
      out.write("          <li class=\"nav-item\">\r\n");
      out.write("              <a class=\"nav-link\"  href=\"logout\">Logout</a>\r\n");
      out.write("          </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </nav>    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <h1  style=\"margin-left:0px;color:white; text-align: center \">Successfully Added Staff</h1>\r\n");
      out.write("    <div class=\"container\" >\r\n");
      out.write("        <div class=\"card mx-auto\"  style=\"width: 30rem;\">\r\n");
      out.write("            <div class=\"card-body\">\r\n");
      out.write("         <br>\r\n");
      out.write("        You have successful add new staff\r\n");
      out.write("         <br>\r\n");
      out.write("         ");

         
         
      out.write("\r\n");
      out.write("           <table style=\"width:100%\">\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Name:");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Person.Staff)_jspx_page_context.findAttribute("staff")).getName())));
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>IC:");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Person.Staff)_jspx_page_context.findAttribute("staff")).getIc())));
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Email:");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Person.Staff)_jspx_page_context.findAttribute("staff")).getEmail())));
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Position:");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((Person.Staff)_jspx_page_context.findAttribute("staff")).getPosition())));
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("          </table>\r\n");
      out.write("                    <a href=\"RegisterStaff.jsp\">Back</a>\r\n");
      out.write("        <br>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("<script src=\"dist/js/bootstrap.bundle.min.js\" type=\"text/javascript\"></script>\r\n");
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

  private boolean _jspx_meth_sql_setDataSource_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sql:setDataSource
    org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag _jspx_th_sql_setDataSource_0 = (org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag) _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.get(org.apache.taglibs.standard.tag.rt.sql.SetDataSourceTag.class);
    _jspx_th_sql_setDataSource_0.setPageContext(_jspx_page_context);
    _jspx_th_sql_setDataSource_0.setParent(null);
    _jspx_th_sql_setDataSource_0.setVar("myDatasource");
    _jspx_th_sql_setDataSource_0.setDriver("org.apache.derby.jdbc.ClientDriver");
    _jspx_th_sql_setDataSource_0.setUrl("jdbc:derby://localhost:1527/BloodManagement");
    _jspx_th_sql_setDataSource_0.setUser("root");
    _jspx_th_sql_setDataSource_0.setPassword("root");
    int _jspx_eval_sql_setDataSource_0 = _jspx_th_sql_setDataSource_0.doStartTag();
    if (_jspx_th_sql_setDataSource_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
      return true;
    }
    _jspx_tagPool_sql_setDataSource_var_user_url_password_driver_nobody.reuse(_jspx_th_sql_setDataSource_0);
    return false;
  }
}
