<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	注册信息页面
	<form action="registerControl.jsp" method="post">
		<p><input type="text" name="username"/></p>
		<p><input type="password" name="pwd"/></p>
		<p><input type="submit"/></p>
	</form>
	<%
		request.setCharacterEncoding("UTF-8");
		String message="";
		if(request.getParameter("t")!=null){
			message="注册失败";
		}
	%>
	<%=message %>
</body>
</html>