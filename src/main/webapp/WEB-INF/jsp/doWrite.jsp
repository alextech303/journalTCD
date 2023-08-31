<%@ page language="java" contentType="text/html; charset= UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="styles/error.css">
</head>
<body>
<div class="center">
<h2>Записано!!! <img alt="www" src="images/2.png" width="50px" height="50px"></h2>
</div>

<form action ="frontController" method="get">
<input type="hidden" name="command" value = "go_to_base_page" />
<button type="submit" > <img src="images/back.jpg" width="35px" height="35px" > Вернуться к списку журналов    </button> 
</form>

</body>
</html>