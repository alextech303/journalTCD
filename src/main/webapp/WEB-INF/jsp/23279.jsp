	<%@page import="java.time.LocalDate"%>
    <%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Сетка сварная ГОСТ 23279-2012</title>

<style>

 body {
background: url(images/fon.jpg);
background-size: 100%;
} 
</style>
</head> 
<body>
<div>
<h1 align="center"><em>Сетка сварная ГОСТ 23279-2012</em></h1>


<form  action="frontController"  method="get" target="_blank">
<input type="hidden" name="command" value = "do_write"/>
<table width="1080px" border="1" align="center" cellspacing="0" >
<tr>
<td>Дата </td>
<td>Наименование сетки</td>
<td>Номер партии</td>
<td>Номинальный диаметер, мм</td>
<td>Размер продольной ячейки, мм</td>
<td>Размер поперечной ячейки, мм</td>
<td>Относительная осадка стержней</td>
<td>Размер карты, см </td>
<td>Поперечные выпуски, мм </td>
<td>Продольные выпуски, мм </td>
<td>Прямолинейность, мм </td>
<td>Диагональ, мм </td>
<td>Ударное воздействие </td>
<td>Используемая проволока </td>
<td>Примечание</td>
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
             <option value="">Выберите сетку из списка</option>
             <option value="4S500 50x50"> 4S500 50x50 </option>
             <option value="4S500 100x100"> 4S500 100x100 </option>
             <option value="4S500 150x150"> 4S500 150x150 </option>
             <option value="4S500 200x200"> 4S500 200x200 </option>
             <option value="5S500 50x50"> 5S500 50x50 </option>
             <option value="5S500 100x100"> 5S500 100x100 </option>
             <option value="5S500 150x150"> 5S500 150x150 </option>
             <option value="5S500 200x200"> 5S500 200x200 </option>
             <option value="6S500 50x50"> 6S500 50x50 </option>
             <option value="6S500 100x100"> 6S500 100x100 </option>
             <option value="6S500 150x150"> 6S500 150x150 </option>
             <option value="6S500 200x200"> 6S500 200x200 </option>
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
<input type="text" name="size_cell_1" value="" required="required" placeholder="введите значение">
</td>
<td>
<input type="text" name="size_cell_2" value="" required="required" placeholder="введите значение">
</td>
<td>
<input type="text" name="sediment" value="" required="required" placeholder="введите значение">

</td>
<td>
<input type="text" name="card_size" value="" required="required" placeholder="введите значение">

</td>
<td>
<input type="text" name="cross_releases" value="" required="required" placeholder="введите значение">

</td>
<td>
<input type="text" name="longitudinal_releases" value="" required="required" placeholder="введите значение">

</td>
<td>
<input type="text" name="straightforwardness" value="" required="required" placeholder="введите значение">

</td>
<td>
<input type="text" name="diagonal" value="" required="required" placeholder="введите значение">

</td>
<td>
<select name="impact">
<option value="">Выберите из списка</option>
<option value="ok">удовлетворительно</option>
<option value="bad">не удовлетворительно</option>
</select>
</td>
<td>
<c:if test="${sessionScope.chooseIdS500 ne null}">

	<em>выбрано</em>
	<p>${sessionScope.chooseIdS500}</p>
	<input type="hidden" name="chooseWireId" value="${sessionScope.chooseIdS500}">
</c:if>

<c:if test="${sessionScope.chooseIdS500 eq null }">
	<a href="frontController?command=show_writes_in_journeys500_2">проволока</a>
</c:if>

<!--
<a href="controller?command=go_to_view_news&idnews=${news.idnews}">viewlink	</a>

 
<input type="image" src="images/write.png" width="25px" height="25px" >	

<c:import url="/WEB-INF/jsp/show_journalS500.jsp" />
   
<input type="number" name="wire_idwire" value="" required="required" placeholder="введите № п/п проволоки">
     -->
</td>

<td>
<textarea name="note" rows="2" cols="45" placeholder="примечание"></textarea>
</td>
</td>
</tr>
</table>
</br>
</br>
<div align="left">
<button type="submit"> <img src="images/write.png" width="25px" height="25px" >Сделать запись  </button>
</div>
</form>
 
 <form action="frontController"  method="get" target="_blank">
 <input type="hidden" name="command" value = "show_5_in_journey">
 <div align="left">
 </br>
  </br>
<button type="submit"> <img src="images/show.png" width="25px" height="25px" >Журнал </button>
</div>
 </form>
 
 </div>
</body>
</html>