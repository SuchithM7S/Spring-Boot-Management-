package com.sakha.boot.controller;

import java.time.LocalDate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sakha.boot.model.Employee;
import com.sakha.boot.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@GetMapping({"/"})
	public String defaultPage()
	{
		return "home";
	}
	
	@PostMapping("/employee")
	public String registerEmployee(@ModelAttribute Employee emp, Model m)
	{

		m.addAttribute("emp",service.registerEmployee(emp));
		return "view";
	}
	
	@PostMapping("/employees")
	public String update(@RequestParam("empName") String empName,@RequestParam("salary") float salary,@RequestParam("dob") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dob, Model m)
	{
		Employee emp = new Employee();
		emp.setEmpName(empName);
		emp.setSalary(salary);
		emp.setDob(dob);
		m.addAttribute("emp",service.registerEmployee(emp));
		return "view";
	}
	
	
	@PostMapping("/employeeUpdate")
	public String updateEmp(@ModelAttribute Employee emp, Model m) {
		System.out.println(emp);
		m.addAttribute("emp",service.updateEmp(emp));
		return "viewEmployee";
	}
	
	@PostMapping("/getByEmployeeId")
	public String getEmployeebyId(@RequestParam("empId") int empId, Model m)
	{
		
		m.addAttribute("emp",service.getEmployee(empId));
		return "viewEmployee";
	}
	
	@PostMapping("/deleteEmployee")
	public String deleteEmployee(@RequestParam("empId") int empId, Model m)
	{
		service.deleteEmployee(empId);
		m.addAttribute("success", "successfull");
		return "ShowdeleteEmployee";
	}
	
	@GetMapping("/getAllEmployee")
		public String getAllEmployees(Model m) throws Exception {
		List<Employee> emplist=	service.getAllEmployee();
		m.addAttribute("emplist",emplist);
		 return "viewAll";
		
	}
	
	@PostMapping("/getByEmployeeId1")
	public String UpdateEmployee(@RequestParam("empId") String empId, Model m)
	{
		System.out.println("EM");
		m.addAttribute("emp",service.getByEmpId(empId));
		return "viewEmployeeToUpdate";
	}
}
