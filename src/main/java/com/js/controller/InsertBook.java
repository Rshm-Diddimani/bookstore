package com.js.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.BookCRUD;
import com.js.dto.Book;

@WebServlet(value = "/savebook")
public class InsertBook extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String book_name = req.getParameter("name");
		String author_name = req.getParameter("author");
		int no_of_pages = Integer.parseInt(req.getParameter("page"));
		double price = Double.parseDouble(req.getParameter("price"));
		
		Book b = new Book();
		b.setId(id);
		b.setBook_name(book_name);
		b.setauthor_name(author_name);
		b.setno_of_pages(no_of_pages);
		b.setprice(price);
		
		int result = BookCRUD.insertBook(b);
		
		RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
		
		if (result == 1) {
			req.setAttribute("msg", "Book Inserted Successfully");
			rd.forward(req, resp);
		} else {
			req.setAttribute("msg", "Not Inserted");
			rd.forward(req, resp);
		}
		
	}
	
	
}
