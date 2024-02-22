<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read Share</title>
   <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>
<body> 
<div class="container">
	<h1>welcome, ${loggedUser.getUserName() }!</h1>

	<p> Books from everyone's shelves</p> 
 <div class="position-absolute top-0 end-0 mt-3">
        <div class="mt-3"><a href="/book/new">+ Add a Book to My Shelf</a></div>
        <a href="/logout">Logout</a>
    </div>

<table class="table table-bordered table-striped">
    <thead class="thead-dark">
        <tr>
            <th>ID</th>
            <th>Title</th>
            <th>Author Name</th>
            <th>Posted By </th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${books}" var="book">
            <tr>
                <td>${book.id}</td>
               <td><a href="/books/${book.id}">${book.title}</td>
                <td>${book.author}</td>
                <td>${book.postedby.getUserName()}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
	
</div> 
</body>
</html>