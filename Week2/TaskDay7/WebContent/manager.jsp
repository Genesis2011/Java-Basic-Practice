<%@page import="task.entity.User"%>
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
		String name="";
		if(session.getAttribute("user")==null){
			response.sendRedirect("login.jsp");
		} else {
			name=((User)session.getAttribute("user")).getName();
		}
	%>
	<%=name %><br/>
	<%-- <%=request.getParameter("username") %> --%>
	<!--
		按照编号查询	地址传值	产生和接收
		客人信息表,添加	新做jsp页面进行添加,查询页面中有链接跳转
		客人信息表,修改
			在查询页面中,表格中每一行都要有修改链接,链接到修改页面,同时要传客人编号
			修改页面要在表单元素中展示原有信息
			单机提交按钮进行修改
		客人信息的删除
		注意:不需要新加页面,要有删除提示
		Extra:
			添加客人信息时要添加房间编号	编号选择添加
			添加房间信息时要添加房间类型编号	选择房间类型名称
	 -->
	 <p><a href="customerShow.jsp">客人信息表</a></p>
	 <p><a href="roomShow.jsp">房间信息表</a></p>
	 <p><a href="roomTypeShow.jsp">房间类型信息表</a></p>
	 <p><a href="userShow.jsp">用户信息表</a></p>
</body>
</html>