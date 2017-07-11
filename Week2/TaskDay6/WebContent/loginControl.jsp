<%@page import="task.bin.UserBin"%>
<%@page import="task.entity.User"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录判断</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String name=request.getParameter("username");
		String pwd=request.getParameter("pwd");
		UserBin ub=new UserBin();
		User u=new User();
		u.setName(name);
		u.setPassword(pwd);
		if(ub.login(u)){
			session.setAttribute("name", name);
			response.sendRedirect("manager.jsp");
			/* request.getRequestDispatcher("manager.jsp").forward(request,response); */
		} else {
			response.sendRedirect("login.jsp");
		}
	%>
</body>
</html>