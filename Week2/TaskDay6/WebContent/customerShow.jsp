<%@page import="java.text.SimpleDateFormat"%>
<%@page import="task.entity.Customer"%>
<%@page import="java.util.List"%>
<%@page import="task.bin.CustomerBin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>客人信息展示</title>
</head>
<body>
	<p><a href="manager.jsp">管理</a></p>
	<p><a href="roomShow.jsp">房间信息展示</a></p>
	<p><a href="roomTypeShow.jsp">房间类型信息展示</a></p>
	<p><a href="userShow.jsp">用户信息展示</a></p>
	
	<table border="1" cellspacing="0">
		<tr><td>编号</td><td>姓名</td><td>身份证</td><td>电话</td><td>时间</td><td>房间编号</td></tr>
	<%
		request.setCharacterEncoding("UTF-8");
		out.print(session.getAttribute("name"));
		CustomerBin cb=new CustomerBin();
		List<Customer> list=cb.queryAll();
		for(Customer c : list){
	%>
		<tr>
		<td><%=c.getId() %></td>
		<td><%=c.getName() %></td>
		<td><%=c.getCID() %></td>
		<td><%=c.getPhone() %></td>
		<td><%=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(c.getBeginTime()) %></td>
		<td><%=c.getRoomId() %></td> 
		</tr>
	<%
		}
	%>
	</table>
</body>
</html>