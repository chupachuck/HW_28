package core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Input_From_External_Properties_File {

	public static void main(String[] cla) throws FileNotFoundException, IOException {
		//String file = "./input.properties";
		String file = "/Users/oldmang/input.properties";

		Properties p  = new Properties();
		p.load(new FileInputStream(file));
		
		String first_name = p.getProperty("f_name");
		String last_name = p.getProperty("l_name");
		
		System.out.println("Your full name is: " + first_name + " " + last_name);
	}

}
