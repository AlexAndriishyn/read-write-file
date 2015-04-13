package source;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class WritingToAFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a file name...");
		String fileName = input.nextLine();
		
		Formatter outputStream = new Formatter(fileName);
		outputStream.format("Holy smokes - I am writing to a file%n");
		outputStream.format("is it really this ez?%n");
		outputStream.format("The file name is %s", fileName);
		
		outputStream.close();

	}

}
