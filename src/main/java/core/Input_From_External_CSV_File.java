package core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Input_From_External_CSV_File {

	public static void main(String[] args) throws IOException {
		String csvFile = "/Users/oldmang/input.csv";
		BufferedReader br = new BufferedReader(new FileReader(csvFile));

		
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
