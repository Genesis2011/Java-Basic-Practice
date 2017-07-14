<%@page import="task.entity.RoomE"%>
<%@page import="task.entity.User"%>
<%@page import="task.entity.Room"%>
<%@page import="java.util.List"%>
<%@page import="task.bin.RoomBin"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>房间信息表</title>
<style>
	div{
		border:2px solid black;
		width:200px;
		height:auto;
		padding:20px;
		text-align: center;
		margin:0 auto;
	}
</style>
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
	<p><a href="roomTypeShow.jsp">房间类型信息表</a></p>
	<p><a href="userShow.jsp">用户信息表</a></p>

	<%-- <table border="1" cellspacing="0">
		<tr><td>房间号</td><td>房间状态</td><td>房间类型</td></tr>
	<%
		request.setCharacterEncoding("UTF-8");
		out.print(session.getAttribute("name"));
		RoomBin rb=new RoomBin();
		List<Room> list=rb.query();
		for(Room r : list){
	%>
		<tr>
		<td><%=r.getRoomid() %></td>
		<td><%=r.getState() %></td>
		<td><%=r.getType() %></td>
		</tr>
	<%
		}
	%> --%>
	
	<form action="roomShow.jsp">
	输入房间编号:<input type="text" name="id"/>
			  <input type="submit" value="查询"/>
	</form>
	<%
	 	if(request.getParameter("id")==null || request.getParameter("id").trim()==""){
	 		RoomBin rb=new RoomBin();
		 	List<RoomE> list=rb.queryRT();
	%>
	<table border="1" cellspacing="0">
		<tr><td>房间编号</td><td>房间状态</td><td>房间类型编号</td><td>房间类型</td><td>日租金</td><td>床位数</td><td>标准人数</td></tr>
	<%
		 	for(RoomE r : list){
	%>
		<tr>
		<td><%=r.getRoomid() %></td>
		<td><%=r.getState() %></td>
		<td><%=r.getType() %></td>
		<td><%=r.getRoomType().getName() %></td>
		<td><%=r.getRoomType().getMoney() %></td>
		<td><%=r.getRoomType().getBedNum() %></td>
		<td><%=r.getRoomType().getcNum() %></td>
		</tr>
	<%	 	}
	 	}else{
		 	Integer roomid=new Integer(request.getParameter("id"));
		 	RoomBin rb=new RoomBin();
		 	List<RoomE> list=rb.searchRT(roomid);
		 	for(RoomE r : list){
		 		out.print("<div>房间编号:"+r.getRoomid()+"<br/>");
		 		out.print("房间状态:"+r.getState()+"<br/>");
		 		out.print("房间类型编号:"+r.getType()+"<br/></div>");
		 		/* RoomTypeBin rtb=new RoomTypeBin();
		 		List<RoomType> tlist = rtb.search(r.getType());
		 		for(RoomType rt : tlist){ */
		 			out.print("<div>房间类型:"+r.getRoomType().getName()+"<br/>");
		 			out.print("日租金:"+r.getRoomType().getMoney()+"<br/>");
		 			out.print("床位数:"+r.getRoomType().getBedNum()+"<br/>");
		 			out.print("标准人数:"+r.getRoomType().getcNum()+"<br/></div>");
		 		/* } */
		 	}
	 	}
	 %>
	</table>
</body>
</html>