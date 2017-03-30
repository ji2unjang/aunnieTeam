<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="writeOk">
	<table>
	<select name="q_type">
    <option value="질문">질문</option>
    <option value="욕">욕</option>
    <option value="요구">요구</option>
   </select>
	

	<input type="text" name="q_contents" id="" />
	<input type="text" name="a_contents" id="" />

	<input type="text" name="product_no" id="" />
	<input type="text" name="member_no" id="" />
	<input type="text" name="order_no" id="" />
	<input type="submit" value="전송" />
	
	</table>
	</form>
</body>
</html>