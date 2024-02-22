<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Share</title>
   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body> 
<div class="container">  
<h1>Change Your Entry</h1>
 <div class="position-absolute top-0 end-0 mt-3">
       <a href="/books"> back  to the shelves</a>
    </div>
<form:form method="post" action="/book/${id}"  modelAttribute="book">
    <input type="hidden" name="_method" value="put">
        <div class="form-group row">
        <label class="col-sm-2 col-form-label" for="title">Title:</label>
        <div class="col-sm-10">
            <form:errors path="title"/>
            <form:input class="form-control" path="title"/>
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label" for="author">Author:</label>
        <div class="col-sm-10">
            <form:errors path="author"/>
            <form:input class="form-control" path="author"/>
        </div>
    </div>
    <div class="form-group row">
        <label class="col-sm-2 col-form-label" for="throughts">Thoughts:</label>
        <div class="col-sm-10">
            <form:errors path="throughts"/>
            <form:textarea class="form-control" path="throughts"/>
        </div>
    </div>
    <input type="submit" value="Submit"/>
</form:form>
</div>
</body>
</html>