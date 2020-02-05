<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>

<form action="login" method="post">

Enter Username: <input type="text" name="username" required="required"><br><br>
Enter Password: <input type="text" name="password" required="required"><br><br>
<input type="submit" value="login"><br>
</form>
<form action="register">
<br><br><input type="submit" value="register">
<br><br>
<font color="red">${errmsg}</font>

</form>

</body>
</html>