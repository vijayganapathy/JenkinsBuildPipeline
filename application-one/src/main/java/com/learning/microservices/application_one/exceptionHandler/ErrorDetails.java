package com.learning.microservices.application_one.exceptionHandler;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {

	private LocalDate timeStamp;
	private String messsage;
	private String details;
}
