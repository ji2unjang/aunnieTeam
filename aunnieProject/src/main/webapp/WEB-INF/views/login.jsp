<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-beta.18/css/uikit.min.css" />
<script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-beta.18/js/uikit.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/uikit/3.0.0-beta.18/js/uikit-icons.min.js"></script>

<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#all{
		position: absolute;
		margin: auto;
		top: 0;
		right: 0;
		bottom: 0;
		left: 0;
		width: 400px;
		height: 400px;
		background-color : red;
		border-radius: 3px;
	}
	.uk-button{
		background-color: pink;
		margin-left: 20%;
	}
	.divForm{
		/*  position: absolute; */
		 display : inline-block;
		 margin-top: 23%;
		 margin-left : 25%;
	 	 background-color : blue;
	}
	.divbtn{
		/* background-color: green; */
		margin-top: 10%;
		margin-left: 10%;
	}
	.divLable{
		background-color: pink;
		padding-top: 17px;
		font-size: 25px;
	}
</style>
</head>
<body>
<form action="loginOk">
	<div class="row" id="all">
		<div class="divLable">
			<label>Who's there?</label>
		</div>
		<div class="divForm">
			<div class="col-md-3 col-md-offset-3">
				<div class="uk-margin">
			        <div class="uk-inline">
			            <span class="uk-form-icon" data-uk-icon="icon: user"></span>
						<input class="uk-input uk-form-width-medium" type="text" name="id" id="id" placeholder="id"/>
			        </div>
		    	</div>
			
				<div class="uk-margin">
			        <div class="uk-inline">
			            <span class="uk-form-icon" data-uk-icon="icon: lock"></span>
						<input class="uk-input uk-form-width-medium" type="text" name="pw" id="pw" placeholder="pw"/>
			        </div>
		   		</div>
			</div>
		</div>
		<div class="divbtn">		    
		    	<div class="uk-margin uk-grid-small uk-child-width-auto" uk-grid>
		            <label style="padding-top: 6px;">
		            <input class="uk-checkbox" type="checkbox" >Remember me</label>
		        	<input type="submit" class="uk-button uk-button-default" value="Let me in" />
		        </div>
		</div>        
	</div>
</form>
</body>
</html>