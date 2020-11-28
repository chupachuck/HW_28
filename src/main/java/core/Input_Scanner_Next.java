package core;

import java.util.Scanner;

public class Input_Scanner_Next {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter your first name: ");
	String first_name = s.next();
	System.out.println("Enter your last name: ");
	String last_name = s.next();
	System.out.println("Your full name is: " + first_name + " " + last_name );
}
}
