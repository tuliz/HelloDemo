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
<form:form action="loginCheck" modelAttribute="user">
<p>Name:<form:input path="userName" /></p>
<p><form:password path="password"/><p>
<input type="button" value="Send"/>
</form:form>
</body>
</html>