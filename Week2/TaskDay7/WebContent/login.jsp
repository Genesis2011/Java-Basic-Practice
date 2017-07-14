<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
<style>
	form{
		width:400px;
		height:215px;
		border:1px black solid;
		background-image:url(images/background.jpg);
		background-size:100%;
		color:#fff;
		padding-top:280px;
	}
	form input{
		background-color:black;
		border:1px solid black;
		border-bottom:1px solid #fff;
		color:#fff;
	}
	form a{
		color:#fff;
		font-size:12px;
		text-decoration:none;
	}
</style>
</head>
<body>
	<% request.setCharacterEncoding("UTF-8"); %>
	<form action="loginControl.jsp" method="post">
		<p>用户名称:<input type="text" name="username" value="" placeholder="请输入用户名"/></p>
		<p>用户密码:<input type="password" name="pwd"/></p>
		<p><input type="submit" value="登录"/>&nbsp;&nbsp;&nbsp;&nbsp;<a href="register.jsp">注册信息</a></p>
		<%
			String message="";
			if(request.getParameter("t")!=null){
				message="注册成功";
			}
		%>
		<%=message %>
	</form>
</body>
</html>