package com.anil;

public class sanjay {

	public static void main(String[] args) {
		int number =10;
		try{
			number=10/0;
			
		}
		catch (ArithmeticException exception)
		{
			System.out.println("Exception ::"+exception);
		}
		

	}

}
