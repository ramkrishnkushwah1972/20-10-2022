package com.exercise.demo;

public class Book {
	// Instance variables
	private int id;
	private String name;

	//Perameterized constructor
	public Book(int id,String name) {
		this.id=id;
		this.name=name;
	}
	//get method for fetch id
	public int getId() {
		return id;
	}
	//method for set id
	public void setId(int id) {
		this.id = id;
	}
	//method for fetch name
	public String getName() {
		return name;
	}
	//method for set name
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + "]";
	}
	
}
