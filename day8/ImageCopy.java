package com.celcom.day8;

//import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fr = new FileInputStream("D://Image1.jpg");
		FileOutputStream fw = new FileOutputStream("D://Image.jpg");
		
		int ch = 0;
		while((ch = fr.read())!=-1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
		System.out.println("Image Copied");
	}
}