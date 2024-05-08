package com.jsp.employee.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

import com.jsp.employee.Exception.EmployeeNameNotFoundException;
import com.jsp.employee.Repository.EmployeeRepository;
import com.jsp.employee.dto.Employee;

@Repository
public class EmployeeDao 
{
	@Autowired
	EmployeeRepository repository;
	
	public Employee saveEmployee(Employee employee) 
	{
		Employee employee2 = repository.save(employee);
		return employee2;
	}

	public List<Employee> findAllEmployee() 
	{
		List<Employee> findAll = repository.findAll();
		return findAll;
	}

	public Optional<Employee> findById(int employeeId) 
	{
		Optional<Employee> optional = repository.findById(employeeId);
		return optional;
	}

	public Employee updateEmployee(Employee employee) 
	{
		Employee save = repository.save(employee);
		return save;
	}

	public void deleteById(int employeeId) 
	{
		repository.deleteById(employeeId);
	}

	public void deleteAll() 
	{
		repository.deleteAll();
	}

	public List<Employee> findByEmployeeName(String employeeName) 
	{
		List<Employee> name = repository.findByEmployeeName(employeeName);
		if(name != null)
		{
			return name;
		}
		else
			throw new EmployeeNameNotFoundException("Please Check your Name!!!");
	}

	public	Page<Employee> findEmployee(int pageNumber) 
	{
		PageRequest pageRequest = PageRequest.of(pageNumber,10);
		Page<Employee> page = repository.findAll(pageRequest);
		return page;
	}
}
