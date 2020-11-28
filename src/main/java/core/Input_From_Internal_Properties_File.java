package core;

import java.io.IOException;
import java.util.Properties;

public class Input_From_Internal_Properties_File {

	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		
		p.load(ClassLoader.getSystemResourceAsStream("input.properties"));
		
	
	
		String first_name = p.getProperty("f_name");
		String last_name = p.getProperty("l_name");
		
		System.out.println("Your full name is: " + first_name + " " + last_name);
	}

}
