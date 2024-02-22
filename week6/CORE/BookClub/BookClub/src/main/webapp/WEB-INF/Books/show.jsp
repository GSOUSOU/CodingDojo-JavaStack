<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read Share</title>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">

</head>
<body>
<div class="container">
<h1> ${book.title}</h1>
 <div class="position-absolute top-0 end-0 mt-3">
       <a href="/books"> back  to the shelves</a>
    </div>
<c:choose>
    <c:when test="${book.postedby.id == loggedUser.getId()}">
       <p><span style="color: red;"> You </span>read 
		<span style="color:purple;">${book.title}</span>by 
		<span style="color:green;">${book.author}</span>
	   </p>
		<p>there are your thoughts</p>
		 <hr>
		<p>${book.throughts}</p>
		 <hr>
		<div class="d-inline-flex">
        <button type="button" class="btn btn-secondary mr-2">
            <a href="/book/${book.id}/edit">Edit</a>
        </button>
        <form action="/books/${book.id}" method="post">
            <input type="hidden" name="_method" value="delete">
            <input type="submit" value="Delete" class="btn btn-danger">
        </form>
    </div>
    </c:when>
    <c:otherwise>
        <p><span style="color: red;"> ${book.postedby.getUserName()} </span>read 
		<span style="color:purple;">${book.title}</span>by 
		<span style="color:green;">${book.author}</span>
		</p>
			<p>there are the ${book.postedby.getUserName()}'s thoughts</p>
			 <hr>
			
			<p>${book.throughts}</p>
			 <hr>
    </c:otherwise>
</c:choose>
</div>
</body>
</html>