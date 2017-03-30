<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
	<h2>리스트</h2>
	
	<c:forEach var="l" items="${list }">
	<tr>
	<td>${l.q_type}</td>
	<td>${l.q_date}</td>
	<td><a href="deleteOk?q_no=${l.q_no}">${l.q_contents}</a></td>
	<td>${l.a_contents}</td>
	<td>${l.a_date}</td>
	<td>${l.product_no}</td>
	<td>${l.member_no}</td>
	<td>${l.order_no}</td>
	</tr>
	
	</c:forEach>
</table>
	
</body>
</html>