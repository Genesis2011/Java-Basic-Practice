<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理</title>
</head>
<body>
	<% 
		request.setCharacterEncoding("UTF-8");
		out.print(session.getAttribute("name"));
	%>
	<%-- <%=request.getParameter("username") %> --%>
	<!-- 登录
		客人信息展示
		房间信息展示
		房间类型信息展示
		用户信息展示
		注意:页面间的跳转
		Extra:每个界面都有当前登录人的信息 Session
	 -->
	 <p><a href="customerShow.jsp">客人信息展示</a></p>
	 <p><a href="roomShow.jsp">房间信息展示</a></p>
	 <p><a href="roomTypeShow.jsp">房间类型信息展示</a></p>
	 <p><a href="userShow.jsp">用户信息展示</a></p>
</body>
</html>