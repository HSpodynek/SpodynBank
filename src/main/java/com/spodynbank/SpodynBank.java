package com.spodynbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
// import org.springframework.security.crypto.bcrypt.BCrypt;

@SpringBootApplication
public class SpodynBank extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder){
		return applicationBuilder.sources(SpodynBank.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpodynBank.class, args);

	}


}
