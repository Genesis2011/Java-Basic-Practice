<%@page import="task.entity.User"%>
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
<title>客人信息表</title>
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
	<p><a href="roomShow.jsp">房间信息表</a></p>
	<p><a href="roomTypeShow.jsp">房间类型信息表</a></p>
	<p><a href="userShow.jsp">用户信息表</a></p>
	
<%-- 	<table border="1" cellspacing="0">
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
	%> --%>
	<form action="customerShow.jsp" method="post">
		按照编号<input type="radio" checked value="1" name="search"/>
		按照姓名<input type="radio" value="2" name="search"/>
		<br/>
		客人信息:<input type="text" name="c"/>
			   <input type="submit" value="查询"/><br/>
	</form>
	<table border="1" cellspacing="0">
		<tr><td>编号</td><td>姓名</td><td>身份证</td><td>电话</td><td>时间</td><td>房间编号</td><td>功能1</td><td>功能2</td></tr>
	<%
		CustomerBin cb=new CustomerBin();
		List<Customer> list;
		
		if(request.getParameter("c")==null || request.getParameter("c").trim()=="")
			list=cb.queryAll();
		else{
			if("1".equals(request.getParameter("search")))
				list=cb.search(new Integer(request.getParameter("c")));
			else
				list=cb.search(request.getParameter("c"));
		}
			
		for(Customer c : list){
	%>
		<tr>
		<td><%=c.getId() %></td>
		<td><%=c.getName() %></td>
		<td><%=c.getCid() %></td>
		<td><%=c.getPhone() %></td>
		<td><%=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(c.getBeginTime()) %></td>
		<td><a href="roomShow.jsp?id=<%=c.getRoomId() %>"><%=c.getRoomId() %></a></td> 
		<td><a href="">修改</a></td>
		<td><a href="customerDelControl.jsp?id=<%=c.getId() %>">删除</a></td>
		</tr>
	<% 
	}
	%>
	</table>
	<p><a href="customerAdd.jsp">添加客人信息</a></p>
	
</body>
</html>