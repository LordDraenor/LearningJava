package exercises;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {

	public static void main(String[] args) throws FileNotFoundException{
		if (args.length!=4) {
			System.out.println("Usage: java ReplaceText <source file> <target file> <original string> <replacement string>");
			System.exit(1);
		}
		File inputFile = new File(args[0]);
		if(!inputFile.exists()) {
			System.out.println("The source file " + inputFile.toString() + " does not exist!");
			System.exit(1);
		}
		if((new File(args[1])).exists()) {
			System.out.println("The target file " + args[1] + " already exists");
		}		
		try(
			Scanner scan = new Scanner(inputFile);
			PrintWriter writer = new PrintWriter(args[1]);)
		{ while(scan.hasNext()) {
		    String s1 = scan.nextLine();
		    String s2 = s1.replace(args[2], args[3]);
		    writer.println(s2);
			}
		}		
	}

}
