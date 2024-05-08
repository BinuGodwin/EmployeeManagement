package com.jsp.employee.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	@NotBlank
	@Pattern(regexp = "^[a-zA-Z' ']*$")
	@Size(min = 3,max = 10)
	private String employeeName;
	private String employeeEmail;
	private String password;
	private String phoneNumber;
	private String employeeCountry;
	
}
