package com.fundamentals;

public class Sample implements Cloneable {
	
	int rollNo;
	Voter v;
	
	public Sample(int rollNo,Voter v) {
		this.rollNo=rollNo;
		this.v=v;
	}
	public static void main(String[] args) throws CloneNotSupportedException {

		//obj_methods_1();
//		String  s =new String("santhosh");
//		StringBuffer sb =new StringBuffer("santhosh");
//		
        Voter v =new Voter("Rohit", 25);
		
		Sample sa = new Sample(150, v);
		Sample clonedObj = (Sample) sa.clone();

		System.out.println(sa.rollNo +"  voter name :"+sa.v.name +" voter age : "+sa.v.age);
		System.out.println(clonedObj.rollNo +"  voter name :"+clonedObj.v.name +" voter age : "+clonedObj.v.age);
		
		sa.rollNo=2300;
		sa.v.name="Harish";
		sa.v.age=27;

		System.out.println("after ----------------------");
		

		System.out.println(sa.rollNo +"  voter name :"+sa.v.name +" voter age : "+sa.v.age);
		System.out.println(clonedObj.rollNo +"  voter name :"+clonedObj.v.name +" voter age : "+clonedObj.v.age);
	
		

	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Voter v =new Voter(this.v.name, this.v.age);
		Sample clonedObj = new Sample(this.rollNo, v);
		return clonedObj;
		
	}
	
	
	
	
	
	private static void obj_methods_1() {
		Sample s =new Sample(100,null);
		//System.out.println(s); //s.toString()
		//System.out.println(Integer.toHexString(s.hashCode()));
		//System.out.println(Integer.toHexString(100));

		
		//System.out.println(s.hashCode());//100
		
		Sample s1 =new Sample(1060,null);
		//System.out.println(s1.hashCode());//100
		
		Sample s2  = s;

		System.out.println(s.equals(s1));  //100 ==1060      false
		System.out.println(s.equals(s2));   //100 ==100      true
		Sample s6 =new Sample(100,null);
		System.out.println(s.equals(s6));   //100 ==100          true

		System.out.println(s.equals(null));
		
		String str =new String("mahesh");
		System.out.println(s.equals(str));
		
		System.out.println();

		String str2 =new String("MAHESH");
		System.out.println(str.equals(str2));
		String str3 =new String("mahesh");

		System.out.println(str.equals(str3));
		
		
		
		StringBuffer sb1 =new StringBuffer("varun");
		StringBuffer sb2 =new StringBuffer("varun");
		StringBuffer sb3 =new StringBuffer("Arjun");
		
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.equals(sb3));

		StringBuilder sbb1 =new StringBuilder("K");
		StringBuilder sbb2 =new StringBuilder("K");
		System.out.println(sbb1.equals(sbb2)); 
		
		
		Integer i =new Integer(100);
		Integer i2 =new Integer(100);
		System.out.println(i.equals(i2));
	}
	
	@Override
	public String toString() {
		return this.rollNo+"";
	}
	
	
	
	@Override
	public int hashCode() {
		return this.rollNo;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==this) {
			return true;
		}
		if(obj instanceof Sample) {
			Sample s3 =(Sample)obj;             
			if(s3.rollNo==this.rollNo) {
				return true;
			}
		}
		return false;
	}
	
	
}
