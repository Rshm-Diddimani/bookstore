package com.js.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.js.dao.BookCRUD;
import com.js.dto.Book;

@WebServlet(value="/price")
public class GetBookByPrice extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		double price = Double.parseDouble(req.getParameter("price"));
		ArrayList<Book> book = BookCRUD.getBookByPrice(price);
		
		if (book.size()>0) {
			RequestDispatcher rd = req.getRequestDispatcher("display1.jsp");
			req.setAttribute("data", book);
			rd.forward(req, resp);
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
			req.setAttribute("msg", "No Books Available In this price");
			rd.forward(req, resp);
		}
	}
	
}
