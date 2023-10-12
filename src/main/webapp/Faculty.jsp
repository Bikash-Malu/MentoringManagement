<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Welcome Faculty , 
	<%=session.getAttribute("user_name") %>
	<br/><br/>
	<table border="2px" width="100%" >
	<tr>
	<th>slno</th>
	<th>username</th>
	<th>rolename</th>
	</tr>
	<tr>
	<th>1</th>
	<th><%=session.getAttribute("user_name") %></th>
	<th>Faculty</th>
	</tr>
	</table>
</body>
</html>