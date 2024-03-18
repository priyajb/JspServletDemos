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



<%
pageContext.setAttribute("message", "welcome to voya");
request.setAttribute("message", "hi ");
session.setAttribute("mesaage", "hi hello");
application.setAttribute("message", "hi hello good morning");
%>

<h2> Using Scripting</h2>
<%
String msg1=(String)request.getAttribute("message");
String msg2=(String)session.getAttribute("message");
String msg3=(String)application.getAttribute("message");
%>
<%=msg1%><br>
<%=msg2%><br>
<%=msg3%><br>

<h2>using el</h2>
${message}
${requestScope.message }
${sessionScope.messgae }
${applicationScope.message}
</body>
</html>