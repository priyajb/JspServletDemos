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
out.println("Session Id "+session.getId()+"<br>");
out.println("maxinactive "+session.getMaxInactiveInterval()+"<br>");

String username=(String)session.getAttribute("username");
session.setMaxInactiveInterval(1);
out.print("welcome "+username);
String password=(String)session.getAttribute("password");

%>
<form action="movieServlet">
SELECT LANGUAGE:
<select name="language" >
    <option value="kannada">KANNADA</option>
    <option value="korean">KOREAN</option>
    <option value="hindi">HINDI</option>
</select><br>
<input type="submit" value="Show Movies"><br>
</form>
</body>
</html>