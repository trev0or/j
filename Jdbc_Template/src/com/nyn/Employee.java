package com.nyn;

public class Employee {
	private int id;  
	private String name;  
	private float salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public void setSalary(float salary) {
		this.salary = salary;
	} 
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name+" "+salary;
	} 
	
}
