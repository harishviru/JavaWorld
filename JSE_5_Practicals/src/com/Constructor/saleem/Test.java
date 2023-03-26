package com.Constructor.saleem;


class Parent{
	Parent(){
		System.out.println(this.hashCode());
	}
}
class Child extends Parent{
	Child (){
		System.out.println(this.hashCode());

	}
}
/**
 * @author SALEEM
 *Note : When ever we are creating child class object automatically parent class 
constructor will be executed but parent object won't be created. 
 */
public class Test{
	public static void main(String[]args){
		Child c=new Child();
		System.out.println(c.hashCode());
	}
}