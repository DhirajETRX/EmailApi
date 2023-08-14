package com.example.demo.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class EmailRequest {

	private String to;
	private String message;
	private String subject;
}
