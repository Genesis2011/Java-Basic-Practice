<%@page import="task.entity.Customer"%>
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
	<%
		CustomerBin cb=new CustomerBin();
		int id=new Integer(request.getParameter("id"));
		Customer customer=new Customer();
		customer.setId(id);
		if(cb.delCustomer(customer)){
	%>
			<script>
				alert("删除成功");
				location.href="customerShow.jsp";
			</script>
	<%
			}else{
	%>
			<script>
				alert("删除失败");
				location.href="customerShow.jsp";
			</script>
	<%
		}
	%>
</body>
</html>