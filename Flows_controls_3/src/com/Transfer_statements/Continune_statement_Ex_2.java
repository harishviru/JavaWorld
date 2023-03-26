package com.Transfer_statements;

public class Continune_statement_Ex_2 {
	
	
	public static void continue_statement() {
		
		int x=2;
		for(int i=0;i<10;i++) {
			if(i%x==0)
			continue;
			System.out.println(i);
		
		}
	}
	
	public static void continue_outside_of_loop() {
		
	/*	int x=10;                       // We can use continue only inside loops if we are using anywhere else we will get compile 
										//time error saying "continue outside of loop"
		for(x==10);
		continue;
				
		System.out.println("Hello");		*/ 
				
	}

	public static void main(String[] args) {
		
		continue_statement();
//		continue_outside_of_loop();

	}

}
