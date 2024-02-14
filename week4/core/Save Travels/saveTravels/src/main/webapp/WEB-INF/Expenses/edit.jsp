<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Book</title>
 <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="container">
 <h2 class="header">Edit Expense  <a href="/expenses"> Go back </a></h2>

<form:form  method="post" action="/Expensesupdate/${id}" modelAttribute="expense">
    <input type="hidden" name="_method" value="put">
   <div class="error-section">
        <form:errors path="name" cssClass="form-error" />
         <form:errors  class="form-error" path="vendor"/>
         <form:errors  class="form-error" path="amount"/> 
         <form:errors class="form-error" path="description"/>
    </div>
    <div >
        <form:label class="form-label" path="name" >Expense Name:</form:label>
        
        <form:input class="form-input" path="name"/>
    </div>
   <div>
        <form:label  class="form-label" path="vendor">vendor :</form:label>
        <form:textarea class="form-input" path="vendor"/>
     </div>
  <div>
        <form:label  class="form-label" path="amount">Amount:</form:label>    
        <form:input class="form-input" type="number" step="any" pattern="[0-9]+([.][0-9]+)?" min="0" path="amount"/>
    </div> 
   <div>
        <form:label  class="form-label" path="description">Description:</form:label>
        <form:textarea class="form-input"  path="description"/>
   </div>   
    <input class="form-button" type="submit" value="Submit"/>
</form:form> 
</div>   
</body>
</html>