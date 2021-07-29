<%@page import="com.amdocs.training.doa.UserDoa"%>
<%@page import="com.amdocs.training.doa.doaimp.Impl"%>
<%@page import="com.amdocs.training.controller.User" %>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>User Table</h3>
<table border="1">
<tr>
<th>userid</th>
<th>Name</th>
<th>password</th>
<th>phone</th>
<th>Address</th>
<th>Email</th>
<th>regdate</th>
<th>imagelink</th>
</tr>

	<%
UserDoa dao = new Impl();
List<User> list = dao.findAll();



for (User user : list) {
%>



<tr>
<td><%=user.getUserid()%></td>
<td><%=user.getName()%></td>
<td><%=user.getPassword()%></td>
<td><%=user.getPhone()  %></td>
<td><%=user.getAddress() %></td>
<td><%=user.getEmail() %></td>
<td><%=user.getRegDate() %></td>
<td><%=user.getUploadImg() %></td>

</tr>
<br>
<%
}
%>
</table>
	<br>

</body>
</html>