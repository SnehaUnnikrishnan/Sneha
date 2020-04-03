<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style >
div{font-size:35px;}
.box{padding:5px;border:10px solid black;}
.highlight{background: grey;}
</style>
<title>Login Form</title>
</head>
<body>
	<div class="box highlight" align="center">
		<p >
		<h2 >LOGIN</h2>
		</p>
	<hr>
	<br>
	
				<form:form action="checkuser" modelAttribute="user" method="POST">
					<p>UserName</p>
					<form:input path="username" />
					<p>Password</p>
					<form:password path="password" />
					<br>
					<input type="submit" value="LOGIN" >
					<br>
					<br>
				
				</form:form>
				</diV>
</body>
</html>