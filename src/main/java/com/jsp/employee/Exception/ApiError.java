package com.jsp.employee.Exception;

import java.time.LocalDateTime;

import lombok.Data;
@Data
public class ApiError 
{
	private String message;
	private Class className;
	private LocalDateTime dateTime;
}
