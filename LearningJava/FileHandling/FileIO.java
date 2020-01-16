package FileHandling;

import java.io.*;

public class FileIO {

	public static void main(String[] args) throws IOException {
		try (DataOutputStream fisierOut = new DataOutputStream(new FileOutputStream("file.dat"));) {
			fisierOut.writeUTF("John");
			fisierOut.writeDouble(85.5);
			fisierOut.writeUTF("Jim");
			fisierOut.writeDouble(185.5);
			fisierOut.writeUTF("George");
			fisierOut.writeDouble(105.25);
		}
		try (DataInputStream fisierIn = new DataInputStream(new FileInputStream("file.dat"));) {
			System.out.println(fisierIn.readUTF() + " " + fisierIn.readDouble());
			System.out.println(fisierIn.readUTF() + " " + fisierIn.readDouble());
			System.out.println(fisierIn.readUTF() + " " + fisierIn.readDouble());
		}

	}
}
