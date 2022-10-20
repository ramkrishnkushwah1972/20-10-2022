package com.exercise.demo;

public class Book {
	// Instance variables
	int id;
	String name;

	//Perameterized constructor
	public Book(int id,String name) {
		this.id=id;
		this.name=name;
	}
	//get method for fetch id
	public int getId() {
		return id;
	}
}
