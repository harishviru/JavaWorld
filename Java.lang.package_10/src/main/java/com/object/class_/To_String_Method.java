package com.object.class_;

public class To_String_Method {
	int rollno;
	String name;
	String city;

	To_String_Method(int rollno,String name,String city){
		
		this.rollno=rollno;
		this.name=name;
		this.city=city;	
	}	
	public static void main(String[] args) {
		
		To_String_Method s1= new To_String_Method(1,"shaik","HYD");
		To_String_Method s2= new To_String_Method(1,"shaik","HYD");
		
		System.out.println(s1);
		System.out.println(s2);	
		
		
		
	}
	
/*	@Override
	public String toString() {
		return rollno+""+name+""+city+"";  
	}*/

}

