package com.frd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class FrdApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder app){
		return app.sources(FrdApplication.class);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(FrdApplication.class, args);
	}
}
