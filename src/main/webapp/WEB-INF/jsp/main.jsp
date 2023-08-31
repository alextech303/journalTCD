<%@ page language="java" contentType="text/html; charset= UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="styles/main.css">

<style type="text/css">
body {
background: url(images/fon.jpg);
background-size: 100%;
} 

</style>



</head>
<body>

 

<h1><em>Контроль качества готовой продукции ООО "Завод тканых и сварных сеток"</em></h1>



</br>
</br>
<form action ="frontController" method="get">
<input type="hidden" name="command" value = "go_to_23279" />
<button type="submit" > <img src="images/right.png" width="25px" height="25px" > Сетка сварная в картах  </button> 
<!-- <img src="images/23279.jpg" width="140px" height="100px" > -->
</form>
</br>
</br>
<form action ="frontController" method="get">
<input type="hidden" name="command" value = "go_to_wires500" />
<div id="centerLayer">
<button type="submit"  autofocus="autofocus"><img src="images/right.png" width="25px" height="25px" >Проволока арматурная  </button> 
<!-- <img src="images/s500_2.jpg" width="50px" height="50px" > -->
</div>
</form>
</body>
</html>