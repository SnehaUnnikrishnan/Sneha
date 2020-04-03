<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer Form</title>

<style> 
.error{color:red}

</style>

</head>
<body>

<div style="border:10px solid #B20D87;" align="center"><h2><b><i>CUSTOMER FORM</i></b></h2> </div>
<br>
<br>
<br>

<form:form action="saveCustomer" modelAttribute="customer" method="post">
<!-- to track updation need hidden method -->
<form:hidden path="id"/>

<table align="center">
<tbody>


<tr>
<td><label>First name:</label></td>
<td><form:input path="firstName"/>
<form:errors path="firstName" cssclass="error"></form:errors>
</td>
</tr>

<tr>
<td><label>Last name:</label></td>
<td><form:input path="lastName"/>
<form:errors path="lastName" cssclass="error"></form:errors>
</td>
</tr>

<tr>
<td><label>DOB:</label></td>
<td><form:input path="dob"/>
<form:errors path="dob" cssclass="error"></form:errors>
</td>
</tr>

<tr>
<td><label>Gender:</label></td>
<td><form:input path="gender"/>
<form:errors path="gender" cssclass="error"></form:errors>
</td>
</tr>

<tr>
<td><label>Email:</label></td>
<td><form:input path="email"/>
<form:errors path="email" cssclass="error"></form:errors>
</td>
</tr>

<tr>
<td><label>Phone no:</label></td>
<td><form:input path="phn"/>
<form:errors path="phn" cssclass="error"></form:errors>
</td>
</tr>

<tr>
<td><label></label></td>
<td><input type="submit" value="Save" class="save"/></td>
</tr>
</tbody>
</table>

</form:form>
 <br>
 <br>
 
<p align="center">
<a href="${pageContext.request.contextPath}/customer/list"><b><i>BACK TO CUSTOMER LIST</i></b></a>
</p>
</body>
