package com.fundamentals;

public class Example {

	
	
	
	 public static void main(String[] args) {
		
		 
		 //m1();

		 
		 //charAt();

			//concat();
		 
		 
			//equals();
		 
		 //subString();
		 
		 //replcae();	
		 
		// trim();
		 
		 String s="arunkumar";
		 System.out.println(s.indexOf('z'));
		 
		 
		 
		 System.out.println(s.lastIndexOf('a'));

	}

	private static void trim() {
		String s=" sai charan ";
		 System.out.println(s);
		 System.out.println(s.trim());
	}

	private static void replcae() {
		String s="ababab";
		 System.out.println(s.replace('a','b'));
		 System.out.println(s.replaceFirst("a","b"));
	}

	private static void subString() {
		String s="ashoksoft";
		 
		
		 System.out.println(s.substring(5));//soft

		 System.out.println(s.substring(5,7));//soft


		 System.out.println(s.length());
	}

	private static void equals() {
		String  s="java";
		
		String s1 ="java";
		
		
		System.out.println(s.equals(s1));
		
		String s2 ="JAVA";
		
		System.out.println(s.equals(s2));

		System.out.println(s.equalsIgnoreCase(s2));
	}

	private static void concat() {
		String  s="Ravindra bharathi";

		s.concat("Hyd");
		
		System.out.println(s.concat("Hyd"));
		
		System.out.println(s);
	}

	private static void charAt() {
		String  s="Ravindra bharathi";
		     
		  char c =     s.charAt(0);
		  System.out.println(c);
		 
		  char c2 =     s.charAt(16);
		  System.out.println(c2);
	}

	private static void m1() {
		String s =new String();
		 
		 String s1 =new String("harish");
		 
		 
		 String s2 =new String(new char[] {'s','u','m','a','n'});
		 String s3 =new String(new byte[] {120,110});
		 StringBuffer sb =new StringBuffer("HCL");
		 
		 String s4 =new String(sb);
		 
		 StringBuilder sbb =new StringBuilder("Wirpro");

		 String s5 =new String(sbb);
		 
		 System.out.println(s);
		 System.out.println(s1);
		 System.out.println(s2);
		 System.out.println(s3);
		 System.out.println(s4);
		 System.out.println(s5);
	}
}
