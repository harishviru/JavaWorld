package com.trye.catche.finallye;
//
public class Test_normal_program_flow_01  {
	
	public static void main(String[] args) {
		
		doStuff();
		
	}//main
	public static void doStuff() {
		
		doMoreStuff();
		
	}// method doStuff
	public static void doMoreStuff() {
		
		System.out.println("HELLO EXCEPTION_HANDLING");
	}// method doMoreStuff

}//class
