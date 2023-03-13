<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User" %>
<% User loginUser = (User)session.getAttribute("loginingUser"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>メイン画面</title>
</head>
<body>
	<h1>どこつぶメイン</h1>
	<%= loginUser.getName()%>さん、ログイン中 <a href="Logout">ログアウト</a><br>
	<a href="Main">更新</a><br>
	<form action="Main" method="post">
		 <input type="text" name="mutter">
		 <input type="submit" value="つぶやく">
	</form>
</body>
</html>