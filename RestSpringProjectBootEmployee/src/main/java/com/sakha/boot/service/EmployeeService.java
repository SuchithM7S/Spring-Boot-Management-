package com.sakha.boot.service;

import java.util.List;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakha.boot.model.Employee;
import com.sakha.boot.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo repo;
	
	public Employee registerEmployee(Employee emp)
	{
		System.out.println("Service");
		emp.setEmpId(generateId(emp.getEmpName()));
		return repo.save(emp);
	}
	
	public Employee getEmpByName(String name)
	{
		Employee emp = repo.getEmployeeByName(name);
		return emp;  
	}
	
	public Employee getByEmpId(String empId)
	{
		return repo.getEmployeeById(empId);
	}
	
	public Employee getEmployee(int empId)
	{
		return repo.getOne(empId);
	}
	
	public List<Employee> getAllEmployee()
	{
		return repo.findAll();
	}
	
	public void deleteEmployee(int empId)
	{
		repo.deleteById(empId);
	}
	public String generateId(String empName) {
		// TODO Auto-generated method stub
		String nameChar = empName.substring(0,2).toUpperCase();
		Random rand = new Random();
		int dgt = (int)(rand.nextDouble()*10000);
		return nameChar+dgt;
		//return null;
	}
	public Employee updateEmp(Employee emp) {
		Employee emp1=repo.getEmployeeById(emp.getEmpId());
		emp1.setEmpName(emp.getEmpName());
		emp1.setDob(emp.getDob());
		emp1.setSalary(emp.getSalary());
	return	repo.save(emp1);
	
	}
}
