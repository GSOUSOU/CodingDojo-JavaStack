<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Travels</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
 
</head>
<body>
<div class="container">
<h1 class="header"> Save Travels</h1>
 <table>
    <thead>
        <tr>
            <th>Expense Name</th>
            <th>Vendor</th>
            <th>Amount</th>
             <th>actions</th>
             <th></th>
           
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${expenses}" var="expense">
            <tr>
               <td><a href="/expenses/${expense.id}">${expense.name}</td>
                <td>${expense.vendor}</td>
                <td>${expense.amount}</td>
                <td><a href="/expenses/edit/${expense.id}">edit</a></td>
                 <td>
                 	<form action="/expenses/delete/${expense.id}" method="post">
               			  <input type="hidden" name="_method" value="delete">
   							 <input type="submit"  class="btn" value="Delete">
            		</form>
            	</td>
                
            </tr>
        </c:forEach>
    </tbody>
</table>
<h2 class="header">Add an Expense</h2>
<div class="form-container">
<form:form action="/Expensesaction" method="post" modelAttribute="expense">
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
</div>

</body>
</html>