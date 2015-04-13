package source;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class ReadingFile
{

	@SuppressWarnings("unused")
	private Scanner inputStream;

	public ReadingFile() throws IOException
	{
		Path pathName = getPath();
		inputStream = new Scanner(pathName);
	}

	@SuppressWarnings("static-access")
	public Path getPath()
	{

		JFileChooser jFileChooser = new JFileChooser();
		jFileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

		int result = jFileChooser.showOpenDialog(jFileChooser);

		if (result == jFileChooser.CANCEL_OPTION)
		{
			System.out.print("Ok, you decided to cancel, so the program will terminate");
			System.exit(1);
		}

		return jFileChooser.getSelectedFile().toPath();
	}

	public void displayFileToTheScreen()
	{

		while (inputStream.hasNext())
		{
			System.out.println(inputStream.nextLine());
		}
	}

	public void closeInputStream()
	{

		if (inputStream != null)
			inputStream.close();
	}

	public static void main(String[] args) throws IOException
	{

		ReadingFile myReader = new ReadingFile();
		myReader.displayFileToTheScreen();
		myReader.closeInputStream();

	}
}
