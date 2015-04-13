package source;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Formatter;

import javax.swing.JOptionPane;

public class Comments {
	
	private Formatter outputStream;
	private JOptionPane jOptionPane;
	private String input;
	private Path path = Paths.get("C:\\comments.txt");
	
	/**
	 * Constructor. Assigns the specified Path to outputStream.
	 */
	
	public Comments () {
		try {
			outputStream = new Formatter(path.toString());
		} catch (FileNotFoundException ex_1) {
			ex_1.printStackTrace();
		}
	}
	// Constructor end.
	
	/**
	 * Writes a comment to the file. Stops writing and closes the stream if "quit" command has been issued. 
	 * @throws IOException
	 */
	
	@SuppressWarnings("static-access")
	public void getInput () throws IOException {
		do {
			input = jOptionPane.showInputDialog("Enter your comments: ");
			
			if (input.equalsIgnoreCase("quit"))
				outputStream.close();
			else {
				outputStream.format("%s\t%s%n", new Date(System.currentTimeMillis()), input);
				outputStream.flush();
			}
		} while (!input.equalsIgnoreCase("quit"));
	}
	
	public static void main(String[] args) throws IOException {
		
		Comments comments = new Comments();
		comments.getInput();
		
	} // End of main.
} // End of class.
