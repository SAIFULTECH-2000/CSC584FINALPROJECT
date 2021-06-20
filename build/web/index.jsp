<%-- 
    Document   : index
    Created on : Jun 18, 2021, 5:00:09 PM
    Author     : saifultech
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
if(null!=session.getAttribute("username")){
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
<style>
body{
    margin: 0;
    padding: 0;
    font-family: Georgia, 'Times New Roman', Times, serif;
    background: linear-gradient(120deg,#2980b9,#8e44ad);
    height: 100vh;
}
.center{
    position: absolute;
    top:50%;
    left:50%;
    transform: translate(-50%,-50%);
    width: 400px;
    background: white;
}
.center h1{
    text-align: center;
    padding:0 0 20px 0;
    border-bottom: 1px solid silver;
}
.center form{
    padding: 0 40px;
    box-sizing:border-box;
}
form .txt_field{
    position: relative;
    border-bottom: 2px solid #adadad;
    margin:30px 0;
}

.txt_field input{
    width: 100%;
    padding:0 5px;
    height: 40px;
    font-size:16px;
    border: none;
    background: none;
    outline: none;
}
.txt_field label{
    position: absolute;
    left:5px;
    color:#adadad;
    transform: translateY(-50%);
    font-size: 16px;
    pointer-events: none;
    top:-5px;
    color:#2691d9;
}

input[type="submit"]{
    width: 100%;
    height: 50px;
    border:1px solid;
    background-color: #2691d9;
    color: white;
    border-radius:25px;
}
.centerImg{
  display: block;
  margin-left: auto;
  margin-right: auto;
  width: 50%;
}
</style>
</head>
<body>
    <div class="center">
         <%
        String popup =(String) request.getAttribute("message");
        if(popup !=null){
        %>
        <font color="green">
            <p>&nbsp;<%=popup%></p>
        </font>
        <%}%>
        <img src="img/214281.jpg" width="100" height="100"  class="centerImg">
        <h1>Login</h1>
    <form action="Auth" method="post">
    <div class="txt_field">
    <label>Username</label>
    <input type="text" name="username" id="username">
    </div>
    <div class="txt_field">
        <label>Password</label>
        <input type="text" name="password" id="password">
        </div>
        
            <input type="Submit" name="Submit">
        </form><br>
        <%
        List errorMsgs = (List) request.getAttribute("errorMsgs");
        if(errorMsgs!=null){
        %>
        <font color="red">
            <ul><%
                Iterator items = errorMsgs.iterator();
                while(items.hasNext()){
                    String message =(String) items.next();
                %>
                <li>
                    <%= message%>
                </li>
                <%}%>
            </ul>
        </font>
        <%}%>
    </div>
</body>
</html>