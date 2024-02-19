<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>New Ninja</title>
</head>
<body>
<%@ page isErrorPage="true" %>    
<h1>New Ninja</h1>
<form:form action="/ninjas" method="post" modelAttribute="ninja">
   <div class="form-group row">
    <label for="dojo" class="col-sm-2 col-form-label">Dojo</label>
    <div class="col-sm-10">
        <form:select path="dojo" >
            <c:forEach var="onedojo" items="${alldojos}">
                <form:option value="${onedojo.id}">
                    <c:out value="${onedojo.name}"/>
                </form:option>
            </c:forEach>
        </form:select>
    </div>
</div>
    <div class="form-group row">
        <label for="first_name" class="col-sm-2 col-form-label">First Name</label>
        <div class="col-sm-10">
            <form:errors path="first_name"  class="text-danger"/>
            <form:input path="first_name" type="text" class="form-control"/>   
        </div>
    </div>

    <div class="form-group row">
        <label for="last_name" class="col-sm-2 col-form-label">Last Name</label>
        <div class="col-sm-10">
            <form:errors path="last_name"  class="text-danger"/>
            <form:textarea path="last_name" type="text" class="form-control"/> 
        </div>
    </div>

    <div class="form-group row">
        <label for="age" class="col-sm-2 col-form-label">Age</label>
        <div class="col-sm-10">
            <form:errors path="age" class="text-danger"/>    
            <form:input type="number" path="age" class="form-control"/> 
        </div>
    </div>   
    <input type="submit" value="Create" class="btn btn-primary"/>
</form:form>  

</body>
</html>