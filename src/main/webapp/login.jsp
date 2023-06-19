<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">

*{
	padding:0;
	margin:0;
	background: #3498db;
}
.loginbox{
	width: 400px;
	height:300px;
	padding:50px;
	position: absolute;
	top: 45%;
	left: 50%;
	background-color: #191919;
	opacity: 0.8;
	box-shadow: -20px 5px 29px 0px rgba(0,0,0,0.75);
	transform: translate(-50%, -50%);
	text-align: center;
	border-radius: 25px;
	border: 2px solid #0000FF;
	
}

.loginbox h2{
	color: #fff;
	text-transform: uppercase;
	font-weight: bold;
	background: none;
	
}

.loginbox input[type = "text"], input[type = "password"] {
	border:0px;
	background: none;
	margin:30px auto;
	display: block;
	border: 2px solid #0000FF;
	text-align: center;
	padding: 14px 10px;
	width: 300px;
	outline: none;
	border-radius: 24px;
	color:#fff;
	transform:0.25s;
}

.loginbox input[type= "submit"] {
	border: 0;
	background: none;
	margin: 20px auto;
	display: block;
	border: 2px solid #2ecc71; 
	text-align: center;
	padding: 14px 60px;
	border-radius: 24px;
	color:#fff;
	outline: none;
	transform:0.25s;
}
.loginbox input[type= "submit"]:hover{
	background-color: #2ecc71;
}

.loginbox input[type = "text"]:focus, input[type = "password"]:focus {
	width: 280px;
	border-color: #2ecc71;
}
</style>

</head>
<body>
	<form action="login" method="post" class="loginbox">
		<h2>Login Here..</h2>
		<input type="text" name="email" placeholder="@Email">
		<input type="password" name="pwd" placeholder="Password">
		<input type="submit" value="Login">
	</form>
</body>
</html>