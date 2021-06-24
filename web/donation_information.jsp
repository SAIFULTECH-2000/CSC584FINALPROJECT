<%-- 
    Document   : donation_information
    Created on : Jun 23, 2021, 7:22:38 PM
    Author     : SAIFULTECH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Donation Information</title>
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
.gender{
color:#2691d9;    
    
}

 .btn {
  background-color: #6699ff;
  color: black;
  font-size: 12px;
  padding: 16px 25px;
  border: none;
  cursor: pointer;
  border-radius: 5px;
}

.btn:hover {
  background-color: black;
  color: white;
}
</style>
<body>
    
<!-- Top navigation -->
<div class="topnav">

    <!-- Centered link -->
    <div class="topnav-centered">
      <a href="donation_information.jsp" class="active">Donation Information</a>
    </div>
    
    <!-- Left-aligned links (default) -->
    <a href="Dashboard.jsp">Dashboard</a>
    <a href="blooddonation.html">Blood Donation</a>
    <a href="RegisterStaff.jsp" >Register Staff</a>

    
    <!-- Right-aligned links -->
    <div class="topnav-right">
      <a href="submission.html">Submission</a>
      <a href="hospital.html">Hospital</a>
      <a href="logout">Logout</a>
    </div>
    
  </div>
  
      <h1  style="margin-left:0px;color:white; text-align: center ">Donor Details</h1>
    
      <div class="card" >
          <br> 
            <a href="register_donation.jsp" class="btn">Register New Donation</a>
            <br> 
            <br> <br>
        <div class="container">
            <table style="width:100%">
                <tr>
                  <th>Name</th>
                  <th>Age</th>
                  <th>Blood Type</th>
                  <th>Contact</th>
                  <th>Gender</th>
                </tr>
                <tr>
                  <td>Siti Sarah</td>
                  <td>24</td>
                  <td>B</td>
                  <td>017-9924837</td>
                  <td>Female</td>
                </tr>
                <tr>
                  <td>Nur Aminah</td>
                  <td>43</td>
                  <td>AB</td>
                  <td>019-9192322</td>
                  <td>Female</td>
                </tr>
                <tr>
                    <td>Chee Siew Ling</td>
                    <td>27</td>
                    <td>O</td>
                    <td>012-8872625</td>
                    <td>Female</td>
                </tr>
                <tr>
                    <td>Frederick A/L Joseph</td>
                    <td>45</td>
                    <td>A</td>
                    <td>011-10287746</td>
                    <td>Male</td>
                </tr>
              </table>
        </div>
      </div>

</body>
</html>