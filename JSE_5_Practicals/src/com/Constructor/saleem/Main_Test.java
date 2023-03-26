package com.Constructor.saleem;

public class Main_Test {

	public static void main(String[] args) {
		
		Employee e=new Employee(101,"Saleem","HYD",1000000.00f);
		Employee e1=new Employee(101,"Shaik","HYD",1000000.00f);
		
		System.out.println(e.getEmpNums()+","+e.getEmpName()+","+e.getEmpAddress()+","+e.getSalary());
		System.out.println(e1.getEmpNums()+","+e1.getEmpName()+","+e1.getEmpAddress()+","+e1.getSalary());

	}

}
