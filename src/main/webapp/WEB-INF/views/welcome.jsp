<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tennis Player DB</title>
</head>
<body>
	<h2>Welcome to the tennis player database from JSP!</h2>
	<h3>Player name : <i>${name}</i></h3> 
	<%@page import="java.time.LocalDate"%>
	<% 
		System.out.println("Hello from JSP");
	%>
	
	<%
		LocalDate currentDate = LocalDate.now();
	%>
	
	<p>Current Date: <%= currentDate %></p>
	<p>Today is <%= currentDate.getDayOfWeek() %> </p>
	
	<form action="/player.do" method="post">
		<input type="text" name="name">
		<input type="submit" value="Enter">
	</form>
</body>
</html>