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
<h1 align="center"><strong>Журнал сетки сварной ГОСТ 23279-2012"</strong> </h1>

<c:if test="${requestScope.hello eq 'ok' }">
<c:out value="Hello !!!"></c:out>
</c:if>

	<c:forEach var="writes" items="${requestScope.writes}">
	<div>
	<table width="1080px" border="1" align="center" cellspacing="0" >
<tr>
<td>№ п/п</td>
<td><strong>Дата </strong></td>
<td><strong>Наименование сетки</strong></td>
<td><strong>Номер партии</strong></td>
<td><strong>Номинальный диаметер, мм</strong></td>
<td><strong>Размер продольной ячейки, мм</strong></td>
<td><strong>Размер поперечной ячейки, мм</strong></td>
<td><strong>Относительная осадка стержней</strong></td>
<td><strong>Размер карты, см </strong></td>
<td><strong>Поперечные выпуски, мм</strong> </td>
<td><strong>Продольные выпуски, мм</strong> </td>
<td><strong>Прямолинейность, мм </strong></td>
<td><strong>Диагональ </strong></td>
<td><strong>Ударное воздействие </strong></td>
<td><strong>Примечание</strong></td>

</tr>

<tr>

<td>
<c:out value="${writes.id}" default="null"></c:out>
</td>

<td>
<c:out value="${writes.date}" default="null"></c:out>
</td>

<td>
<c:out value="${writes.name}" default="null"></c:out>
</td>

<td>
<c:out value="${writes.butch_number}" default="null"></c:out>
</td>

<td>
<c:out value="${writes.nominal_diameter}" default="null"></c:out>
</td>

<td>
<c:out value="${writes.size_cell_1}" default="null"></c:out>
</td>

<td>
<c:out value="${writes.size_cell_2}" default="null"></c:out>
</td>

<td>
<c:out value="${writes.sediment}" default="null"></c:out>
</td>

<td>
<c:out value="${writes.card_size}" default="null"></c:out>
</td>

<td>
<c:out value="${writes.cross_releases}" default="null"></c:out>
</td>

<td>
<c:out value="${writes.longitudinal_releases}" default="null"></c:out>
</td>

<td>
<c:out value="${writes.straightforwardness}" default="null"></c:out>
</td>

<td>
<c:out value="${writes.diagonal}" default="null"></c:out>
</td>

<td>
<c:out value="${writes.impact}" default="null"></c:out>
</td>

<td>
<c:out value="${writes.note}" default="null"></c:out>
</td>

</tr>




</table>
	
	</div>

   </c:forEach>
   </br>
<form action ="frontController" method="get">
<input type="hidden" name="command" value = "go_to_base_page" />
<div>
<button  type="submit"> <img src="images/back.jpg" width="50px" height="50px" > Вернуться к списку журналов    </button> 
</div>

</form>

</body>
</html>