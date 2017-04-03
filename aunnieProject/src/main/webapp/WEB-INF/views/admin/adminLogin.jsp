<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://cdn.jsdelivr.net/semantic-ui/2.2.10/semantic.min.js"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/semantic-ui/2.2.10/semantic.min.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/semantic-ui/2.2.10/components/grid.min.css">
<link href="https://fonts.googleapis.com/css?family=Comfortaa" rel="stylesheet">
<style type="text/css">
html,body{
	background-color: #ec889f;
	font-family: 'Comfortaa', cursive;
}
.ui.header{
	color: yellow;
	font-family: 'Comfortaa', cursive;
}
.column{
	border: 1px solid orange;
}
.loginForm{
	margin-top: 20.0em;
}
.field,.message{
	max-width: 800px;
}
</style>
</head>
<body>
<div class="ui container loginForm">
	<h2 class="ui dividing header pageHeader">Administrator Page</h2>
	
	<div class="ui form error">
	  <div class="field">
	    <label>id</label>
	    <input type="text" placeholder="Enter your id.">
	  </div>
	  <div class="field">
	    <label>password</label>
	    <input type="password" placeholder="Enter the password.">
	  </div>
	   <div class="ui error message">
		    <div class="header">Action Forbidden</div>
		    <p>You can only sign up for an account once with a given e-mail address.</p>
  	   </div>
	  <div class="ui submit button">Submit</div>
	</div>
</div>
</body>
</html>