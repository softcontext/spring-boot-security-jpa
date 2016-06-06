<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<body>

	<h2>3. admin.jsp</h2>
	<hr>
	
	<div>
		message: ${message}<br>
		name: ${name }
	</div>

	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<div>
			userPrincipal.name: ${pageContext.request.userPrincipal.name}<br>
			
			<form action="/logout" method="post">
				<input type="submit" value="Sign Out" />
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			</form>
		</div>
	</c:if>

</body>
</html>