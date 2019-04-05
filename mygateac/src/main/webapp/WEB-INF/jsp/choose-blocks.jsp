<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Choose Blocks</title>
	</head>
	<body style="font-family: consolas; font-size: 20px;">
		<h2>Choose Blocks</h2>
		<form action="${pageContext.request.contextPath}/getFlatsByBlock.htm" method="get">
			Choose Blocks:
			<select name="block">
				<option value="1">gold block</option>
				<option value="2">little flower</option>
				<option value="3">green land</option>
				<option value="4">Rose</option>
			</select><br/>
			<input type="submit" value="go"/>
		</form>
		
	</body>
</html>