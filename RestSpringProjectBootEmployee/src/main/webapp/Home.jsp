<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Spring Boot Project</title>
<style>

/* body {
    background-image: url("images.jpeg");
} */
#navigation-container {
 width: 1200px;
 margin: 0 auto;
 height: 70px;
}

.navigation-bar {
 background-color: #111;
 height: 70px;
 width: 100%;
 text-align:center;
}
.navigation-bar img{
float:left;
}
ul {
 list-style-type: none;
 margin: 0;
 padding: 0;
 overflow: hidden;
 background-color: #333;
}

li {
 float: right;
}

li a {
 display: block;
 color: white;
 text-align: center;
 padding: 14px 16px;
 text-decoration: none;
}

li a:hover {
 background-color: #grey;
}
</style>
</head>
<body>

   
<div class="navigation-bar">


   <div id="navigation-container">

     <img src="Sak.png" height=70 width=250>
<ul>
	<li><a href="AddEmployee.jsp">Add employee</a><br></li>
	<li><a href="DeleteEmployee.jsp">Delete Employee</a><br></li> 
	<li><a href="viewOne.jsp">Get Employee</a><br></li>  
 	<li><a href="viewAllEmployee.jsp">Get all Employee</a><br></li>
  	<li><a href="updateEmployee.jsp">Update Employee</a><br></li>
</ul>
   
 </div>
 	<center><h1>Sakha Employee Management System</h1></center>
</div>
<!-- 
<div class="container"> 
       <div style='position:absolute;zindex:0;left:0;top:0;width:10%;height:10%'>
           <img src='images.jpeg' style='width:50%;height:50%' alt='[]' />
       </div>
   </div>
 -->
 
 </body>
</html>