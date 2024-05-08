package com.jsp.employee.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.employee.Dao.EmployeeDao;
import com.jsp.employee.ResponseStructure.ResponseStructure;
import com.jsp.employee.dto.Employee;

@Service
public class EmployeeService 
{
	@Autowired
	EmployeeDao dao;
	
	public ResponseStructure<Employee> saveEmployee(Employee employee) 
	{
		Employee employee2 = dao.saveEmployee(employee);
		ResponseStructure<Employee> structure = new ResponseStructure<Employee>();
		structure.setData(employee2);
		structure.setDateTime(LocalDateTime.now());
		structure.setMessage("Employee data inserted successfully...!");
		structure.setStatuscode(200);
		return structure;
	}

	public ResponseStructure<List<Employee>> findAllEmployee() 
	{
		List<Employee> findAll = dao.findAllEmployee();
		ResponseStructure<List<Employee>> structure = new ResponseStructure();
		structure.setData(findAll);
		structure.setDateTime(LocalDateTime.now());
		structure.setMessage("Employee data Found successfully...!");
		structure.setStatuscode(200);
		return structure;
	}

	public ResponseStructure<Employee> findById(int employeeId) 
	{
		Optional<Employee> optional = dao.findById(employeeId);
		ResponseStructure<Employee> structure = new ResponseStructure<Employee>();
		structure.setData(optional.get());
		structure.setDateTime(LocalDateTime.now());
		structure.setMessage("Employee data Found successfully...!");
		structure.setStatuscode(200);
		return structure;

	}

	public ResponseStructure<Employee> updateEmployee(Employee employee) 
	{
		Employee employee2 = dao.updateEmployee(employee);
		ResponseStructure<Employee> structure = new ResponseStructure<Employee>();
		structure.setData(employee2);
		structure.setDateTime(LocalDateTime.now());
		structure.setMessage("Employee data Updated successfully...!");
		structure.setStatuscode(200);
		return structure;

	}

	public ResponseStructure<String> deleteById(int employeeId) 
	{
		dao.deleteById(employeeId);
		ResponseStructure<String> structure = new ResponseStructure<String>();
		structure.setData("Data deleted...");
		structure.setDateTime(LocalDateTime.now());
		structure.setMessage("Employee data Deleted successfully...!");
		structure.setStatuscode(200);
		return structure;
	}

	public ResponseStructure<String> deleteAll() 
	{
		dao.deleteAll();
		ResponseStructure<String> structure = new ResponseStructure<String>();
		structure.setData("Data deleted...");
		structure.setDateTime(LocalDateTime.now());
		structure.setMessage("Employee All data Deleted successfully...!");
		structure.setStatuscode(200);
		return structure;

	}

	public ResponseStructure<List<Employee>> findByEmployeeName(String employeeName) 
	{
		List<Employee> name = dao.findByEmployeeName(employeeName);
		ResponseStructure <List<Employee>>structure = new ResponseStructure<>();
		structure.setData(name);
		structure.setDateTime(LocalDateTime.now());
		structure.setMessage("Employee data Found successfully...!");
		structure.setStatuscode(200);
		return structure;
	}

	public void findEmployee(int pageNumber) 
	{
		dao.findEmployee(pageNumber);
	}
}
