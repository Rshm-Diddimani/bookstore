package com.js.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.js.dto.Book;

public class BookCRUD {

	
	final static String path="com.mysql.cj.jdbc.Driver";
	final static String url = "jdbc:mysql://localhost:3306/book_store";
	final static String user = "root";
	final static String password = "Rashmi@123";
	
	//insertBook() method is used to insert the data to database
	public static int  insertBook(Book b) {
		String query = "insert into book values(?,?,?,?,?)";
		Connection c = null;
		try {
			Class.forName(path);
			c = DriverManager.getConnection(url,user, password);
			PreparedStatement ps = c.prepareStatement(query);
			ps.setInt(1, b.getId());
			ps.setString(2, b.getBook_name());
			ps.setString(3, b.getauthor_name());
			ps.setInt(4, b.getno_of_pages());
			ps.setDouble(5, b.getprice());
			return ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	
		
	}
	
//	GetAllBook() this method is used to get all the books present in the database
	
	public static ArrayList<Book> getAllBook(){
		ArrayList<Book> al = new ArrayList<Book>();
		String query = "Select * from book";
		Connection c = null;
		
		try {
			Class.forName(path);
			c = DriverManager.getConnection(url,user,password);
			PreparedStatement ps = c.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Book b = new Book();
				b.setId(rs.getInt(1));
				b.setBook_name(rs.getString(2));
				b.setauthor_name(rs.getString(3));
				b.setno_of_pages(rs.getInt(4));
				b.setprice(rs.getDouble(5));
				al.add(b);
			}
			return al;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return al;
	}
	
	public static int deleteBookByid(int id) {
		String query = "Delete from book where id = ?";
		Connection c = null;
		try {
			Class.forName(path);
			c = DriverManager.getConnection(url,user,password);
			PreparedStatement ps = c.prepareStatement(query);
			ps.setInt(1, id);
			int result = ps.executeUpdate();
			return result;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return 0;
	}
	
//	Get the book by price
	public static ArrayList<Book> getBookByPrice(double price){
		ArrayList<Book> al = new ArrayList<Book>();
		String query = "select * from book where price = ?";
		Connection c = null;
		
		try {
			Class.forName(path);
			c = DriverManager.getConnection(url, user,password);
			PreparedStatement ps = c.prepareStatement(query);
			ps.setDouble(1, price);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Book b  = new Book();
				b.setId(rs.getInt(1));
				b.setBook_name(rs.getString(2));
				b.setauthor_name(rs.getString(3));
				b.setno_of_pages(rs.getInt(4));
				b.setprice(rs.getDouble(5));
				al.add(b);
			}
			return al;
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		return al;
		
 	}

//	updateBookById() this method is used to update the data based on the id
	
	public int updateBookById(int id, Book b) {
		String query = "Update book set name = ?, author = ?, pages = ?, price = ? where id = ?";
		Connection c = null;
		
		try {
			Class.forName(path);
			c = DriverManager.getConnection(url,user,password);
			PreparedStatement ps = c.prepareStatement(query);
			ps.setString(1, b.getBook_name());
			ps.setString(2, b.getauthor_name());
			ps.setInt(3, b.getno_of_pages());
			ps.setDouble(4, b.getprice());
			ps.setInt(5, id);
			return ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return 0;
		
	}
	
//	getBookById() this method is used to retrive the data by id
	public static Book getBookByID(int id) {
		String query = "Select * from book where id =?";
		Connection c = null;
		try {
			Class.forName(path);
			c = DriverManager.getConnection(url,user,password);
			PreparedStatement ps = c.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Book b = new Book();
				b.setId(rs.getInt(1));
				b.setBook_name(rs.getString(2));
				b.setauthor_name(rs.getString(3));
				b.setno_of_pages(rs.getInt(4));
				b.setprice(rs.getDouble(5));
				return b;
			} else {
				return null;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return null;
		
	}
}
