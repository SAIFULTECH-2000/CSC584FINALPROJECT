<%-- 
    Document   : donator
    Created on : Jun 20, 2021, 4:11:03 PM
    Author     : SAIFULTECH
--%>

<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<sql:setDataSource var="myDatasource" driver="org.apache.derby.jdbc.ClientDriver" url="jdbc:derby://localhost:1527/BloodManagement" user="root"password="root"/>
<%
if(null==session.getAttribute("username")){
response.sendRedirect("index.jsp");

}
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Donator</title>
</head>
<style>
body{
    margin: 0;
    padding: 0;
    font-family: Georgia, 'Times New Roman', Times, serif;
    background: linear-gradient(120deg,#2980b9,#8e44ad);
    height: 100vh;
}


.card {
  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
  width: 40%;
  background-color: white;
  margin-left: auto;
  margin-right: auto;
}
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
  margin: center;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}


.topnav {
  position: relative;
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
  background-color: #5f04aa;
  color: white;
}

.topnav-centered a {
  float: none;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}

.topnav-right {
  float: right;
}

/* Responsive navigation menu (for mobile devices) */
@media screen and (max-width: 600px) {
  .topnav a, .topnav-right {
    float: none;
    display: block;
  }
  
  .topnav-centered a {
    position: relative;
    top: 0;
    left: 0;
    transform: none;
  }
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
</style>
<body>
     </table>
<!-- Top navigation -->
<div class="topnav">

    <!-- Centered link -->
    <div class="topnav-centered">
      <a href="RegisterStaff.jsp" class="active">Register Staff</a>
    </div>
    
    <!-- Left-aligned links (default) -->
    <a href="dashboard.jsp">Dashboard</a>
    <a href="blooddonation.html">Blood Donation</a>
    <a href="donation.html">Donation Information</a>

    
    <!-- Right-aligned links -->
    <div class="topnav-right">
      <a href="submission.html">Submission</a>
      <a href="hospital.html">Hospital</a>
      <a href="logout">Logout</a>
    </div>
    
  </div>
   
      
      <h1  style="margin-left:0px;color:white; text-align: center ">Register Staff</h1>
      <div class="center" >
        <div class="container">
            <form method="POST">
                <div class="txt_field">
    <label>Username</label>
    <input type="text" name="username" id="username">
    </div>
    <div class="txt_field">
        <label>Password</label>
        <input type="text" name="password" id="password">
        </div>
       <div class="txt_field">
        <label>IC</label>
        <input type="text" name="ic" id="password">
        </div>
         <div class="txt_field">
        <label>POSITION</label>
        <input type="text" name="position" id="password">
        </div>
         <div class="txt_field">
        <label>Email</label>
        <input type="text" name="email" id="password">
        </div>
        
            <input type="Submit" name="Submit">

            </form>
        </div>
      </div>
</body>
</html>