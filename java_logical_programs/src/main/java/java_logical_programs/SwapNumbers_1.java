package java_logical_programs;

import java.util.Scanner;

/**.How to swap 2 no without using 3rd variable 
Program in java

 * @author SALEEM
 *
 */
public class SwapNumbers_1 {

	public static void main(String[] args) {
		
		int x,y;
		System.out.println("Enter X and Y ");
		Scanner scr=new Scanner(System.in);
		x=scr.nextInt();
		y=scr.nextInt();
		System.out.println("Before Swaping \nx= "+x+"\ny= "+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After Swaping \nx= "+x+"\ny= "+y);

	}

}
