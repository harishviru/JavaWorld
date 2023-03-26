package com.If.Else;


/**With in the switch statement if any case is matched from that case onwards all 
statements will be executed until end of the switch (or) break. This is call "fall-through" 
inside the switch .
With in the switch statement if any case is matched from that case onwards all 
statements will be executed until end of the switch (or) break. This is call "fall-through" 
inside the switch .
 
 * @author SALEEM
 *
 */
public class Fall_through_inside_the_switch {

	public static void main(String[] args) {
		
	int x=0;
	switch (x) {
	
	case 0:
		System.out.println("0");
	case 1:
		System.out.println("1");
	break;
	case 2:
		System.out.println("2");
	default :
		System.out.println("default");
	}

	}//main

}//class 
