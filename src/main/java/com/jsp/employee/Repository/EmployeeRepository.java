package com.jsp.employee.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.employee.dto.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>
{

	public List<Employee> findByEmployeeName(String EmployeeName);
	
}
