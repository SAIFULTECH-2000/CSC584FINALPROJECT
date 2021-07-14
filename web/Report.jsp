<%-- 
    Document   : ViewStaff
    Created on : Jun 25, 2021, 2:14:21 PM
    Author     : SAIFULTECH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<sql:setDataSource var="myDatasource" driver="org.apache.derby.jdbc.ClientDriver" url="jdbc:derby://localhost:1527/BloodManagement" user="root"password="root"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Report</title>
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
                            <a href="Dashboard.jsp" aria-current="page" class="nav-link">Dashboard</a>
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
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Staff
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li> <a  class="dropdown-item" href="RegisterStaff.jsp">Register Staff</a></li>
                                <li><a class="dropdown-item " href="ViewStaff.jsp">View Staff</a></li>
                            </ul>
                        </li>
                        <li class="nav-item ">
                            <a  class="nav-link active"  href="Report.jsp">Report</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a  class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Hospital
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li> <a  class="dropdown-item" href="RegisterHospital.jsp">Register Hospital</a></li>
                                <li> <a class="dropdown-item " href="Hospital.jsp">View Hospitals</a></li>
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
        <%
            String md = (String) session.getAttribute("md");
            String name = (String) session.getAttribute("mdname");
            if (md != null) {
                if (md.equals("delete")) {
        %>

        <div class="card">
            <div class="container">
                <h1  style="margin-left:0px;color:red; text-align: center ">Successfully Deleted Staff:<%=name%></h1>

            </div>
        </div>
        <%session.removeAttribute("md");
        session.removeAttribute("mdname");
    } else if (md.equals("update")) {%>

        <div class="card">
            <div class="container">
                <h1  style="margin-left:0px;color:green; text-align: center ">Successful update Staff:<%=name%></h1>

            </div>
        </div>
        <%session.removeAttribute("md");
            session.removeAttribute("mdname");
        } %>
        <%}%>
        <h1  style="margin-left:0px;color:white; text-align: center ">Staff List</h1>
        <div class="container" >
            <div class="card">
                <div class="card-body">
                    <div class="table-wrapper-scroll-y my-custom-scrollbar">

                        <table class="table table-bordered table-striped mb-0">
                            <sql:query var="result" dataSource="${myDatasource}">
                                SELECT *  FROM BLOOD_OUT
                            </sql:query>
    
                            
                                <!-- column headers -->
                                <tr>
                                    <c:forEach var="columnName" items="${result.columnNames}">
                                        <th><c:out value="${columnName}"/></th>
                                        </c:forEach>
                                </tr>
                                <!-- column data -->
                                <c:forEach var="row" items="${result.rowsByIndex}">
                                    <tr>
                                        <c:forEach var="column" items="${row}">
                                            <td><c:out value="${column}"/></td>
                                        </c:forEach>
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
