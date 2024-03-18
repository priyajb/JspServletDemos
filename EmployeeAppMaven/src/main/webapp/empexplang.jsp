<%@page import="com.employeeapp.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



Welcome ${employee.employeeName}
<br>City ${employee.city }
<br>Salary ${employee.salary }
<br>EmployeeId ${employee.employeeId}

<br>
${message }<br>
${message1 }<br>
${sessionScope.message1}



</body>
</html>