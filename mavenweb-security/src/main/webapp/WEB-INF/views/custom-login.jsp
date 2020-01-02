<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="myforms" %>    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<core:if test="${param.error!=null}">
<h3>Invalid Credentials!!!!</h3>
</core:if>

<core:if test="${param.logout!=null}">
<h3>You have been successfully logged-out!</h3>
</core:if>


<myforms:form action="${pageContext.servletContext.contextPath}/validate" method="POST">
	Enter login Id		<input type="text" name="username">
	<br/><br/>
	Password 			<input type="password" name="password">
	<br/><br/>
	<input type="submit" value="Login">
</myforms:form>

</body>
</html>