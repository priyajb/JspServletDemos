<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="register">
Enter Employee Name:<input type="text" name="employeeName"><br>
Enter your City:<input type="text" name="city"><br>
Enter salary:<input type="number" name="salary"><br>
Enter your Mobile Number:<input type="number" name="mobile"><br>
SELECT COURSE:
<select name="course" multiple size="3">
    <option value="Java">JAVA</option>
    <option value="Spring">SPRING</option>
    <option value="HTML">NODE</option>
</select><br>
Select Hobbies:
<input type="checkbox" name="hobby" value="sports">SPORTS<br>
<input type="checkbox" name="hobby" value="music">MUSIC<br>
<input type="checkbox" name="hobby" value="dance">DANCE<br>
<input type="checkbox" name="hobby" value="travel">TRAVEL<br>
<input type="submit" value="submit"><br>
</form>

</body>
</html>