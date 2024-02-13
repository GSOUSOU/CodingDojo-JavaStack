<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
 
</head>
<body>
<div class="container">
 <table>
    <thead>
        <tr>
            <th>Burger Name</th>
            <th>restaurant Name</th>
            <th>Rating(out of 5)</th>
             <th>action</th>
           
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${burgers}" var="burger">
            <tr>
               <td>${burger.name}</td>
                <td>${burger.restaurantName}</td>
                <td>${burger.rating}</td>
                <td><a href="/Burgers/${burger.id}/edit">edit</a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
<h1>Add a Burger</h1>
<form:form action="/Burgers" method="post" modelAttribute="burger">
    <p>
        <form:label path="name">Burger Name:</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="restaurantName">restaurant Name:</form:label>
        <form:errors path="restaurantName"/>
        <form:textarea path="restaurantName"/>
    </p>
    <p>
        <form:label path="rating">Rating:</form:label>
        <form:errors path="rating"/>     
        <form:input type="number" path="rating"/>
    </p> 
    <p>
        <form:label path="notes">notes:</form:label>
        <form:errors path="notes"/>
        <form:textarea path="notes"/>
    </p>   
    <input type="submit" value="Submit"/>
</form:form>    

</div>
</body>
</html>