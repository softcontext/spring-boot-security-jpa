<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page session="false" %>
<html>
<body>

	<h2>1. home.jsp</h2>
	<hr>
	
	<div>message: ${message}</div>
	<hr>
	
	<a href="<c:url value="/login" />">login</a><br>
	<a href="<c:url value="/user" />">user</a><br>
	<a href="<c:url value="/admin" />">admin</a><br>
	<a href="<c:url value="/super" />">super</a><br>

</body>
</html>