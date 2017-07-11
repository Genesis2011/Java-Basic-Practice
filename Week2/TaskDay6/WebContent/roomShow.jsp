<%@page import="task.entity.Room"%>
<%@page import="java.util.List"%>
<%@page import="task.bin.RoomBin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>房间信息展示</title>
</head>
<body>
	<p><a href="manager.jsp">管理</a></p>
	<p><a href="customerShow.jsp">客人信息展示</a></p>
	<p><a href="roomTypeShow.jsp">房间类型信息展示</a></p>
	<p><a href="userShow.jsp">用户信息展示</a></p>
	
	<table border="1" cellspacing="0">
		<tr><td>房间号</td><td>房间状态</td><td>房间类型</td></tr>
	<%
		request.setCharacterEncoding("UTF-8");
		out.print(session.getAttribute("name"));
		RoomBin rb=new RoomBin();
		List<Room> list=rb.query();
		for(Room r : list){
	%>
		<tr>
		<td><%=r.getRoomId() %></td>
		<td><%=r.getState() %></td>
		<td><%=r.getType() %></td>
		</tr>
	<%
		}
	%>
	</table>
</body>
</html>