<%@page import="com.js.dto.Book"%>
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
		<header>UPDATE YOUR DATA BOOKS</header>
		<%
			Book b = (Book) request.getAttribute("book");
		%>
		<form action="edit" method="get" class="form">
			<div class="input-box">
				<label>Book Id</label> <input type="number" name="id"
					value="<%=b.getId()%>" readonly="readonly">
			</div>

			<div class="input-box">
				<label>BookName </label> <input type="text" name="name"
					value="<%=b.getBook_name()%>">
			</div>
			<div class="input-box">
				<label>Author </label> <input type="text" name="author"
					value="<%=b.getauthor_name()%>">
			</div>

			<div class="input-box">
				<label>No-of-pages </label> <input type="number" name="page"
					value="<%=b.getno_of_pages()%>">
			</div>
			<div class="input-box">
				<label>Price </label> <input type="number" name="price"
					value="<%=b.getprice()%>">
			</div>

			<input type="submit" value="UPDATE">
		</form>
	</section>
</body>
</html>