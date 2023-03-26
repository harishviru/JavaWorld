package java_logical_programs;

import java.util.Scanner;

/**How to swap 2 no using 3rd variable Program 
in java
 * @author SALEEM
 *
 */
public class SwapNumbers {

	public static void main(String[] args) {
		int x,y,temp;
		System.out.println("Enter x and y");
		
		Scanner scr =new Scanner(System.in);
		x=scr.nextInt();
		y=scr.nextInt();
		
		System.out.println("Befor Swaping\nx= "+x+"\ny= "+y);
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After Swaping\nx= "+x+"\ny= "+y);

		
	}

}
