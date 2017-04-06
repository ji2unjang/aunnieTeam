<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JOIN</title>
<style type="text/css">
.hidden {
	display: none;
}
</style>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/semantic-ui/2.2.10/semantic.min.js"></script>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/semantic-ui/2.2.10/semantic.min.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/semantic-ui/2.2.10/components/grid.min.css">
<script type="text/javascript">
	$(function() {
		$("#year").on("click",function(){
			$("#birthday").val(birthday);
			console.log($("#birthday").val());	
			
		});
		$("#month").on("click",function(){
			var birthday =$("#year").val().substring(2,4)+"/"+$("#month").val()+"/"+$("#day").val();
			$("#birthday").val(birthday);
			console.log($("#birthday").val());	
			
		});
		$("#day").on("click",function(){
			var birthday =$("#year").val().substring(2,4)+"/"+$("#month").val()+"/"+$("#day").val();
			$("#birthday").val(birthday);
			console.log($("#birthday").val());	
			
		});
		
		var reg_id = /^[a-z0-9_-]{6,12}$/; 
		var reg_pw = /^[a-z0-9_-]{6,12}$/; 
		var reg_email = /([\w-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([\w-]+\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\]?)$/;
		var reg_name =/[ㄱ-ㅎ|ㅏ-ㅣ|가-힣]{2,}/;
		var reg_nickname = /[0-9a-zA-Zㄱ-ㅎ|ㅏ-ㅣ|가-힣]{2,10}/;
		var reg_phone = /^\d{3}\d{3,4}\d{4}$/;
		var birthday = /^\d{2}\/\d{2}\/\d{2}$/;
		
		
		$("#btn").on("click",function() {
			
		 	if(!reg_id.test($("#id").val())){ 
                alert("Id는 6자이상 12자 이하 영문,숫자로 입력하세요.");
            
    		}else if (!reg_id.test($("#pw").val())){
				alert("Pw는 6자이상 12자 이하 영문,숫자로 입력하세요.")
			
			}else if ($("#rpw").val() != $("#pw").val()) {
				alert("RePassword란에 Password를 확인하세요.")
				
			}else if(!reg_name.test($("#name").val())){ 
                alert("이름을 한글로 2자 이상 입력해 주세요");
              
            }else if(!reg_nickname.test($("#nickname").val())){ 
                alert("닉네임을 2자이상 10자이하 입력해 주세요");
              
           	}else if(!reg_email.test($("#email").val())){ 
                  alert("이메일 주소가 유효하지 않습니다 \n ex)aunnie@acorn.com)");
                  
            }else if (!reg_phone.test($("#phone").val())){
				alert("폰넘버를 확인하세요. \n ex)01012345678");
				
			}else if ($("#address").val()==""){
				alert("주소를 확인하세요.");
				
			}else if (!birthday.test($("#birthday").val())){
				console.log($("#birthday").val())
				alert("날짜년도를 선택하세요");
			}else{$("form").submit();}
			
		})
	})

	var test1 = "";
	function test(e) {
		console.log("pw1 value:" + $("#pw").val());
		test1 += e.key;
		if ($("#rpw").val() != $("#pw").val()) {
			$(".confirm").removeClass("hidden");
			$(".error").addClass("hidden");			
		} else {
			console.log("correct:::: " + $("#rpw").val())
			$(".error").removeClass("hidden");
			$(".confirm").addClass("hidden");
		}
	}
	$(document).ready(function(){
		var reg_id = /^[a-z0-9_-]{6,12}$/; 
	    $('#id').keyup(function(){
	        if (reg_id.test($("#id").val())) {
	            var id = $(this).val();
	            // ajax 실행
	            $.ajax({
	                type : 'POST',
	                url : 'idCheckOk',
	                data:
	                {
	                    id: id
	                },
	                success : function(result) {
	                    //console.log(result);
	                    if (result == "ok") {
	                        $("#result_id_msg").html("사용 가능한 아이디 입니다.");
	                    } else {
	                        $("#result_id_msg").html("사용 불가능한 아이디 입니다.");
	                    }
	                }
	            }); // end ajax
	        }
	    }); // end keyup
	});
</script>
</head>
<body>

<form class="ui form" action="signOk">
<div class="six fields">
  <div class="field">
    <label>ID</label>
    <input type="text" name="id" id="id" value="qweqwe" placeholder="Id는 6자이상 12자 이하 영문,숫자로 입력하세요." onkeyup="check(event);">
  </div><input type="button" value="Id체크" /><span id="result_id_msg"></span></div>
  <div class="six fields">
  <div class="field">
     <label>Password</label>
     <input type="password" name="pw" id="pw" value="qweqwe" placeholder="Pw는 6자이상 12자 이하 영문,숫자로 입력하세요.">
   </div> </div>
   <div class="six fields">
   <div class="field">
     <label>RePassword</label>
     <input type="password" id="rpw" value="qweqwe" onkeyup="test(event);" placeholder="패스워드를 확인하세요">
   </div> </div>
   <div class="six fields">
 	<div class="field">
 	<div class="confirm hidden">
		<label>비밀번호가 틀립니다.</label>
	</div>
	<div class="error hidden">
		<label>비밀번호가 Ok.</label>
	</div>
  </div> </div>
  <div class="six fields">
  <div class="field">
    <label>NAME</label>
    <input type="text" name="name" value="한글" placeholder="한글로 2자 이상 입력해 주세요" id="name" >
  </div> </div>
  <div class="six fields">
  <div class="field">
    <label>NICKNAME</label>
    <input type="text" name="nickname" value="qweqwe" placeholder="닉네임을 2자이상 10자이하 입력해 주세요" id="nickname" >
  </div> </div>
  <div class="six fields">
   <div class="field">
    <label>E-mail</label>
    <input type="email" placeholder="aunnie@acorn.com" value="aunnie@acorn.com" name="email" id="email" >
  </div> </div>
  <div class="six fields">
  <div class="field">
    <label>Phone</label>
    <input type="text" name="phone" value="01012345678" placeholder="ex)01012345678" id="phone" >
  </div> </div>
  <div class="two fields">
  <div class="field">
    <label>Address</label>
    <input type="text" name="address" value="asdasd"placeholder="주소를 입력하세요." id="address" >
  </div> </div>
  <div class="two fields">
  <div class="field">
   <label>birthday</label>
   </div></div>
   <div class="seven fields">
  <div class="field">
<select id="year" name="year">
	<option value="00">년도</option>
<c:forEach var="i" begin="0" end="${2010-1900}">
<option value="${2017-i}">${2017-i}년</option>
</c:forEach>
</select>
   </div>    
   <div class="field"> 
      <select id="month" name="month">
      <option>월</option>
      <option value="01">1월</option>
      <option value="02">2월</option>
      <option value="03">3월</option>
      <option value="04">4월</option>
      <option value="05">5월</option>
      <option value="06">6월</option>
      <option value="07">7월</option>
      <option value="08">8월</option>
      <option value="09">9월</option>
      <option value="10">10월</option>
      <option value="11">11월</option>
      <option value="12">12월</option>
    </select>
   </div>
  <div class="field"> 
      <select id="day" name="day" >
      <option>일</option>
      <c:forEach var="i" begin="1" end="30">
		<option value="${i}">${i}일</option>
		</c:forEach>
        </select>
  </div>
  </div>
 <input type="hidden" name="birthday" value="" id="birthday" />
 
 <input type="button" value="버튼" id="btn"/>
</form>
</body>
</html>