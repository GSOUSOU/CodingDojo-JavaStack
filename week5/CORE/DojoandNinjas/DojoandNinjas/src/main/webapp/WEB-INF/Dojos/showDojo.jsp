<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<!-- Option 1: Include in HTML -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.3.0/font/bootstrap-icons.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<br/>

<h1><c:out value="${dojo.name}"/> Ninjas</h1>
<table class="table table-striped table-bordered table-hover table-responsive">
<thead>
<tr>

<th>First Name</th>
<th>last Name</th>
<th>Age </th>
</tr>
</thead>
<tbody>
<c:forEach var="ninja" items="${dojo.ninjas}">
   <tr>
   <td><c:out value="${ninja.first_name}"></c:out></td>
	<td><c:out value="${ninja.last_name}"></c:out></td>
	<td><c:out value="${ninja.age}"></c:out></td>
	</tr>
</c:forEach>
</tbody>
</table>
</div>
</body>
</html>