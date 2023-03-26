package com.langfun.bsuman;

public class StaticEx {
  static int i=10;
  static String k;
  public static void main(String[] args) {
	 StaticEx s= new StaticEx();
	 System.out.println(s.i);
	 System.out.println(StaticEx.i);
	 System.out.println(i);
	 System.out.println(k);
}
}
