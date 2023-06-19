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

@WebServlet(value="/edit")
public class UpdateStage2 extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
		
		BookCRUD bc = new BookCRUD();
		int result = bc.updateBookById(id, b);
		
		if (result == 1) {
			RequestDispatcher rd = req.getRequestDispatcher("view");
			rd.forward(req, resp);
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
			req.setAttribute("msg", "No Book Available to Update");
			rd.forward(req, resp);
		}
	}
}
