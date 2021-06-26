<%-- 
    Document   : index
    Created on : Jun 18, 2021, 5:00:09 PM
    Author     : saifultech/syakir
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (null != session.getAttribute("username")) {
        response.sendRedirect("Dashboard.jsp");
    }

%>
<!DOCTYPE html>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Login</title>
        <link rel = "icon" href ="img/214281.jpg" type="image/x-icon">
        <link href="dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
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
    </head>
    <h1 style="margin-left:0px;color:white; text-align: center ">Login</h1>
    <body class="gradient-custom">
        <!--Grid row-->
        <div class="row d-flex justify-content-center">

            <!--Grid column-->


            <div class="card" style="width: 20rem;">
                <%                       String popup = (String) request.getAttribute("message");
                    if (popup != null) {
                %>
                <font color="green">
                <p>&nbsp;<%=popup%></p>
                </font>
                <%}%>
                <div class="card-body">

                    <form action="Auth" method="post">
                        <div class="mb-3">
                            <label  class="form-label">USERNAME</label>
                            <input type="text" class="form-control" name="username">
                        </div>
                        <div class="mb-3">
                            <label  class="form-label">Password</label>
                            <input type="text" class="form-control" name="password">
                        </div>
                        <button type="submit" class="btn btn-primary">Submit</button>
                    </form>
                </div>
                <%                      List errorMsgs = (List) request.getAttribute("errorMsgs");
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
            </div>


            <!--Grid column-->

        </div>
        <!--Grid row-->
    </body>
</html>