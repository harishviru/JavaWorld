package com.For_each.IterativeStatements;

public class Ex_2 {
	
	
	public static void normal_Forloop_two_dimensionalarry() {
		
		System.out.println("normal_Forloop_two_dimensionalarry()");

		int[][] a= {{10,20,30},{40,50}};
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++) {
			System.out.println(a[i][j]);}
		}
		
	}
	
	public static void enhanced_ForLoop_two_dimensionalarry() {
		
		System.out.println("enhanced_ForLoop_two_dimensionalarry()");

		int [][] a= {{10,20,30},{40,50}};
		for(int[] x:a) {
			for(int y:x){
				System.out.println(y);
			}
			
		}
	}

	public static void main(String[] args) {
		
		normal_Forloop_two_dimensionalarry();
		enhanced_ForLoop_two_dimensionalarry();

	}

}
