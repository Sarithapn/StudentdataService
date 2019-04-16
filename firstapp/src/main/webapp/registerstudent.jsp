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
	enter  student name<input type="text" name="sname" value=${student.sname }></input><br>
	enter  student id <input type="text" name="sid" value=${student.sid }></input><br>
	enter  student branch<input type="text" name="branch" value=${student.branch }></input><br>
	<input type="submit",value="submit">
</form>

<br><br><br>${student}
</body>
</html>