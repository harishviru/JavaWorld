package com.fundamentals;

public class Voter {

	static String location ="Hyd";   //static variables
	String name ;              //non-static or instance
	int age ;                    //non-static or instance
	
	public Voter(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public Voter() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void instanceArea() {
		System.out.println(location);
		System.out.println(name);
		System.out.println(age);

		
		
	}
	public static void staticArea() {
		
		System.out.println(Voter.location);
		//System.out.println(name);
		
		Voter  v =new Voter("Vasu", 20);
		System.out.println(v.name);
		System.out.println(v.age);
		v.location="Vizag";
		System.out.println(location);

		System.out.println("------------------");
		Voter v1 =new Voter();
		System.out.println(v1.name);
		System.out.println(v1.age);
		System.out.println(location);

		
		
		
	}
	
	
	
	
	public static void main(String... laxman) {
		
		for(String s:laxman) {
			System.out.println(s);
		}
		
		staticArea();
		System.out.println("instance area");
        Voter v=new Voter();
        v.instanceArea();
        System.out.println("local");
        int a =10;
        System.out.println(a);
        if(a==10) {
        	int b=30;
        	System.out.println(b);
        }
        //System.out.println(b);
        int c=0;
        System.out.println(c);
        
	}

	
	
}
