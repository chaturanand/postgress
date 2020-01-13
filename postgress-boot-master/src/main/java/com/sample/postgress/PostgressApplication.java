package com.sample.postgress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* The PostgressApplication program implements an application that
* simply Run the Spring Boot Application.
*
* @author Chaturanand Yadav
* @version 1.0
* @since   2020-01-13 
*/

@SpringBootApplication(scanBasePackages="com.sample")
public class PostgressApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostgressApplication.class, args);
	}

}

