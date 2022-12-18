package com.Version.Enhansements;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**As part of 1.7 version enhancements in Exception Handling the following 2 concepts 
introduced*********Untill 1.6 version it is highly recommended to write finally block to close all resources 
which are open as part of try block. 
The main advantage of "try with resources" is 
the resources which are opened as part of try block will be closed automatically
Once the control reaches end of the try block either normally or abnormally and hence 
we are not required to close explicitly so that the complexity of programming will be 
reduced.It is not required to write finally block explicitly and hence length of the code 
will be reduced and readability will be improved.
 * @author SALEEM
 *
 */
public class Try_with_resources_02 {

	public static void main(String[] args) {
		
		try (BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\SALEEM\\Desktop\\text.txt")))
		{
			String sCurrentLine=null;
			while ((sCurrentLine = br.readLine()) !=null)
			{
			System.out.println(sCurrentLine);
		    }//while
		}catch(IOException e){
			e.printStackTrace();
		}//catch
	

	}//main

}//class
