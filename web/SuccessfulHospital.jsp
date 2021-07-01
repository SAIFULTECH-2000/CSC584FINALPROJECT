<%-- 
    Document   : SuccessfulHospital
    Created on : Jul 2, 2021, 1:31:31 AM
    Author     : Syakir
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<sql:setDataSource var="myDatasource" driver="org.apache.derby.jdbc.ClientDriver" url="jdbc:derby://localhost:1527/BloodManagement" user="root"password="root"/>
<jsp:useBean id="hospital" class="Location.Hospital" scope="request"/>
<%
    if (null == session.getAttribute("name_hospital")) {
        response.sendRedirect("index.jsp");

    }
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Hospital Success</title>
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
    
    <body>
        
    </table>
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
          <li class="nav-item dropdown">
            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
              Staff
            </a>
            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
              <li> <a  class="dropdown-item" href="RegisterStaff.jsp">Register Staff</a></li>
              <li><a class="dropdown-item" href="ViewStaff.jsp">View Staff</a></li>
            </ul>
          </li>
          <li class="nav-item">
                 <a  class="nav-link"  href="submission.html">Submission</a>
          </li>
          <li class="nav-item dropdown">
                            <a  class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Hospital
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li> <a  class="dropdown-item active" href="RegisterHospital.jsp">Register Hospital</a></li>
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


    <h1  style="margin-left:0px;color:white; text-align: center ">Successfully Added Hospital</h1>
    <div class="container" >
        <div class="card mx-auto"  style="width: 30rem;">
            <div class="card-body">
         <br>
        You have successful;y added a new hospital
         <br>
         <%
         
         %>
           <table style="width:100%">
                    <tr>
                        <td>Name:<jsp:getProperty name="hospital" property="name_hospital"/></td>
                    </tr>
                    <tr>
                        <td>ADDRESS:<jsp:getProperty name="hospital" property="address_hospital"/></td>
                    </tr>
                    <tr>
                        <td>PIC:<jsp:getProperty name="hospital" property="pic"/></td>
                    </tr>
          </table>
                    <a href="RegisterHospital.jsp">Back</a>
        <br>
            </div>
        </div>
    </div>
<script src="dist/js/bootstrap.bundle.min.js" type="text/javascript"></script>
</body>
</html>
