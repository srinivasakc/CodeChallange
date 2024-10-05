package code.challange;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadTextFileAndCountTheGivenText {

	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr = new FileReader("C://text.txt");
		BufferedReader br = new BufferedReader(fr);
	}

}
