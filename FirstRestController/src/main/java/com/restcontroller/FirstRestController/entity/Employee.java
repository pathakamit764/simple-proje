package com.restcontroller.FirstRestController.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	private int Id;
	private String Name;
	private String Add;
	private int salary;
	
	public Employee(int id, String name, String add, int salary) {
		super();
		Id = id;
		Name = name;
		Add = add;
		this.salary = salary;
	}
	
	public Employee() {
		super();
	}

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAdd() {
		return Add;
	}
	public void setAdd(String add) {
		Add = add;
	}
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", Name=" + Name + ", Add=" + Add + ", salary=" + salary + "]";
	}

}
