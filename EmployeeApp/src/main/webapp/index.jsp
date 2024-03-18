<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="employeeServlet">
Enter Employee Name:<input type="text" name="employeeName"><br>
Enter employeeId:<input type="number" name="employeeId"><br>
Enter your City:<input type="text" name="city"><br>
Enter salary:<input type="number" name="salary"><br>

SELECT COURSE:
<select name="course">
    <option value="Java">JAVA</option>
    <option value="Spring">SPRING</option>
    <option value="HTML">HTML</option>
    <option value="Node">Node</option>
</select><br>
<input type="submit" value="submit"><br>
</form>

</body>
</html>