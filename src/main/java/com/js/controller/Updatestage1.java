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

@WebServlet(value= "/update")
public class Updatestage1 extends HttpServlet{
	@Override
//	Anchor tag only supports doget() method
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		
		Book b1 = BookCRUD.getBookByID(id);
		if (b1 != null) {
			RequestDispatcher rd = req.getRequestDispatcher("update.jsp");
			req.setAttribute("book", b1);
			rd.forward(req, resp);
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
			req.setAttribute("book", "No Book To Update");
			rd.forward(req, resp);
		}
	}
}
