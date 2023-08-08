<%@ page language="java" contentType="text/html; charset= UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="styles/show.css">
</head>
<body>
<h1 align="center">Журнал сетки сварной ГОСТ 23279-2012"</h1>

<c:if test="${requestScope.hello eq 'ok' }">
<h3>
<c:out value="Hello !!!"></c:out>
</h3>
                  
</c:if>

<table width="1080px" border="1" align="center" cellspacing="0" > 
<tr>
<th>№ п/п</th>
<th>Дата </th>
<th>Наименование сетки</th>
<th>Номер партии</th>
<th>Номинальный диаметер, мм</th>
<th>Размер продольной ячейки, мм</th>
<th>Размер поперечной ячейки, мм</th>
<th>Относительная осадка стержней</th>
<th>Размер карты, см </th>
<th>Поперечные выпуски, мм</th>
<th>Продольные выпуски, мм</th>
<th>Прямолинейность, мм </th>
<th>Диагональ</th>
<th>Ударное воздействие</th>
<th>Примечание</th>

</tr>
<c:forEach var="writes" items="${requestScope.writes}">
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
</c:forEach>

 </table> 
	
	

   
   </br>
<form action ="frontController" method="get">
<input type="hidden" name="command" value = "go_to_base_page" />
<div>
<button  type="submit"> <img src="images/back.jpg" width="50px" height="50px" > Вернуться к списку журналов    </button> 
</div>

</form>

</body>
</html>