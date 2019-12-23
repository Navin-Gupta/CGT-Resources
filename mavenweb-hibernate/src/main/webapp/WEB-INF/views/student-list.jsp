<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>


<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:forEach var="student" items="${students}">
	<h3>NAME : ${student.name}</h3>
	<h3>EMAIL: ${student.email}</h3>
	<br/><br/>
</c:forEach>
</body>
</html>