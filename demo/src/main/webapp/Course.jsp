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
<form:form action="/registercourse" method="post" modelAttribute="course">
CourseId:<form:input path="courseId" type="text"/>
<br>
CourseName:<form:input path="coursename" type="text"/>
<br>
Duration:<form:input path="duration" type="text"/>
<br>
Fee:<form:input path="fee" type="text"/>
<br>
<input type="submit" value="Register">
</form:form>
</body>
</html>