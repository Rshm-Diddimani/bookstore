package com.js.dto;

public class Book {

	private int id;
	private String book_name;
	private String author_name;
	private int no_of_pages;
	private double price;
	public int getId()
	{
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public  String getBook_name() {
		return book_name;
	}
	
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	
	public String getauthor_name(){
		return author_name;
	}
	
	public void setauthor_name(String author_name) {
		this.author_name = author_name;
	}
	
	public int getno_of_pages() {
		return no_of_pages;
	}
	
	public void setno_of_pages(int no_of_pages) {
		this.no_of_pages = no_of_pages;
	}
	
	public double getprice() {
		return price;
	}
	
	public void setprice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book [id=" + id + ", book_name=" + book_name + ", author_name=" + author_name + ", no_of_pages="
				+ no_of_pages + ", price=" + price + "]";
	}

	
}
