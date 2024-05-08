package com.jsp.employee.ResponseStructure;

import java.time.LocalDateTime;

import lombok.Data;
@Data
public class ResponseStructure<T> 
{
	private LocalDateTime dateTime;
	private String message;
	private T data;
	private int statuscode;
}
