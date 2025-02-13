package com.celcom.day8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("D://FileHandlingExample1.txt");
		FileWriter fw = new FileWriter("D://FileHandlingExample2.text");
		
		int ch = 0;
		while((ch = fr.read())!=-1) {
			fw.write((char)ch);
		}
		fr.close();
		fw.close();
		System.out.println("File Copied");
	}

}
