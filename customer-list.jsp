

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer List</title>
<!-- to add css -->

<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
 
</head>
<body>
<br>
<br>

<div style="border:10px solid #B20D87;" align="center"><h2><b><i>CUSTOMERS</i></b></h2> </div>
<br> <br>
<br><br>

<div align="center">
   
    <form method="get" action="searchCustomer">
        <input type="text" name="val"  placeholder="Enter customer name or id"/> &nbsp;
        <input type="submit" value="Search" />
    </form>

</div>
<br>

<br>
<br>


<table align="center">
<tr>
<th>ID</th>
<th>First Name</th>
<th>Last Name</th>
<th>Dob</th>
<th>Gender</th>
<th>Email</th>
<th>Phone</th>
<th>Action</th>
</tr>

<c:forEach var="tempCustomer" items="${customers}">
<!-- update link -->
<c:url var="updateLink" value="/customer/showFormForUpdate">
<c:param name="customerId" value="${tempCustomer.id }"/></c:url>

<c:url var="deleteLink" value="/customer/delete">
<c:param name="id" value="${tempCustomer.id }"/></c:url>

<tr>
<td>${tempCustomer.id }</td>
<td>${tempCustomer.firstName }</td>
<td>${tempCustomer.lastName }</td>
<td>${tempCustomer.dob }</td>
<td>${tempCustomer.gender }</td>
<td>${tempCustomer.email }</td>
<td>${tempCustomer.phn }</td>

<td>
<a href="${updateLink}">update</a> ||

<a href="${deleteLink}">delete</a>

</td>
</tr>

</c:forEach>
</table>
<br>
<br>


<h3 align="center">Add Customers</h3>
<p align="center">
<input type="button" value="Add customer" onclick="window.location.href='showFormForAdd';return false;" class="add-button"/></p>
</body>
</html>
