package com.ssanusi.webemployee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebEmployeeApplication {

	static EmpList ourEmpList;

	public static void main(String[] args) {
		ourEmpList = new EmpList();
		SpringApplication.run(WebEmployeeApplication.class, args);
	}

}
