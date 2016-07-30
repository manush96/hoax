<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Query Management</title>
</head>
<body>

<h1>Employees List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Id</th><th>Name</th><th>Query</th><th>description</th></tr>
    <c:forEach var="query" items="${list}"> 
    <tr>
    <td>${query.id}</td>
    <td>${query.name}</td>
    <td>${query.query}</td>
    <td>${query.description}</td>
    </tr>
    </c:forEach>
    </table>
    <br/>

</body>
</html>