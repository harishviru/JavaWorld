package com.langfun.bsuman;

public class VarAgrEx2 {
	public static void sum(int...x) {
		int total=0;
		for (int x1 : x) {
			total=total+x1;
		}
		System.out.println(total);
	}
	public static void main(String[] args) {
		sum();
		sum(10,800,900);
	}

}
