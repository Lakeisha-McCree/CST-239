package app;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilePlay {
	
	private static int copyFile(String inputFileName, String outputFileName ) {
		//Input and Output File Read/Writer declarations
		FileReader in = null;
		FileWriter out = null;
		
		try {
		
		//Create Reader and Writer
		in = new FileReader(inputFileName);
		out = new FileWriter(outputFileName);
		
		//Loop to read all characters from FileReader and write to FileWriter
		int c;
		while((c = in.read()) != -1) {
			out.write(c);
		}
		return 0; //All characters copied without error
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		return -1; //File Not Found
	} catch (IOException e) {
		e.printStackTrace();
		return -2; //I/O Error
	} finally {
		try {
			if (in != null) {
				in.close();
			}
			if (out != null){
				out.close();
			}
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	}
	public static void main(String[] args) {
		String inputFileName = "InFile.txt";
		String outputFileName = "OutFile.txt";
		
		//Call method to read/write files
		int err = FilePlay.copyFile("InUsers.txt", "OutUsers.txt");
		
		//Display copy file results
		switch(err) {
		case 0: System.out.println("File was copied successfully.");
		break;
		case -1: System.out.println("File could not be opened.");
		break;
		case -2: System.out.println("File I/O error.");
		break;
		}
	}

	
	
}
