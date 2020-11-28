package core;

import java.io.Console;
import java.util.Scanner;

public class Input_Console {

	public static void main(String[] args) {

		Console c = System.console();
		
		if (c == null) {
			System.err.println("Console is not available");
			System.exit(0);
		}
		
		String first_name = c.readLine("Enter your first name: ");
		if (first_name.equals("q")) {
			System.err.println("Exit!");
			System.exit(0);
		}
		String last_name = c.readLine("Enter your last name: ");
		System.out.println("Your full name is: " + first_name + " " + last_name);
				
		
	}

}
