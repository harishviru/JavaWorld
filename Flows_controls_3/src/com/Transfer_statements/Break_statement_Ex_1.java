package com.Transfer_statements;

public class Break_statement_Ex_1 {
	
	public static void Break_Statement_inside_switch() {
		
		int x=0;
		switch(x) {
		
		case 0:
			System.out.println("Saleem");
			break;
		case 1:
			System.out.println("Shaik");
		
		}
	} 
	
	public static void Break_Statement_inside_loops() {
		
		for(int i=0;i<10;i++) {
			if(i==5)
				break;
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		
		Break_Statement_inside_switch();
		Break_Statement_inside_loops();

	}//main

}//class
