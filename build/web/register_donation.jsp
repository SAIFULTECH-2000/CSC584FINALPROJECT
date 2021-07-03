<%-- 
    Document   : register_donation
    Created on : Jun 23, 2021, 7:36:23 PM
    Author     : SAIFULTECH/syakir
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Donation Information</title>
        <link href="dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <script>
        function validateForm() {
            let errorname = document.forms["myForm"]["name"].value;
            let erroric = document.forms["myForm"]["ic"].value;
            let erroraddress = document.forms["myForm"]["address"].value;
            let errortel = document.forms["myForm"]["tel"].value;
            let errorbloodtype = document.forms["myForm"]["bloodtype"].value;
            let isChecked = Array.prototype.some.call(document.forms["myForm"]["gender"], function (radio) {
                return radio.checked;
            });
            if (!isChecked) {
                document.getElementById("errorgender").innerHTML = "Please Insert gender!";
                if (errorname == "") {
                    document.getElementById("errorname").innerHTML = "Please Insert name!";

                }
                if (erroric == "") {
                    document.getElementById("erroric").innerHTML = "Please Insert ic!";
                }
                if (erroraddress == "") {
                    document.getElementById("erroraddress").innerHTML = "Please Insert address!";
                }
                if (errortel == "") {
                    document.getElementById("errortel").innerHTML = "Please Insert Phone number!";
                }
                if (errorbloodtype == "") {
                    document.getElementById("errorbloodtype").innerHTML = "Please Insert bloodtype!";
                }
                return false;
            }


            if (errorname == "") {
                document.getElementById("errorname").innerHTML = "Please Insert name!";
                if (erroric == "") {
                    document.getElementById("erroric").innerHTML = "Please Insert ic!";
                }
                if (erroraddress == "") {
                    document.getElementById("erroraddress").innerHTML = "Please Insert address!";
                }
                if (errortel == "") {
                    document.getElementById("errortel").innerHTML = "Please Insert Phone number!";
                }
                if (errorbloodtype == "") {
                    document.getElementById("errorbloodtype").innerHTML = "Please Insert bloodtype!";
                }
                return false;
            }
            if (erroric == "") {
                document.getElementById("erroric").innerHTML = "Please Insert ic!";
               
                if (erroraddress == "") {
                    document.getElementById("erroraddress").innerHTML = "Please Insert address!";
                }
                if (errortel == "") {
                    document.getElementById("errortel").innerHTML = "Please Insert Phone number!";
                }
                if (errorbloodtype == "") {
                    document.getElementById("errorbloodtype").innerHTML = "Please Insert bloodtype!";
                }
                 return false;
            }
            if (erroraddress == "") {
                document.getElementById("erroraddress").innerHTML = "Please Insert address!";
                 if (errortel == "") {
                    document.getElementById("errortel").innerHTML = "Please Insert Phone number!";
                }
                if (errorbloodtype == "") {
                    document.getElementById("errorbloodtype").innerHTML = "Please Insert bloodtype!";
                }
                return false;
            }
            if (errortel == "") {

                document.getElementById("errortel").innerHTML = "Please Insert Phone number!";
                   if (errorbloodtype == "") {
                    document.getElementById("errorbloodtype").innerHTML = "Please Insert bloodtype!";
                }
                return false;
            }
            if (errorbloodtype == "") {

                document.getElementById("errorbloodtype").innerHTML = "Please Insert bloodtype!";
                return false;
            }


        }
    </script>
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

        <h1  style="margin-left:0px;color:white; text-align: center ">BLOOD DONATION REGISTER</h1>
        <div class="container" >
            <div class="card mx-auto"  style="width: 30rem;">
                <div class="card-body" >

                    <form name="myForm" action="DonationControl" onsubmit="return validateForm()"  method="post">
                        <table>
                            <tr>
                                <td><label>Gender</label></td>                 
                                <td><input type="checkbox" name="gender" id="gender" value="MALE">Male
                                    <input type="checkbox" name="gender" id="gender" value="FEMALE">Female</td>

                            </tr>

                            <tr>
                                <td colspan="2"> <p id="errorgender" style="color:red"></p></td>
                            </tr>
                            <tr>
                                <td>Name</td>
                                <td><input type="text" name="Name" id="name"></td>
                            </tr>
                            <tr>
                                <td colspan="2"> <p id="errorname" style="color:red"></p></td>
                            </tr>
                            <tr>
                                <td>IC</td>
                                <td><input type="text" name="IC" id="ic"></td>
                            </tr>
                            <tr>
                                <td colspan="2"> <p id="erroric" style="color:red"></p></td>
                            </tr>
                            <tr>
                                <td>Address</td>
                                <td><input type="text" name="address" id="address"></td>
                            </tr>
                            <tr>
                                <td colspan="2"> <p id="erroraddress" style="color:red"></p></td>
                            </tr>
                            <tr>
                                <td>Contact Number</td>
                                <td> <input type="text" name="tel" id="tel"></td
                            </tr>
                            <tr>
                                <td colspan="2"> <p id="errortel" style="color:red"></p></td>
                            </tr>
                            <tr>
                                <td>Blood Type</td>
                                <td><input type="text" name="bloodtype" id="bloodtype"></td>
                            </tr>
                            <tr>
                                <td colspan="2"> <p id="errorbloodtype" style="color:red"></p></td>
                            </tr>
                            <tr>
                                <td>Health History (If applicable)</td>
                                <td> <input type="text" name="hh" id="hh"></td>                      
                            </tr>
                            <tr>
                                <td></td>
                                <td> <input type="Submit" name="Submit"></td>                      
                            </tr>

                            <br> <br>
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
                    <a href="donation_information.jsp">Back</a>
                </div>
            </div>

        </div>
        <script src="dist/js/bootstrap.bundle.min.js" type="text/javascript"></script>
    </body>
</html>