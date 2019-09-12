<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Get All employee details </title>
</head>
<body>
<!-- <form>
<table>
 -->
<form action="getAllEmployee" method="get">
<input type="submit">
<c:forEach items="${emplist}" var="emp">
	<tr>
		<td>${emp.empId}</td>
      	<td>${emp.empName}</td>
      	<td>${emp.dob}</td>
      	<td>${emp.salary}</td>
	</tr>
</c:forEach>
<!-- </table> -->
</form>
</body>
</html>