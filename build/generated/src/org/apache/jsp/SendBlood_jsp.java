package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SendBlood_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      if (_jspx_meth_sql_setDataSource_0(_jspx_page_context))
        return;
      out.write('\n');

    if (null == session.getAttribute("username")) {
        response.sendRedirect("index.jsp");

    }

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Hospital</title>\n");
      out.write("        <link href=\"dist/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write(".gradient-custom {\n");
      out.write("  /* fallback for old browsers */\n");
      out.write("  background: #2980b9;\n");
      out.write("\n");
      out.write("  /* Chrome 10-25, Safari 5.1-6 */\n");
      out.write("  background: -webkit-linear-gradient(to right, rgba(41, 128, 185, 1), rgba(142, 68, 173, 1));\n");
      out.write("\n");
      out.write("  /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */\n");
      out.write("  background: linear-gradient(to right, rgba(41, 128, 185, 1), rgba(142, 68, 173, 1))\n");
      out.write("}\n");
      out.write("/* Modify the backgorund color */\n");
      out.write(".navbar-custom {\n");
      out.write("  background-color: #333;\n");
      out.write("}\n");
      out.write(".my-custom-scrollbar {\n");
      out.write("position: relative;\n");
      out.write("height: 200px;\n");
      out.write("overflow: auto;\n");
      out.write("}\n");
      out.write(".table-wrapper-scroll-y {\n");
      out.write("display: block;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<body class=\"gradient-custom\">\n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-dark navbar-custom\">\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"#\">BLOOD MANAGEMENT</a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("        <ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a href=\"Dashboard.jsp\" aria-current=\"page\" class=\"nav-link active\">Dashboard</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item dropdown\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("             Donation\n");
      out.write("            </a>\n");
      out.write("            <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                 <li> <a class=\"dropdown-item\" href=\"blooddonation.html\">Blood Donation</a></li>\n");
      out.write("                 <li> <a  class=\"dropdown-item\" href=\"donation_information.jsp\">Donation Information</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </li>\n");
      out.write("          ");

          int role_id =(Integer) session.getAttribute("role_id");
          if(role_id==1){
          
      out.write("\n");
      out.write("          <li class=\"nav-item dropdown\">\n");
      out.write("            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("              Staff\n");
      out.write("            </a>\n");
      out.write("            <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("              <li> <a  class=\"dropdown-item\" href=\"RegisterStaff.jsp\">Register Staff</a></li>\n");
      out.write("              <li><a class=\"dropdown-item\" href=\"ViewStaff.jsp\">View Staff</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </li>\n");
      out.write("          ");
}
      out.write("\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("                 <a  class=\"nav-link\"  href=\"submission.html\">Submission</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item dropdown\">\n");
      out.write("                            <a  class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                                Hospital\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                <li> <a  class=\"dropdown-item active\" href=\"RegisterHospital.jsp\">Register Hospital</a></li>\n");
      out.write("                                <li> <a class=\"dropdown-item active\" href=\"Hospital.jsp\">View Hospitals</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("              <a class=\"nav-link\"  href=\"logout\">Logout</a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
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
