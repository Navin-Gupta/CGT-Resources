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
<h2>Student details</h2>
<h3>NAME : ${student.name}</h3>
<h3>EMAIL : ${student.email}</h3>
<h3>COUNTRY : ${student.country}</h3>
<h3>FREE PASSES : ${student.freePasses}</h3>
<h3>COURSE CODE : ${student.courseCode}</h3>
<h3>LANGUAGES</h3>
<c:forEach var="language" items="${student.favoriteLanguages}">
	<h4>${language}</h4> 
</c:forEach>
</body>
</html>