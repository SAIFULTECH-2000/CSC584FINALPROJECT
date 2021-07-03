<%-- 
    Document   : donator
    Created on : Jun 20, 2021, 4:11:03 PM
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
        <title>Update Staff</title>
        <link href="dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>

        <script>
            function validateForm() {
                let errorusername = document.forms["myForm"]["username"].value;
                let errorname = document.forms["myForm"]["name"].value;
                let errorpass = document.forms["myForm"]["pass"].value;
                let erroric = document.forms["myForm"]["IC"].value;
                let errorposition = document.forms["myForm"]["position"].value;
                let erroremail = document.forms["myForm"]["position"].value;
                if (errorusername == "") {
                    document.getElementById("errorusername").innerHTML = "Please Insert username!";
                    if (errorname == "") {
                        document.getElementById("errorname").innerHTML = "Please Insert name!";
                    }
                    if (errorpass == "") {
                        document.getElementById("errorpass").innerHTML = "Please Insert password!";
                    }
                    if (erroric == "") {
                        document.getElementById("erroric").innerHTML = "Please Insert Ic!";
                    }
                    if (errorposition == "") {
                        document.getElementById("errorposition").innerHTML = "Please Insert position!";
                    }
                    if (erroremail == "") {
                        document.getElementById("erroremail").innerHTML = "Please Insert Email!";
                    }

                    return false;
                }

                if (errorname == "") {
                    document.getElementById("errorname").innerHTML = "Please Insert name!";
                    if (errorpass == "") {
                        document.getElementById("errorpass").innerHTML = "Please Insert password!";
                    }
                    if (erroric == "") {
                        document.getElementById("erroric").innerHTML = "Please Insert Ic!";
                    }
                    if (errorposition == "") {
                        document.getElementById("errorposition").innerHTML = "Please Insert position!";
                    }
                    if (erroremail == "") {
                        document.getElementById("erroremail").innerHTML = "Please Insert Email!";
                    }
                    return false;

                }
                if (errorpass == "") {
                    document.getElementById("errorpass").innerHTML = "Please Insert password!";
                    if (erroric == "") {
                        document.getElementById("erroric").innerHTML = "Please Insert Ic!";
                    }
                    if (errorposition == "") {
                        document.getElementById("errorposition").innerHTML = "Please Insert position!";
                    }
                    if (erroremail == "") {
                        document.getElementById("erroremail").innerHTML = "Please Insert Email!";
                    }
                    return false;
                }
                if (erroric == "") {
                    document.getElementById("erroric").innerHTML = "Please Insert Ic";
                    if (errorposition == "") {
                        document.getElementById("errorposition").innerHTML = "Please Insert position!";
                    }
                    if (erroremail == "") {
                        document.getElementById("erroremail").innerHTML = "Please Insert Email!";
                    }
                    return false;
                }
                if (errorposition == "") {
                    document.getElementById("errorposition").innerHTML = "Please Insert position";
                    if (erroremail == "") {
                        document.getElementById("erroremail").innerHTML = "Please Insert Email!";
                    }
                    return false;
                }
                if (erroremail == "") {
                    document.getElementById("erroremail").innerHTML = "Please Insert Email";
                    return false;
                }

            }
        </script>
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
            String username = request.getParameter("username");
            String name = request.getParameter("name");
            String ic = request.getParameter("ic");
            String position = request.getParameter("position");
            String email = request.getParameter("email");
            String id = request.getParameter("ID");
        %>

        <h1  style="margin-left:0px;color:white; text-align: center ">Update Staff</h1>
        <div class="container">
            <div class="card mx-auto" style="width: 18rem;">
                <div class="card-body">
                    <form action="StaffControl" method="POST">
                        <input type="hidden" name="method" value="update">
                        <input type="hidden" name="ID" value="<%=id%>">
                        <div class="mb-3">
                            <label  class="form-label">USERNAME</label>
                            <input type="text" class="form-control" name="username" value="<%=username%>">
                            <p id="errorusername" style="color:red"></p>
                        </div>
                        <div class="mb-3">
                            <label  class="form-label">NAME</label>
                            <input type="text" class="form-control" name="name" value="<%=name%>">
                            <p id="errorname" style="color:red"></p>
                        </div>
                        <div class="mb-3">
                            <label>IC</label> <br>
                            <input type="text" class="form-control" name="IC" value="<%=ic%>" > 
                            <p id="erroric" style="color:red"></p>
                        </div>
                        <div class="mb-3">
                            <label>POSITION</label> 
                            <input type="text" class="form-control" name="position" value="<%=position%>">
                            <p id="errorposition" style="color:red"></p>
                        </div>
                        <div class="mb-3">
                            <label>Email</label><br>
                            <input type="text" class="form-control" name="email"value="<%=email%>" > 
                            <p id="erroremail" style="color:red"></p>
                        </div>
                        <div class="mb-3">
                            <input type="Submit" class="btn btn-primary" name="Submit" >
                        </div>
                      
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