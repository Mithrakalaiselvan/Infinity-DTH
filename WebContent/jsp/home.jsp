<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String msg=(String)request.getAttribute("msg");
if(msg.equals("Operator"))
	session.setAttribute("Operator",msg);
if(msg.equals("Customer"))
		session.setAttribute("Customer",msg);
if(msg.equals("Admin"))
	session.setAttribute("Admin",msg);
%>
<a href="<%=request.getContextPath()%>/InfinityController?actionCheck=home">Register Customer</a>
</body>
</html>