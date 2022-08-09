package com.josh.java.training.filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreation {
	public static void main(String[] args) {

		try {
			File Obj = new File("myfile.txt");

			// creating a file
			if (Obj.createNewFile()) {
				System.out.println("File created: " + Obj.getName());

			} else {
				System.out.println("File already exists.");
			}

			// writing a file
			FileWriter Writer = new FileWriter("myfile.txt");
			Writer.write("Files in Java are Good");
			Writer.close();
			System.out.println("Successfully written.");

			// read a file
			Scanner Reader = new Scanner(Obj);
			while (Reader.hasNextLine()) {
				String data = Reader.nextLine();
				System.out.println(data);
			}
			Reader.close();
			/*
			 * if (Obj.delete()) { System.out.println("The deleted file is : " +
			 * Obj.getName()); } else { System.out.println( "Failed in deleting the file.");
			 * }
			 */
		} catch (IOException e) {
			System.out.println("An error has occurred.");
			e.printStackTrace();
		}

	}
}
