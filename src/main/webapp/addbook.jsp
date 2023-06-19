<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="addupdatebook.css">
</head>
<body>

	<section class="container">
	<header>
		Books Store
	</header>
	<hr>
	<form action="savebook" method="post" class="form">
		<div class="input-box">
			<label>Book Id</label>
			<input type="number" name="id">
		</div>
		<div class="input-box">
			<label>BookName </label>
			<input type="text" name="name">
		</div>
		<div class="input-box">
			<label>Author </label>
			 <input type="text" name="author">
		</div>
		<div class="input-box">
			 <label>No-of-pages </label>
			 <input type="number" name="page">
		</div>
		<div class="input-box">
			 <label>Price </label>
			 <input type="number" name="price">
		</div>
		<input type="submit" value="SUBMIT">
	</form>

	</section>
</body>
</html>