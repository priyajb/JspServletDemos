<%@page import="com.empapp.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 

Employee employee=(Employee)request.getAttribute("employee");


String name=employee.getEmployeeName();
out.print("welcome "+name +"<br>");

String city=employee.getCity();
out.print("city "+city+"<br>");
%>

</body>
</html>