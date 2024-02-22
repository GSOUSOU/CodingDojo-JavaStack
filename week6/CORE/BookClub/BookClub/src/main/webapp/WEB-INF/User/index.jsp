<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Login and Registration</title>
</head>
<body>
 <div class="container">
 <h1 class="header">Book Club</h1>
 <p>A place for friends to share throughts on books</p>
 <table class="table table-bordered table-primary">
    <thead>
        <tr>
            <th class="text-center">Register</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>
                <form:form action="/register" method="post" modelAttribute="newUser" class="form">
                    <div class="form-group row">
                        <label for="userName" class="col-sm-2 col-form-label">Username:</label>
                        <div class="col-sm-10">
                            <form:input path="userName" id="userName" class="form-control"/>
                            <form:errors path="userName" class="text-danger"/>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="email" class="col-sm-2 col-form-label">Email:</label>
                        <div class="col-sm-10">
                            <form:input path="email" id="email" type="email" class="form-control"/>
                            <form:errors path="email" class="text-danger"/>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="password" class="col-sm-2 col-form-label">Password:</label>
                        <div class="col-sm-10">
                            <form:input path="password" id="password" class="form-control"/>
                            <form:errors path="password" type="password" class="text-danger"/>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="confirm" class="col-sm-2 col-form-label">Confirm PW:</label>
                        <div class="col-sm-10">
                            <form:input path="confirm" id="confirm" class="form-control"/>
                            <form:errors path="confirm"  type="password" class="text-danger"/>
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-sm-12 text-center">
                            <button type="submit" class="btn btn-secondary">Submit</button>
                        </div>
                    </div>
                </form:form>
            </td>
        </tr>
    </tbody>
</table>
<table class="table table-bordered table-primary">
    <thead>
        <tr>
            <th class="text-center">Log In</th>
        </tr>
    <tbody>
        <tr>
            <td>
				<form:form action="/login" method="post" modelAttribute="newLogin">

    				<div class="form-group row">
                        <label for="email" class="col-sm-2 col-form-label">Email:</label>
                        <div class="col-sm-10">
                            <form:input path="email" id="email" type="email" class="form-control"/>
                            <form:errors path="email" class="text-danger"/>
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="password" class="col-sm-2 col-form-label">Password:</label>
                        <div class="col-sm-10">
                            <form:input path="password" id="password" class="form-control"/>
                            <form:errors path="password" class="text-danger"/>
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-sm-12 text-center">
       					 <button type="submit" class="btn btn-secondary btn-block ">Submit</button>
                        </div>
                    </div>
                </form:form>
            </td>
        </tr>
    </tbody>
</table> 
 </div>
 
</body>
</html>