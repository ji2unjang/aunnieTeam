<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">
<!-- Latest compiled and minified JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="cWriteOk">
<div class="form-group container">
coupon_type <input type="text" name="coupon_type" id="coupon_type" class="form-control" /> </br>
coupon_title <input type="text" name="coupon_title" id="coupon_title" class="form-control"/></br>
discount <input type="text" name="discount" id="discount" class="form-control"/></br>
min_price <input type="text" name="min_price" id="min_price" class="form-control"/></br>
max_price <input type="text" name="max_price" id="max_price" class="form-control"/></br>
max_quantity <input type="text" name="max_quantity" id="max_quantity" class="form-control"/></br>
brand_name <input type="text" name="brand_name" id="brand_name" class="form-control"/></br>
<div class="form-group has-warning  has-feedback">
type_no <input type="text" name="type_no" id="type_no" class="form-control"/>
<span class="glyphicon glyphicon-ok form-control-feedback" aria-hidden="true"></span>

</div><button type="submit" class="btn btn-danger">완료</button>
</div>	
</form>
</body>
</html>