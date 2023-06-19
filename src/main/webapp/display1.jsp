<%@page import="com.js.dto.Book"%>
<%@page import="com.js.dao.BookCRUD"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
@import
	url('https://fonts.googleapis.com/css2?family=Noto+Sans:wght@300&display=swap')
	;
* {
	font-size: 25px;
	font-family: 'Noto Sans', sans-serif;
}
body{
	min-height: 100vh;
  	display: flex;
  	align-items: center;
  	justify-content: center;
  	padding:20px;
  	overflow: hidden; 
}

.heading{
	background-color: #E73B89;
	color: #EDECEC;
}

#id{
	background-color: #E73B89;
	color: #EDECEC;
}
.link {
	text-decoration: none;
	color: #C60D0D;
	font-weight: bold;
}

.link:hover {
	overflow: hidden;
	color: #252525;
	font-weight: bold;
}
</style>
</head>
<body>

	<%
		ArrayList<Book> book = (ArrayList) request.getAttribute("data");
	%>

	<table border="3px" cellspacing="0px" cellpadding="20px">
		<tr class="heading" background="gray">
			<th id="id">Id</th>
			<th>BookName</th>
			<th>Author</th>
			<th>No_Of_Pages</th>
			<th>Price</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>

		<%
			for (Book b : book) {
		%>
		<tr>
			<td id="id"><%=b.getId()%></td>
			<td><%=b.getBook_name()%></td>
			<td><%=b.getauthor_name()%></td>
			<td><%=b.getno_of_pages()%></td>
			<td><%=b.getprice()%></td>
			<td><a class="link" href="delete?id=<%=b.getId()%>">Delete</a></td>
			<td><a class="link" href="update?id=<%=b.getId()%>">Edit</a></td>

		</tr>
		<%
			}
		%>
	</table>
</body>
</html>