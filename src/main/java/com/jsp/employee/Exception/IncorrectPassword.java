package com.jsp.employee.Exception;

public class IncorrectPassword extends RuntimeException
{
	public IncorrectPassword(String message)
	{
		super(message);
	}
}
