<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <!-- form:form -->
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>omikuji</title>
<link rel="stylesheet" href="/css/style.css">
</head>
<body>
<div class="main">
	<div class="container">
	    
  		<h1>Send a omikuji</h1>
  		<div class="formpart">
    	<form action="/passData" method="post">
    		
    	  		<label>Pick any number from 5 to 25</label><br>
    	  		<input type="number" name="nbr" value="1" min="5" max="25" step="1"><br>
    		
    	
    	  		<label>Enter the name of any city</label><br>
    	  		<input type="text" name="city"><br>
    	
    	  		<label>Enter the name of any real person</label><br>
    	  		 <input type="text" name="person"><br>
    
    			<label>Enter professional endeavor or hobby</label><br>
    	  		 <input type="text" name="endeaver"><br>
    	
    			<label>Enter any type of living thing</label><br>
    	  		 <input type="text" name="livingthing"><br>
    
    			<label>Say something nice to someone</label><br>
    	  		<textarea id="message" name="message" rows="2" cols="20">
    	  		 </textarea><br><br>
    	  		 <p>Send and show a friend</p>
    	  		 <div class="btn">
    	        <input type="submit" value="Send">
    	        </div>
    </form>
    </div>
    </div>
</div>
</body>
</html>