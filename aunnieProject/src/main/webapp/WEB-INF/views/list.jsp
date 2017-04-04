<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>
 	<table border="1">
		<tr>
			<th>Id</th>
			<th>PW</th>
			<th>NAME</th>
			<th>닉네임</th>
			<th>이메일</th>
			<th>핸드폰</th>
			<th>주소</th>
		</tr>
		
	<c:forEach var="m" items="${list }">
		<tr>
		<td>${m.id }</td>
		<td>${m.pw }</td>
		<td>${m.name }</td>
		<td>${m.nickname }</td>
		<td>${m.email }</td>
		<td>${m.phone }</td>
		<td>${m.address }</td>
		</tr>
	</c:forEach>
	<tr>
		<td><a href="sign">회원가입</a></td>
		<td><a href="login">로그인</a></td>
	</tr>
	</table>
</body>
</html>