<%@page import="task.entity.User"%>
<%@page import="task.bin.UserBin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("username");
		String pwd=request.getParameter("pwd");
		//添加
		User u=new User();
		u.setName(name);
		u.setPassword(pwd);
		UserBin ub=new UserBin();
		if(ub.add(u)){
	%>
		<script>
			/* alert("注册成功"); */
			location.href="login.jsp?t=0";
		</script>
	<%
			/* response.sendRedirect("login.jsp"); */
		}else{
			/* response.sendRedirect("register.jsp"); */
	%>
		<script>
			/* alert("注册失败"); */
			location.href="register.jsp?t=1";
		</script>
	<%
		}
	%>
</body>
</html>