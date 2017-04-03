<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/semantic-ui/2.2.10/semantic.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/semantic-ui/2.2.10/semantic.min.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/semantic-ui/2.2.10/components/grid.min.css">

<style type="text/css">
	.title{
		font-weight: bold;
	}
	.transition{
		padding-top: 7px;
		padding-bottom: 7px;
		color: black;
	}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<script type="text/javascript">

$(function(){
	$('.visible.example .ui.sidebar').sidebar({
	    context: '.visible.example .bottom.segment'
	  }).sidebar('hide');
	
	$(function(){
		$('.ui.accordion').accordion();
	});
});
</script>

<body>
	<div class="ui accordion bottom attached segment pushable">
		<div class="ui visible left vertical sidebar menu">
			
			<div class="item">
				<i class="home icon"></i>
				<div class="title">기본정보</div>
			</div>
			
			<div class="item">
				<i class="tasks icon"></i>
				<div class="title">회원</div>
			</div>
			
			<div class="item">
				<i class="browser icon"></i>
				<div class="title">상품</div>
			</div>
			
			<div class="item">
				<i class="shop icon"></i>
				<div class="title">주문</div>
				<div class="content active">
					<a href="#"><p class="transition visible" style="display: block !important;">전체주문</p></a>
					<a href="#"><p class="transition visible" style="display: block !important;">주문배송</p></a>
					<a href="#"><p class="transition visible" style="display: block !important;">교환관리</p></a>
					<a href="#"><p class="transition visible" style="display: block !important;">환불관리</p></a>
				</div>
			</div>
			
			<div class="item">
				<i class="calendar Outline icon"></i>	
				<div class="title">이벤트</div>
				<div class="content ">
					<a href="#"><p class="transition visible" style="display: block !important;">요구분석..</p></a>
				</div>
			</div>
			
			<div class="item">
				<i class="ticket icon"></i>
				<div class="title ">쿠폰</div>
				<div class="content">
					<a href="#"><p class="transition visible" style="display: block !important;">쿠폰관리</p></a>
					<a href="#"><p class="transition visible" style="display: block !important;">쿠폰발급</p></a>
				</div>
			</div>
			
			<div class="item">
				<i class="comment Outline icon"></i>
				<div class="title">게시판</div>
				<div class="content">
					<a href="#"><p class="transition visible" style="display: block !important;">리뷰관리</p></a>
					<a href="#"><p class="transition visible" style="display: block !important;">미러톡관리</p></a>
					<a href="#"><p class="transition visible" style="display: block !important;">Q&A</p></a>
				</div>
			</div>
			
			<div class="item">
				<i class="signal icon"></i>
				<div class="title">통계</div>
				<div class="content">
					<a href="#"><p class="transition visible" style="display: block !important;">수익통계</p></a>
					<a href="#"><p class="transition visible" style="display: block !important;">회원통계</p></a>
					<a href="#"><p class="transition visible" style="display: block !important;">브랜드통계</p></a>
				</div>
			</div>
			<div>
				<img src="images/ds.PNG" alt="logo2" />
			</div>
		</div>
	</div>
</body>
</html>