<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%--
Presentation connect
<jsp:include page="header.jsp"/>
 --%>

<%@include file="header.jsp" %>


<h1>Welcome to the world of Spring MVC!!!</h1>

<a href="${pageContext.servletContext.contextPath}/student/all">Get All Students</a>

</body>
</html>