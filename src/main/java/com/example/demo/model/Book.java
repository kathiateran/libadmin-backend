package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "branch")
	private String branch;

	@Column(name = "publisher")
	private String publisher;
	
	@Column(name = "author")
	private String author;
	
	@Column(name = "reserved")
	private boolean reserved;
	

	public Book() {

	}

	public Book(String title, String description, String publisher, String author, boolean reserved) {
		this.title = title;
		this.branch = description;
		this.publisher = publisher;
		this.author = author;
		this.reserved = reserved;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public boolean isReserved() {
		return reserved;
	}
	

	public void setReserved(boolean isReserved) {
		this.reserved = isReserved;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", branch=" + branch 
				+ ", publisher=" + publisher + ", author=" + author + ", reserved=" + reserved +"]";
	}
}
