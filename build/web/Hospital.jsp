<%-- 
    Document   : Hospital
    Created on : Jul 1, 2021, 11:40:43 PM
    Author     : Syakir/Saifultech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<sql:setDataSource var="myDatasource" driver="org.apache.derby.jdbc.ClientDriver" url="jdbc:derby://localhost:1527/BloodManagement" user="root"password="root"/>
<%
    if (null == session.getAttribute("username")) {
        response.sendRedirect("index.jsp");

    }
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Hospital</title>
        <link href="dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
<style>
.gradient-custom {
  /* fallback for old browsers */
  background: #2980b9;

  /* Chrome 10-25, Safari 5.1-6 */
  background: -webkit-linear-gradient(to right, rgba(41, 128, 185, 1), rgba(142, 68, 173, 1));

  /* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
  background: linear-gradient(to right, rgba(41, 128, 185, 1), rgba(142, 68, 173, 1))
}
/* Modify the backgorund color */
.navbar-custom {
  background-color: #333;
}
.my-custom-scrollbar {
position: relative;
height: 200px;
overflow: auto;
}
.table-wrapper-scroll-y {
display: block;
}
</style>
   <body class="gradient-custom">
  <nav class="navbar navbar-expand-lg navbar-dark navbar-custom">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">BLOOD MANAGEMENT</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <a href="Dashboard.jsp" aria-current="page" class="nav-link ">Dashboard</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
             Donation
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                 <li> <a class="dropdown-item" href="blooddonation.jsp">Blood Donation</a></li>
                 <li> <a  class="dropdown-item" href="donation_information.jsp">Donation Information</a></li>
            </ul>
          </li>
          <%
          int role_id =(Integer) session.getAttribute("role_id");
          if(role_id==1){
          %>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              Staff
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
              <li> <a  class="dropdown-item" href="RegisterStaff.jsp">Register Staff</a></li>
              <li><a class="dropdown-item" href="ViewStaff.jsp">View Staff</a></li>
            </ul>
          </li>
          <%}%>
          <li class="nav-item">
                  <a  class="nav-link"  href="Report.jsp">Report</a>
          </li>
          <li class="nav-item dropdown">
                            <a  class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Hospital
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li> <a  class="dropdown-item" href="RegisterHospital.jsp">Register Hospital</a></li>
                                <li> <a class="dropdown-item active" href="Hospital.jsp">View Hospitals</a></li>
                            </ul>
                        </li>
          <li class="nav-item">
              <a class="nav-link"  href="logout">Logout</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>    

  
      <%
      int id = (Integer) session.getAttribute("ID");
      %>
    
    <sql:query var="result" dataSource="${myDatasource}">
        SELECT *  FROM HOSPITAL 
    </sql:query>
       <%
       String md=(String) session.getAttribute("md");
       String name_hospital=(String) session.getAttribute("mdname_hospital");
       if(md!=null){
       if(md.equals("delete")){ 
       %>
         
    <div class="card">
        <div class="container">
              <h1  style="margin-left:0px;color:red; text-align: center ">Successfully Deleted Hospital:<%=name_hospital%></h1>
           
        </div>
    </div>
    <%session.removeAttribute("md");session.removeAttribute("mdname_hospital");}else if(md.equals("update")){%>
    
      <div class="card">
        <div class="container">
              <h1  style="margin-left:0px;color:green; text-align: center ">Successfully Update Hospital:<%=name_hospital%></h1>
           
        </div>
    </div>
    <%session.removeAttribute("md");session.removeAttribute("mdname_hospital");} %>
    <%}%>
  <div class="container">
    <h1  style="margin-left:0px;color:white; text-align: center ">Hospital List</h1>
    <div class="card">
      <div class="card-body">
        <div class="table-wrapper-scroll-y my-custom-scrollbar">

          <table class="table table-bordered table-striped mb-0">
                          <tr>
                    <th>Hospital Name</th>
                    <th>Hospital Address</th>
                    <th>Person In Charge (PIC)</th>  
                </tr>
                <c:forEach var = "row" items = "${result.rows}">
                    <tr>
                        <td>${row.NAME_HOSPITAL}</td>
                        <td>${row.ADDRESS_HOSPITAL}</td>
                        <td>${row.PIC}</td>
                    </tr>
                </c:forEach>
                    </table>
            
        </div>
      </div>
    </div>
    <a href="SendBlood.jsp" class="btn btn-warning">Send Blood</a>
  </div>
        <script src="dist/js/bootstrap.bundle.min.js" type="text/javascript"></script>
</body>
</html>
