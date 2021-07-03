<%-- 
    Document   : SendBlood
    Created on : Jul 4, 2021, 1:55:45 AM
    Author     : Syakir/Saifultech
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<sql:setDataSource var="myDatasource" driver="org.apache.derby.jdbc.ClientDriver" url="jdbc:derby://localhost:1527/BloodManagement" user="root"password="root"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Send Blood</title>
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
            <a href="Dashboard.jsp" aria-current="page" class="nav-link active">Dashboard</a>
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
      <%
      int id = (Integer) session.getAttribute("ID");
      %>
    
    <sql:query var="result" dataSource="${myDatasource}">
        SELECT *  FROM HOSPITAL WHERE ID_HOSPITAL != <%=id%>
    </sql:query>
       <%
       String md=(String) session.getAttribute("md");
       String name_hospital=(String) session.getAttribute("mdname_hospital");
       if(md!=null){
       if(md.equals("delete")){ 
       %>
         
    <div class="card">
        <div class="container">
              <h1  style="margin-left:0px;color:red; text-align: center ">Successfully Deleted Staff:<%=name_hospital%></h1>
           
        </div>
    </div>
    <%session.removeAttribute("md");session.removeAttribute("mdname_hospital");}else if(md.equals("update")){%>
    
      <div class="card">
        <div class="container">
              <h1  style="margin-left:0px;color:green; text-align: center ">Successful update Staff:<%=name_hospital%></h1>
           
        </div>
    </div>
    <%session.removeAttribute("md");session.removeAttribute("mdname_hospital");} %>
    <%}%>
    <div class="container" >
     <h1  style="margin-left:0px;color:white; text-align: center ">Send Blood to:</h1>
        <div class="card">
            <div class="card-body">
                <div class="table-wrapper-scroll-y my-custom-scrollbar">

                    
                   <table class="table table-bordered table-striped mb-0">
                          <tr>
                              <th>ID Hospital</th>
                    <th>Name</th>
                    <th>Address</th>
                    <th>PIC</th>
                    <th>Type Blood & Quantity</th>
                </tr>
                <c:forEach var = "row" items = "${result.rows}">
                    <tr>
                        <td>${row.ID_HOSPITAL}</td>
                        <td>${row.NAME_HOSPITAL}</td>
                        <td>${row.ADDRESS_HOSPITAL}</td>
                        <td>${row.PIC}</td>
                        <td>
                            <form action="SendControl" method="POST">
                                <input type="hidden" name="id_hospital" value="${row.ID_HOSPITAL}">
                                <input type="hidden" name="name_hospital" value="${row.NAME_HOSPITAL}">
                                <input type="hidden" name="address_hospital" value="${row.ADDRESS_HOSPITAL}">
                                <input type="hidden" name="pic" value="${row.PIC}">
                                <form action="SendControl">
                                    <label for="bloodtype">Choose blood type:</label>
                                    <select id="bloodtype" name="bloodtype">
                                    <option value="a">A</option>
                                    <option value="b">B</option>
                                    <option value="ab">AB</option>
                                    <option value="o">O</option>
                                    </select>
                                </form>
                                <form action="SendControl">
                                    <label for="quantity">Choose quantity:</label>
                                    <select id="quantity" name="quantity">
                                    <option value="50">50</option>
                                    <option value="100">100</option>
                                    <option value="200">200</option>
                                    <option value="300">300</option>
                                    </select>
                                    <input type="submit">
                                </form>
                            </form>
                            
                        </td>
                    </tr>
                </c:forEach>
                    </table>
        </div>
    </div>
        </div>
    </div>
       <script src="dist/js/bootstrap.bundle.min.js" type="text/javascript"></script>
    </body>
</html>