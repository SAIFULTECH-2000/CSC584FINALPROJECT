<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : donation_information
    Created on : Jun 23, 2021, 7:22:38 PM
    Author     : SAIFULTECH/syakir
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<sql:setDataSource var="myDatasource" driver="org.apache.derby.jdbc.ClientDriver" url="jdbc:derby://localhost:1527/BloodManagement" user="root"password="root"/>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Donation Information</title>
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
        <sql:query var="result" dataSource="${myDatasource}">
            SELECT * FROM DONATION
        </sql:query>
        <h1  style="margin-left:0px;color:white; text-align: center ">Donor Details</h1>
        <div class="container" >
            <div class="card">
                <div class="card-body">
                    <a href="register_donation.jsp" class="btn btn-primary">Register New Donation</a>
                    <div class="table-wrapper-scroll-y my-custom-scrollbar">

                        <table class="table table-bordered table-striped mb-0">
                            <tr>
                                <th>Name</th>
                                <th>Gender</th>
                                <th>Blood Type</th>
                                <th>Contact</th>
                                <th>Action</th>
                            </tr>
                            <c:forEach var ="row" items = "${result.rows}">
                                <tr>
                                    <td>${row.NAME}</td>
                                    <td>${row.GENDER}</td>
                                    <td>${row.TYPE_BLOOD}</td>
                                    <td>${row.PHONENUM}</td>
                                    <td>
                                        <form action="update_donation.jsp" method="post">
                                            <input type="hidden" name="Name" id="Name" value="${row.NAME}">
                                            <input type="hidden" name="IC" id="IC" value="${row.IC}">
                                            <input type="hidden" name="address" id="addresss" value="${row.ADDRESS}">
                                            <input type="hidden" name="tel" id="tel"value="${row.PHONENUM}">
                                            <input type="hidden" name="bloodtype" id="bloodtype" value="${row.TYPE_BLOOD}">
                                            <input type="hidden" name="ID" name="ID" value="${row.ID_DONATION}">
                                            <input type="hidden" name="hh" id="hh" value="${row.HEALTHHISTORY}">  
                                            <input type="hidden" name="gender" value="${row.gender}">
                                               <input type="submit" value="UPDATE">
                                        </form>
                                   
                                <form action="DonationControl" method="post">
                                    <input type="hidden" name="method" value="DELETE">
                                    <input type="hidden" name="ID" value="${row.ID_DONATION}">
                                    <input type="submit" value="DELETE">
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