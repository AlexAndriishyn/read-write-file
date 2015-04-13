package source;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileAndDirectoryInfo {

	public static void main(String[] args) throws IOException {
	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a file or directory name: ");
		Path path = Paths.get(input.nextLine());
		
		if (Files.exists(path)) {
			System.out.printf("%n%s exists.", path.getFileName());
			System.out.printf("%n%s a directory.", Files.isDirectory(path)? "is" : "is not");
			System.out.printf("%n%s an absolute path.", path.isAbsolute()? "is" : "is not");
			System.out.printf("%nLast modified: %s", Files.getLastModifiedTime(path));
			System.out.printf("%nSize %s bytes.", Files.size(path));
			System.out.printf("%nPath: %s", path);
			System.out.printf("%nAbsolute path is: %s", path.toAbsolutePath());
		}
	}
}
