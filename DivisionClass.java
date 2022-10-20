/*	1.	The professor you TA (Training Associate) for, Professor Jackson, shared with you the code she uses to auto-grade students’ work. She and the other TAs have encountered some problems with the code in the past when they enter the total possible point value for an assignment. Occasionally, they accidentally enter 0 for the total number of possible points and the program encounters a fatal error when trying to divide by 0.

	To help out with this issue, complete a function called divide() in Main. 

	The divide() method takes in two parameters: x and y.

	Your function should return the result of x/y.

	However, if y is zero, you should throw an exception. 

	Try to use an ArithmeticException and put your try/catch block in divide() to test out your error-handling skills. 

	If an exception is caught, make sure to print out a helpful message.
*/

package com.exercise.demo;

import java.util.Scanner;

public class DivisionClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter numerator : ");
		int x=input.nextInt();
		System.out.println("Enter denominator");
		int y=input.nextInt();

		System.out.println("Devision : "+divide(x,y));
	
		input.close();
	}

	public static int divide(int x, int y) {
		int d=0;
		try {
			d = x/y;
			
		}catch(ArithmeticException e) {
			System.out.println("Can not divide by zero");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return d;
	}
}
