<%-- 
    Document   : Update Hospital
    Author     : SAIFULTECH/syakir
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
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
        <title>Update Hospital</title>
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
                            <a href="dashboard.jsp" aria-current="page" class="nav-link">Dashboard</a>
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
                                <li> <a  class="dropdown-item active" href="RegisterStaff.jsp">Register Staff</a></li>
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
        String name_hospital = request.getParameter("name_hospital");
        String address_hospital = request.getParameter("address_hospital");
        String pic = request.getParameter("pic");
        String id_hospital= request.getParameter("ID_HOSPITAL");
        %>

        <h1  style="margin-left:0px;color:white; text-align: center ">Update Hospital Information</h1>
        <div class="container">
            <div class="card mx-auto" style="width: 18rem;">
                <div class="card-body">
                    <form action="HospitalControl" method="POST">
                        <table>
                            <tr>
                              <input type="hidden" name="method" value="update">
                            <input type="hidden" name="ID_HOSPITAL" value="<%=id_hospital%>">
                                <td> <label>Name</td>
                                <td> <input type="text" name="name_hospital"></td>
                            </tr>
                            <tr>
                                <td> <label>Address</label></td>
                                <td> <input type="text" name="address_hospital"></td>
                            </tr>
                            <tr>
                                <td>      <label>PIC</label>   </td> 
                                <td>    <input type="text" name="pic">   </td> 
                            </tr>

                            <tr>
                                <td></td>
                                <td>    <input type="Submit" name="Submit"></td>
                            </tr>
                        </table>
                    </form>
                    <%
                        List errorMsgs = (List) request.getAttribute("errorMsgs");
                        if (errorMsgs != null) {
                    %>
                    <font color="red">
                    <ul><%
                        Iterator items = errorMsgs.iterator();
                        while (items.hasNext()) {
                            String message = (String) items.next();
                        %>
                        <li>
                            <%= message%>
                        </li>
                        <%}%>
                    </ul>
                    </font>
                    <%}%>
                    <br>
                </div>
            </div>
        </div>
             <script src="dist/js/bootstrap.bundle.min.js" type="text/javascript"></script>
    </body>
</html>