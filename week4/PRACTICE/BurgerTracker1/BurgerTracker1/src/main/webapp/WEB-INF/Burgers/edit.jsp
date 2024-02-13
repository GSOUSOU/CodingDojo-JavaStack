<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Book</title>
 
</head>
<body>
<h1>Edit Burger </h1>
<form:form  method="post" action="/Burgers/${id}" modelAttribute="burger">
    <input type="hidden" name="_method" value="put">
    <div>
         <form:label path="name">Burger Name:</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </div>
    <div>
         <form:label path="restaurantName">restaurant Name:</form:label>
        <form:errors path="restaurantName"/>
        <form:textarea path="restaurantName"/>
    </div>
    <div>
         <form:label path="rating">Rating:</form:label>
        <form:errors path="rating"/>     
        <form:input type="number" path="rating"/>
    </div>
    <div>
        <form:label path="notes">notes:</form:label>
        <form:errors path="notes"/>
        <form:textarea path="notes"/>
    </div>    
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>