package core;

import java.io.Console;
import java.util.Arrays;

public class Input_Console_Password {
	public static void main(String[] wow) {
		Console c = System.console();

		if (c == null) {
			System.out.println("Console is not available");
			System.exit(0);
		}

		char[] password = c.readPassword("Password: ");

		char[] password2 = c.readPassword("Confirm password: ");

		boolean isMatch = Arrays.equals(password, password2);

		System.out.println(isMatch ? "Passwords match" : "Passwords don't match");

		System.out.println("Password: " + String.valueOf(password));

		System.out.println("Confirm: " + String.valueOf(password2));
	}
}
