<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>トップ画面</title>
</head>
<body>
	<h1>どこつぶへようこそ</h1>
	<form action="DokoTsubuServlet" method="post">
		ユーザー名: <input type="text" name="user_name"><br>
		パスワード: <input type="password" name="pass"><br>
		<input type="submit" value=ログイン>
	</form>
</body>
</html>