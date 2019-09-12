package com.sakha.boot.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Employee {
	

	@Id
	@GeneratedValue
	int id;
	String empId;
	String empName;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	LocalDate dob;
	float salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, LocalDate dob, float salary) {
		super();
		this.empName = empName;
		this.dob = dob;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empId=" + empId + ", empName=" + empName + ", dob=" + dob + ", salary="
				+ salary + "]";
	}
	
}
