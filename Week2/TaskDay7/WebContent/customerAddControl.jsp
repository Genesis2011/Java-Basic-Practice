<%@page import="task.entity.User"%>
<%@page import="task.entity.Customer"%>
<%@page import="task.bin.CustomerBin"%>
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
		String username="";
		if(session.getAttribute("user")==null){
			response.sendRedirect("login.jsp");
		} else {
			username=((User)session.getAttribute("user")).getName();
		}
	%>
	<%=username %><br/>
	<%
		CustomerBin cb=new CustomerBin();
		String name=request.getParameter("name");
		String cid=request.getParameter("cid");
		String phone=request.getParameter("phone");
		Integer roomid=new Integer(request.getParameter("roomid"));
		Customer customer=new Customer();
		customer.setName(name);
		customer.setCid(cid);
		customer.setPhone(phone);
		customer.setRoomId(roomid);
		if(cb.addCustomer(customer)){
	%>
		<script>
			alert("添加成功");
			location.href="customerAdd.jsp";
		</script>
	<%
		}else{
	%>
		<script>
			alert("添加失败");
			location.href="customerAdd.jsp";
		</script>
	<%
		}
	%>
</body>
</html>