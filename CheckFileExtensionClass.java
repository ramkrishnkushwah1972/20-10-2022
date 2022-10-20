/*	2.	After mentioning to Professor Jackson that you would like to get some more practice with exceptions, she offered to let you write some grading software! Before she gives you full control over auto-grading students’ work, she asked if you could write a function called checkFileExtension(). 
	
	The checkFileExtension() method takes in one parameter: fileName.
	
	checkFileExtension() should return an integer representing the number of points a student receives for properly submitting a file in Java. 
	
	If a student’s submitted file ends in .java, they get 1 point. 
	
	If a student’s submitted file doesn’t end in .java, they get 0 points. 
	
	If the file submitted is null or an empty string, an exception should be thrown and you should give the student -1 points. 
	
	What kind of exception is up to you, including to a custom exception!
	
	In main(), Professor Jackson has provided a array of students and the names of their submitted files for you to test out your work. 
	
	If an exception is caught, make sure to print out the error message.
*/
package com.exercise.demo;

public class CheckFileExtensionClass {

	public static void main(String[] args) {

		String students[] = {"Raj","Mukul","Yash"};
		String files[] = {"notes.java","raj.txt","",};
		
		String name="";
		try {
			int i=0;
			for(String file:files)
			{
				int r = checkFileExtension(file);
				
				if(r == 1)
					System.out.println("Hello "+students[i]+" Your file is a java file. So your score is 1 ");
				else
					System.out.println("Hello "+students[i]+" Your file is not a java file. So your score is 0 ");
				i++;
				name=students[i];
			}
			
		}
		catch(NullException ex) {
			System.out.println("Hello "+name +" Your have send a null. Your score is -1");
			System.err.println("NullException :"+ex.getMessage());
		}
		catch(EmptyException ex) {
			System.out.println("Hello "+name +" Your have send a empty. Your score is -1");
			System.err.println("EmptyException : " +ex.getMessage());
		}
		catch(Exception ex) {
			System.out.println("Your score is -1");
			System.out.println("Error :"+ex.getMessage());
		}


	}
	//Function for check file extension
	public static int checkFileExtension(String fileName) throws EmptyException, NullException{
		
		if(fileName==null) {
			throw new NullException("This is null String");
		}
		if(fileName.isEmpty()) {
			throw new EmptyException("This is empty String");
		}
		
		String file="";
		//This loop used for get (.java) string from filename and store file variable
		for(int i=fileName.length()-1; i>=fileName.length()-5; i--)
		{
			if(i>0)
			file = fileName.charAt(i) + file;
			
		}
		if(file.equals(".java"))
			return 1;
		
		return 0;
	}
	
}
