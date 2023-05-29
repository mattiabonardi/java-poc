package com.mattiabonardi;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author mattia.bonardi
 *
 */

/**
 * This class represent the Data Transfer Obect Class of Product Entity. The
 * class can contains the serialization rules. In this case I choose Jackson for
 * serialization.
 */
public class BookDTO {

	@JsonProperty("id")
	private String id;

	@JsonProperty("name")
	private String name;

	@JsonProperty("author")
	private String author;

	@JsonProperty("price")
	private double price;

	@JsonProperty("isbn")
	private String isbn;

	public BookDTO(final Book book) {
		this.id = book.getId();
		this.name = book.getName();
		this.author = book.getAuthor();
		this.price = book.getPrice();
		this.isbn = book.getIsbn();
	}

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
