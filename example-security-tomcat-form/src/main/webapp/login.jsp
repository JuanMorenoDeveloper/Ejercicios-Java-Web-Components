<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Cache-Control"
	content="no-cache, no-store, must-revalidate">
<meta http-equiv="Pragma" content="no-cache">
<meta http-equiv="Expires" content="0">
<title>Login page</title>
</head>
<body>
	<h4>Login</h4>
	<form method="POST" action="j_security_check">
		<label for="username">User</label> 
		<input id="username" type="text" name="j_username"> <br> 
		<label for="password">Password</label>
		<input id="Password" type="password" name="j_password">
		<br> <input type="submit" value="enter">
	</form>
</body>
</html>
