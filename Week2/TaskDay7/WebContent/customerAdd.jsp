<%@page import="task.bin.CustomerBin"%>
<%@page import="task.entity.User"%>
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
	 <p><a href="roomTypeShow.jsp">房间类型信息表</a></p>
	 <p><a href="userShow.jsp">用户信息表</a></p>
	<form action="customerAddControl.jsp" method="post">
	<table border="1" cellspacing="0">
		<tr><td>姓名</td><td>身份证</td><td>电话</td><td>时间</td><td>房间编号</td></tr>
	 	<tr>
	 	<td><input type="text" name="name"/></td>
	 	<td><input type="text" name="cid"/></td>
	 	<td><input type="text" name="phone"/></td>
	 	<td>默认为当前系统时间</td>
	 	<td><input type="text" name="roomid"/></td>
	 	</tr>
	 </table>
	 	<input type="submit" value="添加"/>
	 </form>
		<%-- <%
			String message="";
			if(request.getParameter("t")!=null){
				message="添加成功";
			}
		%>
		<%=message %> --%>
</body>
</html>