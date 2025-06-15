package com.rt.sample;

/**
 * @author Rushi Technologies
 * Date 2025-06-01
 * Package com.rt.sample
 * Version 1.0
 * 
 * Description: HelloWorld.java
 * This is a simple Java application that prints a welcome message
 * and the current date to the console.
 * It demonstrates the use of Maven as a build tool.
 */
import java.util.Date;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello Welcome to Rushi Technologies. Demo On Maven Build Tool !! Today Date is:  "
				+ getLocalCurrentDate());

	}

	private static Date getLocalCurrentDate() {
		return new Date();

	}

	/**
	 * This method is used for testing purposes to access the private method getLocalCurrentDate.
	 * It allows us to retrieve the current date without changing the visibility of the original method.
	 */
	protected static Date getLocalCurrentDateTestable() {
		return getLocalCurrentDate(); // Call the original private method
	}

}
