<%-- 
    Document   : Dashboard
    Created on : Jun 18, 2021, 12:42:05 AM
    Author     : saifultech/syakir
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
        <title>Dashboard</title>
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
            <a href="dashboard.jsp" aria-current="page" class="nav-link active">Dashboard</a>
          </li>
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
             Donation
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                 <li> <a class="dropdown-item" href="blooddonation.html">Blood Donation</a></li>
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
              <li><a class="dropdown-item" href="ViewStaff">View Staff</a></li>
            </ul>
          </li>
          <%}%>
          <li class="nav-item">
                 <a  class="nav-link"  href="submission.html">Submission</a>
          </li>
          <li class="nav-item">
                 <a  class="nav-link" href="hospital.html">Hospital</a>
          </li>
          <li class="nav-item">
              <a class="nav-link"  href="logout">Logout</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>    

        <%
            String username = (String) session.getAttribute("username");
            int id = (Integer) session.getAttribute("ID");
        %>
        <sql:query var="result" dataSource="${myDatasource}">
            SELECT *  FROM STAFF where USERNAME = '${username}' and ID_USER = <%=id%>
        </sql:query>
    <h1 style="margin-left:0px;color:white; text-align: center ">Profile</h1>
    <c:forEach var = "row" items = "${result.rows}">
        <div class="container" >
            <div class="card">
                <div class="card-body">
                  <table>
                    <tr>
                        <td>Name:${row.name}</td>
                    </tr>
                    <tr>
                        <td>Email:${row.email}</td>
                    </tr>
                    <tr>
                        <td>Position:${row.position}</td>
                    </tr>
                </table>
                </div>
               
            </div>
        </div>
    </c:forEach>

  <div class="container">
    <h1  style="margin-left:0px;color:white; text-align: center ">Blood Types Inventory</h1>
    <div class="card">
      <div class="card-body">
        <div class="table-wrapper-scroll-y my-custom-scrollbar">

          <table class="table table-bordered table-striped mb-0">
            <thead>
              <tr>
                <th scope="col">Blood Type</th>
                <th scope="col">Quantity(Bags)</th>
              </tr>
            </thead>
            <tbody>
              <tr>
                <td>A</td>
                <td>1000</td>
              </tr>
              <tr>
                <td>B</td>
                <td>750</td>
              </tr>
              <tr>
                  <td>AB</td>
                  <td>1200</td>
              </tr>
              <tr>
                  <td>O</td>
                  <td>450</td>
              </tr>
            </tbody>
          </table>
        
        </div>
      </div>
    </div>
  </div>
        <script src="dist/js/bootstrap.bundle.min.js" type="text/javascript"></script>
</body>
</html>