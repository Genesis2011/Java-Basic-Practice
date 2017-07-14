<%@page import="task.entity.User"%>
<%@page import="java.util.List"%>
<%@page import="task.bin.RoomTypeBin"%>
<%@page import="task.entity.RoomType"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>房间类型信息表</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String name="";
		if(session.getAttribute("user")==null){
			response.sendRedirect("login.jsp");
		} else {
			name=((User)session.getAttribute("user")).getName();
		}
	%>
	<%=name %><br/>
	<p><a href="manager.jsp">管理</a></p>
	<p><a href="customerShow.jsp">客人信息表</a></p>
	<p><a href="roomShow.jsp">房间信息表</a></p>
	<p><a href="userShow.jsp">用户信息表</a></p>
	 
	<table border="1" cellspacing="0">
		<tr><td>类型编号</td><td>类型名称</td><td>日租金</td><td>床位数</td><td>人数</td></tr>
	<%
		request.setCharacterEncoding("UTF-8");
		out.print(session.getAttribute("name"));
		RoomTypeBin rtb=new RoomTypeBin();
		List<RoomType> list=rtb.query();
		for(RoomType rt : list){
	%>
		<tr>
		<td><%=rt.getTypeId() %></td>
		<td><%=rt.getName() %></td>
		<td><%=rt.getMoney() %></td>
		<td><%=rt.getBedNum() %></td>
		<td><%=rt.getcNum() %></td>
		</tr>
	<%
		}
	%>
	</table>
</body>
</html>