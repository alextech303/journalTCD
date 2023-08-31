<%@page import="java.time.LocalDate"%>
    <%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<title>Проволока арматурная класса S500</title>

<style>
 body {
background: url(images/fon.jpg);
background-size: 100%;
} 
</style>
</head>
<body >
<h1><em>Проволока арматурная класса S500</em></h1>
<div>
<form  action="frontController"  method="get" target="_blank">
<input type="hidden" name="command" value = "do_writes500"/>
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
         <%LocalDate localDate = LocalDate.now();
out.println(localDate.toString());
          %>
<input type="hidden" name="date" value=<%=localDate.toString()%> >
</td>

<td>

             <select name="name">
             <option value="">Выберите арматурную проволоку из списка</option>
             <option value="Проволока 4S500 "> Проволока 4S500 </option>
             <option value="Проволока 5S500"> Проволока 5S500 </option>
             <option value="Проволока 6S500"> Проволока 6S500 </option>
             <option value="Проволока гладкая 4S500"> Проволока гладкая 4S500 </option>
             <option value="Проволока гладкая 5S500"> Проволока гладкая 5S500 </option>
             <option value="Проволока гладкая 6S240"> Проволока гладкая 6S240 </option>
             </select>            
                       
  
</td>
<td>
<input type="text" name="butch_number" value="" required="required" placeholder="введите значение">
</td>

<td>
<select name="nominal_diameter">
<option value="">Выберите из списка</option>
<option value="4">4.0</option>
<option value="5">5.0</option>
<option value="6">6.0</option>
</select>
</td>
<td>
<input type="text" name="nominal_square" value="" required="required" placeholder="введите значение">
</td>
<td>
<input type="text" name="linear_mass" value="" required="required" placeholder="введите значение">
</td>
<td>
<input type="text" name="ovality" value="" required="required" placeholder="введите значение">

</td>
<td>
<input type="text" name="carbon_equivalent" value="" required="required" placeholder="введите значение">

</td>
<td>
<input type="text" name="ultimate_strength" value="" required="required" placeholder="введите значение">

</td>
<td>
<input type="text" name="yield_strength" value="" required="required" placeholder="введите значение">

</td>
<td>
<input type="text" name="relation_of_ultStr_to_yieldStr" value="" required="required" placeholder="введите значение">

</td>
<td>
<input type="text" name="relative_elongation" value="" required="required" placeholder="введите значение">
</td>

<td>
<input type="text" name="height_of_transverse_ribs" value="" required="required" placeholder="введите значение">
</td>

<td>
<input type="text" name="rib_thickness" value="" required="required" placeholder="введите значение">
</td>

<td>
<input type="text" name="edge_pitch" value="" required="required" placeholder="введите значение">
</td>

<td>
<textarea name="note" rows="2" cols="45" placeholder="примечание"></textarea>
</td>
</td>
</tr>
</table>
</br>
<div align="left">
<button type="submit"> <img src="images/write.png" width="35px" height="35px" >Сделать запись в журнал</button>
</div>
</br>
</br>
</form>
<form action="frontController"  method="get" target="_blank">
 <input type="hidden" name="command" value = "show_writes_in_journeyS500">
 <div align="left">
<button type="submit"> <img src="images/show.png" width="35px" height="35px" >Журнал</button>
</div>
 </form>
</div>

</body>
</html>