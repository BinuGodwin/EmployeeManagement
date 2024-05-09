package com.jsp.employee;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@SpringBootApplication
public class EmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);

	}

	@Bean
	public Docket getDocket() {
		ApiInfo apiInfo = new ApiInfo("Employee", "Swagger and Validation", "1.0", "http://www.jspiders.com",
				new Contact("Binu", "http://www.Jspiders.com", "binugodwin098@gmail.com"), "TY-2023",
				"http://www.Jspiders.com", new ArrayList<>());

		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.jsp.employee")).build().apiInfo(apiInfo)
				.useDefaultResponseMessages(false);
	}
}
