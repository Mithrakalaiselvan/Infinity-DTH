<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="lightblue">
<div>
<marquee>Infinity DTH Srvices</marquee>
</div>
<hr>
<div align="center">
<form name="log" action="<%=request.getContextPath()%>/InfinityController?actionCheck=login" method="post">
 <table>
 <tr><td><label>Username</label></td>
 <td><input type="text" name="username" title="Enter username" onmouseover="javascript.alert('title')"/></td>
 </tr><tr>
 <td><label>Password</label></td>
 <td><input type="password" name="passwd" title="Enter password" onmouseover="javascript.alert('title')"/></td>
 </tr>
 <tr><td></td><td><input type="submit" value="LOGIN"/></td></tr>
 </table>
 </form>
 </div>

</body>
</html>