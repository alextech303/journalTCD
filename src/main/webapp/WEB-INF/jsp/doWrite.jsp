<%@ page language="java" contentType="text/html; charset= UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="green" text="black">
<h1>Запись сделана!!!"</h1>

<form action ="frontController" method="get">
<input type="hidden" name="command" value = "go_to_base_page" />
<button type="submit"> Вернуться к списку журналов    </button> 
</form>

</body>
</html>