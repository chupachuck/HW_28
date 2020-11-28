package core;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Input_From_File_Using_Scanner {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/oldmang/input.txt");
//		File file = new File("./input.txt");

		// String file = args[0];

		Scanner s = new Scanner(file);
		while (s.hasNext()) {
			String first_name = s.next();
			String last_name = s.next();
			System.out.println("Your full name is: " + first_name + " " + last_name);
		}
		s.close();
	}

}
