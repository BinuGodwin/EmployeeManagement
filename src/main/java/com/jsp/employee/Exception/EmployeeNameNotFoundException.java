package com.jsp.employee.Exception;

public class EmployeeNameNotFoundException extends RuntimeException
{
	public EmployeeNameNotFoundException(String message)
	{
		super(message);
	}
}
