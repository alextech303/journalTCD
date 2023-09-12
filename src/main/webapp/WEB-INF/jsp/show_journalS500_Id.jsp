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
<h1 align="center">Показатели проволоки S500</h1>

                 


<table width="1080px" border="1" align="center" cellspacing="0" > 
<tr>

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

<tr>

<td>
<c:out value="${writesS500Id.date}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500Id.name}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500Id.butch_number}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500Id.nominal_diameter}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500Id.nominal_square}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500Id.linear_mass}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500Id.ovality}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500Id.carbon_equivalent}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500Id.ultimate_strength}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500Id.yield_strength}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500Id.relation_of_ultStr_to_yieldStr}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500Id.relative_elongation}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500Id.height_of_transverse_ribs}" default="null"></c:out>
</td>

<td>
<c:out value="${writesS500Id.rib_thickness}" default="null"></c:out>
</td>
<td>
<c:out value="${writesS500Id0.edge_pitch}" default="null"></c:out>
</td>
<td>
<c:out value="${writesS500Id.note}" default="null"></c:out>
</td>

</tr>

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