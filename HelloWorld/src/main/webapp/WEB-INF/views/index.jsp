<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC - HelloWorld Index Page</title>
</head>
<body>
 
	<center>
		<h2>Hello World</h2>
	</center>
	<s:errors path="User.*"></s:errors>
	
	<form action="hello">
	First Name:<input  type="text" name="fname"  />
	<p>
	Last Name:<input type="text" name="lname"/>
	<p>
	Age:<input type="text" name="age"/>
	<p>	
	Hobby:<input type="text" name="hobby"/>
	<p>
	DOB:<input type="text" name="dob"/>
	<p>	
	Date OF Departure:<input type="text" name="dateOfDeparture"/>
	<p>
	<input type="submit" value="Register">
	</form>
	
</body>
</html>
