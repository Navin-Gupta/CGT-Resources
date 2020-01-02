<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="myform"%>

<%@taglib uri="http://www.springframework.org/security/tags" prefix="security" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Hello <security:authentication property="principal.username"/> </h2>
<h3>Role(s) <security:authentication property="principal.authorities"/> </h3>

<myform:form action="${pageContext.servletContext.contextPath}/logout" method="POST">
	<input type="submit" value="Logout"> 
</myform:form>
<hr />
<h1>Welcome to the world of Spring MVC!!!</h1>

<hr />

<security:authorize access="hasRole('MANAGER')">
		<a href="${pageContext.servletContext.contextPath}/manager/home">Manager Dashboard</a>
</security:authorize>
<br/>
<security:authorize access="hasRole('ADMIN')">
	<a href="${pageContext.servletContext.contextPath}/admin/home">Admin Dashboard</a>
</security:authorize>
</body>
</html>