<%@page import="java.time.LocalDate"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Сетка сварная ГОСТ 23279-2012</title>


<body background="images/journal3.jpg">
<h1 align="center" color="green">Сетка сварная ГОСТ 23279-2012</h1>
<form name="select" action="frontController"  method="post" target="_blank">
<table width="1080px" border="1" align="center" cellspacing="0" >
<tr>
<td>Наименование сетки</td>
<td>Размер продольной ячейки, мм</td>
<td>Размер поперечной ячейки, мм</td>
<td>Фактический диаметр проволоки, мм</td>
<td>Дата </td>
</tr>
<tr>
<td>
             <select >
             <option value="0" selected>Выберите сетку из списка</option>
             <option value="1"> 4S500 50x50 </option>
             <option value="2"> 4S500 100x100 </option>
             <option value="3"> 4S500 150x150 </option>
             <option value="4"> 4S500 200x200 </option>
             <option value="5"> 5S500 50x50 </option>
             <option value="6"> 5S500 100x100 </option>
             <option value="7"> 5S500 150x150 </option>
             <option value="8"> 5S500 200x200 </option>
             <option value="9"> 6S500 50x50 </option>
             <option value="10"> 6S500 100x100 </option>
             <option value="11"> 6S500 150x150 </option>
             <option value="12"> 6S500 200x200 </option>
             
             </select>            
                       
     
</td>
<td>
<input type="number" name="cell_1" value="" required="required" placeholder="введите значение">
</td>
<td>
<input type="number" name="cell_2" value="" required="required" placeholder="введите значение">
</td>
<td>
<input type="number" name="diameter" value="" required="required" placeholder="введите значение"></td>
<td>
<%LocalDate localDate = LocalDate.now();
out.println(localDate.toString());

%>
</td>
</tr>




</table>
</br>
</br>
<div align="right">
<button type="submit"> <img src="images/write.png" width="50px" height="50px" ><h3>Сделать запись в журнал</h3>  </button>
</div>

 </form>
</body>
</html>