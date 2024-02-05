<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <!-- Formatting (dates) --> 
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
    <!-- form:form -->
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ninja Gold Game</title>
 <link rel="stylesheet" href="/css/style.css">

</head>
<body>
<main class="main_container">
	<div class="content">
		<div class="gold">
	    <p>Your gold: <c:out value="${gold}"/></p>
       <form action="/" method="post">
   			   <input type="hidden" name="formType" value="reset">   			 	
  				<input type="submit" value="Reset!">
			</form>
		</div>
		<div class="formspart">
		<!-- Form 1 -->
			<form action="/" method="post">
    			<input type="hidden" name="formType" value="farm">
    			<h3>Farm</h3>
    			<p>(earns 10-20 gold)</p>
    			<!-- Other form fields -->
    			<input type="submit" value="Find Gold!">
			</form>

		 <!-- Form 2 -->
			<form action="/" method="post">
   			  <input type="hidden" name="formType" value="cave">
   			  <h3>Cave</h3>
   			  <p>(earns 5-10 gold)</p>
  			  <input type="submit" value="Find Gold!">
			</form>
			<!-- Form 3 -->
			<form action="/" method="post">
    			<input type="hidden" name="formType" value="house">
    		    <h3>House</h3>
    		    <p>(earns 2-5 gold)</p>
    			<input type="submit" value="Find Gold!">
			</form>

			<!-- Form 4 -->
			<form action="/" method="post">
   			   <input type="hidden" name="formType" value="quest">
   			 	<h3>Quest</h3>
   			 	<p>(earns/takes 0-50 gold)</p>
  				<input type="submit" value="Find Gold!">
			</form>
			<!-- Form 5 -->
			<form action="/" method="post">
   			   <input type="hidden" name="formType" value="spa">
   			 	<h3>Spa</h3>
   			 	<p>(takes 5-20 gold)</p>
  				<input type="submit" value="Find Gold!">
			</form>
		</div>
		
		</div>
		<iframe src="/activities" title="Activities">></iframe>
		    
		
		
	</div>
</main>

</body>
</html>