<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>


</head>
<body>
	<h3 align="center">Login Here</h3>
	<center>
	<form method="post" action="LoginUser">
	User Name : <input type="text" name="email" id="user_id"/>
	<br/>
	<br/>
	Password  : <input type="password" name="password" id="password"/>
	<br/>
	<br/>
	<input type="submit" value="Login" />
	<button ><a href="index.html">New User</a></button>
	</form>
	</center>

</body>
</html>