<%@ page language="java" contentType="text/html; charset= UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Журнал сетки сварной ГОСТ 23279-2012"</h1>

<c:if test="${requestScope.hello eq 'ok' }">
<c:out value="Hello Alex"></c:out>
</c:if>
	<c:forEach var="writes" items="${requestScope.writes}">
	<div>
	<c:out value="${writes.name}" default="null"></c:out>
	</div>

   </c:forEach>
<form action ="frontController" method="get">
<input type="hidden" name="command" value = "go_to_base_page" />
<button type="submit"> Вернуться к списку журналов    </button> 
</form>

</body>
</html>