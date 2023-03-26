package com.object.class_;

public class Hashcode_1 {
	int i;
	public Hashcode_1(int i) {
		this.i=i;
	}

	public static void main(String[] args) {
		
		Hashcode_1 h=new Hashcode_1(10);
		Hashcode_1 h1=new Hashcode_1(100);
		
		System.out.println(h);
		System.out.println(h1);


	}
	@Override
	public String toString() {
		return i+"";
	}

}
/*In this caseObject class toString( )method 
got executed which is internally calls Object 
class hashCode( ) method.*/