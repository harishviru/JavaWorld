package com.Version.Enhansements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class The_old_way_of_resource_cleanup_01 {

	public static void main(String[] args) {
		System.out.println("start The_old_way_of_resource_cleanup_01.main()");

		BufferedReader br = null;
		try {
			String sCurrentLine = null;
			br = new BufferedReader(new FileReader("C:\\Users\\SALEEM\\Desktop\\text.txt"));
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
      System.out.println("end  The_old_way_of_resource_cleanup_01.main()");
	}// main

}// Class
