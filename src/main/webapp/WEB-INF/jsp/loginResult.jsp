<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="model.User, model.Login" %>
<%
	Login canLogin = (Login)request.getAttribute("canLogin");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン結果画面</title>
</head>
<body>
<h1>どこつぶログイン</h1>
<% if (canLogin.getCanLogin()){ %>
	<% User loginUser = (User)session.getAttribute("loginingUser"); %>
	ログインに成功しました<br>
	ようこそ<%= loginUser.getName() %>さん<br>
	<a href="Main">つぶやき投稿・閲覧へ</a>
<% }else{ %>
	ログインに失敗しました<br>
	<a href="DokoTsubuServlet">トップへ</a>
<% } %>
</body>
</html>