<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/1.11.8/semantic.min.css" />
<link rel="stylesheet" type="text/css" href="css/head.css" />
<link rel="stylesheet" type="text/css" href="css/main.css" />
<link rel="stylesheet" type="text/css" href="css/list.css" />
<link rel="stylesheet" type="text/css" href="css/pdList.css" />
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/semantic-ui/1.11.8/semantic.min.js"></script>
<script type="text/javascript">
	$(function() {
		$('.ui.dropdown').dropdown();
		$('.menu .item').tab();
		$("#openModal").click(function() {
			$('.ui.modal').modal({
				inverted : true
			}).modal('show');
		});
	});
</script>
</head>
<body>
	<%@include file="/WEB-INF/views/head.jsp"%>
	<div class="container">
		<div id="selectDiv">
			<!-- 카테고리 내용 추가해주세요-->
			<select class="ui dropdown">
				<option value="">대분류</option>
				<option value="1">Male</option>
				<option value="0">Female</option>
			</select> <select class="ui dropdown">
				<option value="">증분류</option>
				<option value="1">Male</option>
				<option value="0">Female</option>
			</select> <select class="ui dropdown">
				<option value="">소분류</option>
				<option value="1">Male</option>
				<option value="0">Female</option>
			</select>
		</div>
		<div class="ui two column grid">
			<div class="row">
				<div class="column">
					<img src="img/product1.jpg" alt="" />
				</div>
				<div class="column">
					<h5>브랜드명</h5>
					<h1>상품명</h1>
					<h4>상세정보</h4>
					<div class="ui divider"></div>

					<table class="ui collapsing table" id="pdTable">
						<tbody>
							<tr>
								<td>제조사</td>
								<td>123</td>
							</tr>
							<tr>
								<td>상품용량</td>
								<td>123</td>
							</tr>
							<tr>
								<td>배송비</td>
								<td>2500원(3만원 이상 구매시 무료)</td>
							</tr>
							<tr>
								<td>별점</td>
								<td></td>
							</tr>
							<tr>
								<td>리뷰</td>
								<td></td>
							</tr>
						</tbody>
					</table>
					<div class="ui divider"></div>

					<div class="ui selection dropdown">
						<input type="hidden" name="option"> <i
							class="dropdown icon"></i>
						<div class="default text">옵션을 선택하세요</div>
						<div class="menu">
							<div class="item" data-value="1">23호</div>
							<div class="item" data-value="0">21호</div>
						</div>
					</div>
					<table class="ui collapsing table" id="pdlistTable">
						<tbody>
							<tr>
								<td>옵션명</td>
								<td>
									<div class="ui segment" id="buttonSeg">
										<div class="ui basic icon button">
											<i class="minus icon"></i>
										</div>
										<span>1</span>
										<div class="ui basic icon button">
											<i class="plus icon"></i>
										</div>
									</div>
								</td>
								<td>123원</td>
								<td><div class="ui basic icon button">
										<i class="remove icon"></i>
									</div></td>
							</tr>
							<tr>
								<td>옵션명</td>
								<td>버튼</td>
								<td>가격</td>
								<td>삭제버튼</td>
							</tr>
						</tbody>
					</table>
					<button class="big ui pink button">바로구매</button>
					<button class="big ui black basic button">장바구니</button>
					<button class="big ui black basic button">위시리스트</button>
				</div>
			</div>
		</div>

		<div class="ui top attached tabular menu">
			<a class="item active" data-tab="first">상품소개</a> <a class="item"
				data-tab="second">리뷰</a> <a class="item" data-tab="third">Q&A</a> <a
				class="item" data-tab="fourth">상품정보</a> <a class="item"
				data-tab="fifth">배송/교환/환불</a>
		</div>
		<div class="ui bottom attached tab segment active" data-tab="first">
			<img class="ui centered image" src="img/product2.jpg" alt="" />

		</div>
		<div class="ui bottom attached tab segment" data-tab="second">


			<h3 class="ui dividing header">
				미러톡 <span class="right aligned"> <a href="">> 미러톡 작성하러가기</a>
				</span>
			</h3>
			<div class="ui card">
				<div class="content">
					<div class="right floated meta">
						<i class="star icon"></i>
					</div>
					Cherry Blossom
					<div class="meta">2 days ago</div>
				</div>
				<div class="image">
					<img src="img/product1.jpg">
				</div>
				<div class="content">제가 이제품 써봤는데..</div>
				<div class="ui bottom attached button">
					<i class="add icon"></i> 미러톡 보러가기
				</div>
			</div>


			<h3 class="ui dividing header">
				포토리뷰 <span class="right aligned"> <a href="">> 리뷰 작성하기</a>
				</span>
			</h3>
			<div class="ui items">
				<div class="item">
					<div class="image">
						<img src="img/product1.jpg">
					</div>
					<div class="content">
						<a class="author">Spring</a>
						<div class="metadata">
							<div class="rating">
								<i class="star icon"></i> <i class="star icon"></i> <i
									class="star icon"></i>
							</div>
							<span class="date">Today at 5:42PM</span>
						</div>
						<div class="description">
							<div class="text">포토리뷰 들어가는 곳</div>
						</div>
					</div>
				</div>

				<div class="item">
					<div class="image">
						<img src="img/product1.jpg">
					</div>
					<div class="content">
						<a class="author">Spring</a>
						<div class="meta">
							<span>Description</span>
						</div>
						<div class="description">
							<p></p>
						</div>
					</div>
				</div>
			</div>




			<div class="ui comments">
				<h3 class="ui dividing header">
					한줄리뷰<span class="right aligned"> <a href="javascript:;"
						id="openModal">> 리뷰 작성하기</a>
					</span>
				</h3>
				<div class="comment">
					<div class="content">
						<a class="author">Spring</a>

						<div class="metadata">
							<div class="rating">
								<i class="star icon"></i> <i class="star icon"></i> <i
									class="star icon"></i>
							</div>
							<span class="date">Today at 5:42PM</span>
						</div>
						<div class="text">한줄리뷰가 들어가는 곳입니다~</div>
					</div>
				</div>
				<div class="comment">
					<div class="content">
						<a class="author">Cherry Blossom</a>
						<div class="metadata">
							<div class="rating">
								<i class="star icon"></i> <i class="star icon"></i>
							</div>
							<span class="date">2017.02.14</span>
						</div>
						<div class="text">한줄리뷰가 들어가는 곳입니다~</div>
					</div>
				</div>
			</div>

		</div>


		<div class="ui modal">
			<div class="header">리뷰작성하기</div>
			<div class="image content">
				<div class="description">
					<div class="ui internally celled grid">
						<div class="row">
							<div class="six wide column">
								<img src="img/product1.jpg">
							</div>
							<div class="ten wide column">
								<table class="ui collapsing table" id="pdTable">
									<tbody>
										<tr>
											<td>상품명</td>
											<td>메니큐어</td>
										</tr>
										<tr>
											<td>옵션</td>
											<td>체리블라썸</td>
										</tr>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div id="reviewDiv">
				<div class="field">
					<div class="ui action input">
						<label for="attachmentName" class="ui icon button btn-file">
							<i class="attach basic icon"></i> <input type="file"
							id="attachmentName" name="attachmentName" style="display: none">
						</label><input type="text" id="_attachmentName">
					</div>
				</div>
			<form class="ui reply form">
					<div class="field">
						<textarea></textarea>
					</div>
			</form>
			</div>
			<div class="actions">
				<div class="ui black deny button">Nope</div>
				<div class="ui blue labeled submit icon button">
					<i class="icon edit"></i> Add Reply
				</div>
			</div>
		</div>



		<div class="ui bottom attached tab segment" data-tab="third">Q&A</div>
		<div class="ui bottom attached tab segment" data-tab="fourth">
			상품정보</div>
		<div class="ui bottom attached tab segment" data-tab="fifth">
			배송/교환/환불</div>

	</div>
</body>
</html>