package com.mattiabonardi;

/**
 * 
 * @author mattia.bonardi
 *
 */

/**
 * This class represent the model of Product Entity. The class must contain only
 * attributes, getters and setters.
 */
public class Book {

	private String id;
	private String name;
	private String author;
	private double price;
	private String isbn;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
