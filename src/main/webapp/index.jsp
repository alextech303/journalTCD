<%@ page language="java" contentType="text/html; charset= utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body background="images/bg.bmp" text="blue">

<br/>
<form action="frontController" method="post">
<input type="hidden" name="command" value = "forward"/> 
<h2>Введите имя:</h2>
<input type="text" name="login" value=""/>
<br/>
<br/>
<h2>Введите пароль:</h2>
<input type="password" name="password" value=""/><br/>
<br/>
<br/>
<button type="submit"> <img src="images/login.png" width="20px" height="20px">Войти в учетную запись  </button>
</form>



</body>
</html>