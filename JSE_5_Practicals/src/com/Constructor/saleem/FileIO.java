package com.Constructor.saleem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIO {

	
	public static void main(String[] args) throws IOException {
	
		
		//readingFromFile();
		
		
		//writingIntoFile();
		
		
		
		FileInputStream fis =new FileInputStream("C:\\Users\\SALEEM\\Desktop\\text.txt");
		FileOutputStream  fos =new FileOutputStream("output.txt");

		
		
		int i;
		while((i=fis.read())!=-1) {
			//System.out.print(i   );
			System.out.print((char)i);
			fos.write(i);
		}
		
		
		fis.close();
		fos.close();
		
	}

	private static void writingIntoFile() throws FileNotFoundException, IOException {
		FileOutputStream  fos =new FileOutputStream("output.txt");
		
		fos.write(122);
		fos.write(12);
		fos.write(102);
		
		
		fos.close();
	}

	private static void readingFromFile() throws FileNotFoundException, IOException {
		String sourcePath ="C:\\Users\\SALEEM\\Desktop\\text.txt";
		
		File file =new File(sourcePath);
		System.out.println("FileIO.main()");
		
		FileInputStream fis =new FileInputStream(file);
		
		int i;
		while((i=fis.read())!=-1) {
			//System.out.print(i   );
			System.out.print((char)i);
		}
		fis.close();
	}
	
	
}
