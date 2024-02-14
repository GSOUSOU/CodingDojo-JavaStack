<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Expense Details</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>

<div>
<h2 class="header">Expense Details   <a href="/expenses"> Go back</a></h2>
 <h5> Expense Name : <c:out value="${expense.name}"></c:out></h5>
  <h5> Expense Description: <c:out value="${expense.description}"></c:out> </h5>
 <h5>Vendor: <c:out value="${expense.vendor}"></c:out></h5>
  <h5>Amount spent : $<c:out value="${expense.amount}"></c:out></h5>
 </div>

</body>
</html>