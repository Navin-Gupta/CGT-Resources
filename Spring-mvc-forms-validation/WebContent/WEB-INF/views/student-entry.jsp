<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="myform"    %>    

<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%--
 At the time of loading of form : getMethods will be called
 At the time of submit of form : setMethods will be called
 --%>
 <h1>Provide Student info</h1>
<myform:form action="save-data" method="POST" modelAttribute="student">
	Enter Student Name : <myform:input path="name"/> <myform:errors path="name"/>
	<br/><br/>
	Enter Student Email : <myform:input path="email"/>
	<br/><br/>
	Select Country  	: <myform:select path="country">
							<myform:options items="${student.countryOptions}"/>
							
						<%--
							<myform:options items="${countryOptions}"/>
						
							<myform:option value="IN" label="INDIA"/>
							<myform:option value="GE" label="GERMANY"/>
							<myform:option value="AF" label="AFRICA"/>
							<myform:option value="SG" label="SINGAPORE"/>
						 --%>	
						  </myform:select>
						  
	<br/><br/>
	Enter Free Passes : <myform:input path="freePasses"/> <myform:errors path="freePasses"/>
	<br/><br/>
	Enter Course Code : <myform:input path="courseCode"/> <myform:errors path="courseCode"/>
	<br/><br/>						  
	<br/><br/>
	
	Languages : <myform:checkbox path="favoriteLanguages" value="C" /> C
				<myform:checkbox path="favoriteLanguages" value="Java"/> JAVA
				<myform:checkbox path="favoriteLanguages" value="Python"/> PYTHON
				<myform:checkbox path="favoriteLanguages" value="JavaScript"/>	JAVASCRIPT					  
	<br/><br/>
	<input type="submit" value="SAVE" />
</myform:form>

</body>
</html>