<%@ page language="java" contentType="text/html; charset=windows-1255"
    pageEncoding="windows-1255"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1255">
<title>Login</title>
</head>
<body>
<form:form action="loginCheck" method="post" modelAttribute="user"> 
Username:<form:input path="userName"/><br>
Password:<form:password  path="password"/><br>
<input type="submit" value="Submit"/><br>
</form:form>
</body>
</html>