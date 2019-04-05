<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Flats And Owners</title>
	</head>
	<body style="font-family: consolas; font-size: 20px;">
		<h2>Flats and Owners</h2>
		<table>
			<tr>
				<th>Flat No</th>
				<th>Flat Type</th>
				<th>Floor</th>
				<th>Facing</th>
				<th>Owner Name</th>
				<th>Mobile</th>
				<th>Email address</th>
			</tr>
			<c:forEach items="${flatOwners}" var="flatOwner">
				<tr>
					<td>${flatOwner.flatNo}</td>
					<td>${flatOwner.flatType}</td>
					<td>${flatOwner.floor}</td>
					<td>${flatOwner.facing}</td>
					<td>${flatOwner.ownerName}</td>
					<td>${flatOwner.mobileNo}</td>
					<td>${flatOwner.emailAddress}</td>
				</tr>
			</c:forEach>			
		</table>	
	</body>
</html>
























