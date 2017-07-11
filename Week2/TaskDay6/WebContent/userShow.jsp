<%@page import="task.entity.User"%>
<%@page import="java.util.List"%>
<%@page import="task.bin.UserBin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息展示</title>
</head>
<body>
	<p><a href="manager.jsp">管理</a></p>
	<p><a href="customerShow.jsp">客人信息展示</a></p>
	<p><a href="roomShow.jsp">房间信息展示</a></p>
	<p><a href="roomTypeShow.jsp">房间类型信息展示</a></p>
	 
	<table border="1" cellspacing="0">
		<tr><td>用户编号</td><td>用户名</td><td>密码</td></tr>
	<%
		request.setCharacterEncoding("UTF-8");
		out.print(session.getAttribute("name"));
		UserBin ub=new UserBin();
		List<User> list=ub.query();
		for(User u : list){
	%>
		<tr>
		<td><%=u.getId() %></td>
		<td><%=u.getName() %></td>
		<td><%=u.getPassword() %></td>
		</tr>
	<%
		}
	%>
	</table>
</body>
</html>