<%@ page language="java" contentType="text/html; charset= UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Wire S500</title>
<link rel="stylesheet" type="text/css" href="styles/show.css">
</head>
<body>
<h1 align="center">Журнал регистрации показателей проволоки S500</h1>


<table width="1080px" border="1" align="center" cellspacing="0" > 
<tr>
<th>№ п/п </th>
<th>Дата </th>
<th>Наименование арматурной проволоки</th> 
<th>Номер партии</th>
<th>Номинальный диаметер, мм</th>
<th>Номинальная площадь, мм2</th>
<th>Линейная масса, кг/м.п.</th>
<th>Овальность, мм</th>
<th>Углеродный эквивалент Сeq,% </th>
<th>Предел прочности, МПа  </th>
<th>Предел текучести, МПа </th>
<th>Отношение временного сопративления к пределу текучести</th>
<th>Относительное удлиннение, % </th>
<th>Высота поперечных ребер, мм </th>
<th>Толщина ребра </th>
<th>Шаг ребер </th>
<th>Примечание</th>

</tr>
<c:forEach var="writesS500" items="${requestScope.writesS500}">
<tr>

<td>
<form action="frontController"  method="get" >
<c:out value="${writesS500.id}" default="null"></c:out>
<input type="hidden" name="getId" value="${writesS500.id}" >
<input type="hidden" name="command" value = "go_to_23279"/>
<button  type="submit"> <img src="images/choose.png" width="25px" height="25px" ></button>

</form>
</td>

<td>
<c:out value="${writesS500.date}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500.name}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500.butch_number}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500.nominal_diameter}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500.nominal_square}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500.linear_mass}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500.ovality}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500.carbon_equivalent}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500.ultimate_strength}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500.yield_strength}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500.relation_of_ultStr_to_yieldStr}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500.relative_elongation}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500.height_of_transverse_ribs}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500.rib_thickness}" default="null"></c:out>
</td>
<td>
<c:out value="${writesS500.edge_pitch}" default="null"></c:out>
</td>
<td>
<c:out value="${writesS500.note}" default="null"></c:out>
</td>

</tr>
</c:forEach>

 </table> 
 </br>
 </body>
</html>