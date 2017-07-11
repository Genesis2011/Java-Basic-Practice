<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
	<% request.setCharacterEncoding("UTF-8"); %>
	<form action="loginControl.jsp" method="post">
		<p>用户名称:<input type="text" name="username" value="" placeholder="请输入用户名"/></p>
		<p>用户密码:<input type="password" name="pwd"/></p>
		<p><input type="submit" value="登录"/></p>
	</form>
</body>
</html>