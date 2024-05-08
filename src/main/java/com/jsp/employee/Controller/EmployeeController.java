package com.jsp.employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.employee.ResponseStructure.ResponseStructure;
import com.jsp.employee.Service.EmployeeService;
import com.jsp.employee.dto.Employee;

@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeService service;
	
	@PostMapping("/saveEmployee")
	public ResponseEntity<?> saveEmployee(@RequestBody Employee employee)
	{
		ResponseStructure<Employee> structure = service.saveEmployee(employee);
		return new ResponseEntity<>(structure,HttpStatus.CREATED);
	}
	
	@GetMapping("/findAllEmployee")
	public ResponseEntity<?>  findAllEmployee()
	{
		ResponseStructure<?> structure = service.findAllEmployee();
		return new ResponseEntity<>(structure,HttpStatus.FOUND);
	}
	
	@GetMapping("/findById")
	public ResponseEntity<?> findById(@RequestParam int employeeId)
	{
		ResponseStructure<Employee> structure = service.findById(employeeId);
		return new ResponseEntity<>(structure,HttpStatus.FOUND);
	}
	
	@PutMapping("/updateEmployee")
	public ResponseEntity<?> updateEmployee(@RequestBody Employee employee)
	{
		ResponseStructure<Employee> structure = service.updateEmployee(employee);
		return new ResponseEntity<>(structure,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteById")
	public ResponseEntity<?> deleteById(@RequestParam int employeeId)
	{
		ResponseStructure<String> structure = service.deleteById(employeeId);
		return new ResponseEntity<>(structure,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteAll")
	public ResponseEntity<ResponseStructure<String>> deleteAll()
	{
		ResponseStructure<String> structure = service.deleteAll();
		return new ResponseEntity<>(structure,HttpStatus.OK);
	}
	@GetMapping("/FindByName")
	public  ResponseEntity<ResponseStructure<List<Employee>>> findByEmployeeName(@RequestParam String employeeName)
	{
		ResponseStructure<List<Employee>> name = service.findByEmployeeName(employeeName);
		return new ResponseEntity<>(name,HttpStatus.FOUND);
	}
	
	@GetMapping("/findEmployee")
	public void findEmployee(@RequestParam int pageNumber)
	{
		service.findEmployee(pageNumber);
	}
}
