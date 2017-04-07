<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${dto.coupon_no }
${dto.coupon_title }
${dto.discount }
<a href="cModifyForm?coupon_no=${dto.coupon_no }">수정</a>
<a href="cDelete?coupon_no=${dto.coupon_no }">삭제</a>
</body>
</html>