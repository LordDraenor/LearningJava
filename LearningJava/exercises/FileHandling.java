package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileHandling {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("current.txt");
		System.out.println("Does it exist? " + file.exists());
		System.out.println("The file has " + file.length() + " bytes");
		System.out.println("Can it be read? " + file.canRead());
		System.out.println("Can it be written? " + file.canWrite());
		System.out.println("Is it a directory? " + file.isDirectory());
		System.out.println("Is it a file? " + file.isFile());
		System.out.println("Is it absolute? " + file.isAbsolute());
		System.out.println("Is it hidden? " + file.isHidden());
		System.out.println("Absolute path is " + file.getAbsolutePath());
		System.out.println("Last modified on " + new java.util.Date(file.lastModified()));

		PrintWriter writer = new PrintWriter("created.txt");
		writer.println("aaaaa");
		writer.append("bbbbb");
		writer.close();
		file = new File("created.txt");
		try (
		Scanner fileInput = new Scanner(file);)
		{
		while (fileInput.hasNext())
			System.out.println(fileInput.next());}

	}

}
