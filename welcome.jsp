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
.box{padding:50px;border:10px solid black;}
.highlight{background: grey;}
</style>
<title>Welcome Page</title>
</head>
<body>
	<div class="box highlight" align="center"><font><b><i>WELCOME</i></b></font>
	
	<br>
	<br>
	<br>
	
	
	<p style="color:blue;font-size:25px;" align="center">
	
		<a href="${pageContext.request.contextPath}/user/login"><b>CLIK HERE!!!</b></a>
	
	</p>
	
</div>
</body>
</html>