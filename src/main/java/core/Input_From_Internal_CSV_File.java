package core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;

public class Input_From_Internal_CSV_File {

	public static void main(String[] args) throws IOException {

		
		
		InputStream is = ClassLoader.getSystemResourceAsStream("input.csv");
		BufferedReader br = new BufferedReader(new InputStreamReader(is , "UTF-8"));

		while (br.ready()) {

			String line = br.readLine();
			String[] csv = line.split(",");
			String first_name = csv[0];
			String last_name = csv[1];

			System.out.println("Full name is: " + first_name + " " + last_name);
		}
		br.close();

	}

}
