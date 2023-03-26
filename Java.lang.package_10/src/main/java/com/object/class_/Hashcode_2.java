package com.object.class_;

public class Hashcode_2 {
	int i;
	public Hashcode_2(int i) {
		this.i=i;
	}
	@Override
	public int hashCode() {
		return i;
	}

	public static void main(String[] args) {
		
		Hashcode_2 h=new Hashcode_2(10);
		Hashcode_2 h1=new Hashcode_2(100);
		
		System.out.println(h);
		System.out.println(h1);


	}
	@Override
	public String toString() {
		return i+"";
	}

}
/*In this case Object class toString( ) method 
got executed which is internally calls Test 
class hashCode( ) method. */