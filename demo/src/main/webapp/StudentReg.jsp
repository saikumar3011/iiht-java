<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Student Registration</h1>
<form:form action="/student/studentReg" method="post" modelAttribute="student">
StudentId:<form:input path="studentId" type="text"/>
<br>
StudentName:<form:input path="studentName" type="text"/>
<br>
Email:<form:input path="email" type="text"/>
<br>
Mobile:<form:input path="mobile" type="text"/>
<br>
UserName:<form:input path="username" type="text"/>
<br>
Password:<form:input path="password" type="password"/>
<br>
<input type="submit" value="Register">
<br>
Existing Student<a href="./">Login Here</a>
</form:form>
</body>
</html>