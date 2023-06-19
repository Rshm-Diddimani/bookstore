<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="signup.css" />
</head>
<body>
<section class="container"> 
 <header>Registration Form</header>
	<form action="save" method="post" class="form">
		<div class="input-box">
			<label>ID </label>
			<input type="number" name="id" placeholder="Enter Id">
		</div>
		<div class="input-box">
			<label>Full Name </label>
			<input type="text" name="name" placeholder="Enter full name" required>
		</div>
		<div class="input-box">
			<label>Email </label>
			<input type="text" name="email" placeholder="Enter Email" required>
		</div>
		<div class="input-box">
			<label>Password </label>
			<input type="text" name="password" placeholder="Enter Password" required>
		</div>
		
		<div class="input-box">
			<label>Phone </label>
			<input type="number" name="phone" placeholder="Enter Phone number" required>
		</div>
		
		<div class="column">
		
		<div class="input-box">
			<label>Address </label>
			<input type="text" name="add" placeholder="Enter Address">
		</div>
		<div class="input-box">
			<label>Pin-code </label>
			<input type="number" name="pin" placeholder="Enter Pincode">
		</div>
		
		</div>
		<input type="submit" value="Register">
	</form>
</section>
</body>
</html>