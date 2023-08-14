<%@ page language="java" contentType="text/html; charset= utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="styles/index.css">
<style>

 body {
background: url(images/bg.bmp);
background-size: 100%;
} 
</style>
</head>
<body text="blue" >

<br/>
<form action="frontController" method="post">
<h1><legend>Вход пользователя</legend></h1>
<input type="hidden" name="command" value = "go_to_base_page" /> 

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