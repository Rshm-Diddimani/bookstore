<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
@import
	url('https://fonts.googleapis.com/css2?family=DM+Sans&family=EB+Garamond:wght@400;500&family=Poppins:wght@300;500&display=swap')
	;

* {
	font-family: 'Poppins', sans-serif;
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	min-height: 100vh;
	overflow: hidden;
}

.container h1 {
	font-family:Georgia, Arial and Helvetica;
	text-align: center;
	padding-bottom: 20px;
}

.container {

	position: relative;
	max-width: 700px;
	width: 100%;
	top:100px;
	left:100px;
	background: white;
	padding: 25px;
	border-radius: 20px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 1);
}

.container .btngroup {
	transform: translate(30%, 2%);
	transition: all 0.2s ease;
}

.container .btn {
	position: relative;
	height: 40px;
	width: 40%;
	border: 2px solid #ddd;
	border-radius: 30px;
	margin-top: 10px;
	padding: 0 15px;
	text-align: center;
	cursor: pointer;
	border: none;
	background: #AFAFB0;
	box-shadow: 0 0 5px rgba(0, 0, 0, 1);
}

.btn a {
	color: #301934;
	text-decoration: none;
	font-size: 25px;
	
}

.container .btn:hover {
	background: #180B34;
}

.btn a:hover {
	color:white;
}

</style>
</head>
<body>

<div class="container">
		<% String s = (String)request.getAttribute("msg"); %>
		<h1><%= s %></h1>
		<hr>
		<div class="btngroup">
			<div class="btn">
				<a href="welcome.jsp">HOME</a>
			</div>

			<div class="btn">
				<a href="home.jsp">BACK</a>
			</div>
		</div>

	</div>
 	
</body>
</html>