<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> 
             welcome ${name}
</h1>
<form action="hello">

enter name<input type="text" name="name"/>
<input type="submit" value="submit"/>



</form>

<a href="register">register</a>
</body>
</html>