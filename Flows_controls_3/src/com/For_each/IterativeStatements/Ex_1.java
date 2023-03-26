package com.For_each.IterativeStatements;

public class Ex_1 {
	
	
	public static void normal_Forloop() {
		
		System.out.println("normal_Forloop()");

		int[] a= {10,20,30,40,50};
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
	}
	
	public static void enhanced_ForLoop() {
		
		System.out.println("enhanced_ForLoop()");

		int [] a= {10,20,30,40,50};
		for(int x:a) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		
		normal_Forloop();
		enhanced_ForLoop();

	}

}
