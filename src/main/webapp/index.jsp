<%@ page language="java" contentType="text/html; charset= utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body background="images/bg.bmp" text="blue">

<br/>
<form action="frontController" method="post">
<h1><legend>Вход пользователя</legend></h1>
<input type="hidden" name="command" value = "forward" /> 

<input type="text" name="login" value="" placeholder="Имя пользователя"/>
<br/>
<br/>
<input type="password" name="password" value="" placeholder="Пароль пользователя" /><br/>
<br/>
<br/>
<button type="submit"> <img src="images/login.png" width="20px" height="20px">Войти в учетную запись  </button>

</form>



</body>
</html>