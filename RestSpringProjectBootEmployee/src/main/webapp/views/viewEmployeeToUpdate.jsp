<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="employeeUpdate" method="post">
<input type="text" hidden name="id" value="${emp.id}"><br>
<input type="text" hidden name="empId" value="${emp.empId}"><br>
Employee Name<input type="text" name="empName" value="${emp.empName}"><br>
Employee Salary<input type="text" name="salary" value="${emp.salary}"><br>
Date Of Birth<input type="date" name="dob" value="${emp.dob}"><br>
<a href="deleteemp?empId=${emp.empId}"> Delete</a><br>
<input type="Submit" value="update">
</form>
</body>
</html>