<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="/css/style.css">
<meta charset="ISO-8859-1">
<title>Book Share</title>
</head>
<body>
<div class="container">
<%@ page isErrorPage="true" %>    
<h1>Add a BOOK to my shelf</h1>
 <div class="position-absolute top-0 end-0 mt-3">
       <a href="/books"> back  to the shelves</a>
    </div>
 
<form:form action="/createbook" method="post" modelAttribute="book">
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
    <div class="form-group row">
        <div class="col-sm-10 offset-sm-2">
            <input type="submit" class="btn btn-primary" value="Submit"/>
        </div>
    </div>
</form:form>


</div>
</body>
</html>