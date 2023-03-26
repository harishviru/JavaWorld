package com.Constructor.saleem;

public class Employee {
	
	private int empNums;
	private String empName;
	private String empAddress;
	private float Salary;
	
	public Employee(int empNums,String empName,String empAddress,float Salary) {
		this.empNums=empNums;
		this.empName=empName;
		this.empAddress=empAddress;
		this.Salary=Salary;
		
	}

	public int getEmpNums() {
		return empNums;
	}

	public void setEmpNums(int empNums) {
		this.empNums = empNums;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}

}
