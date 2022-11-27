package com.spring.boilerplate.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

import com.spring.boilerplate.core.BasePackageLocation;

@SpringBootApplication(scanBasePackageClasses = BasePackageLocation.class)
@ConfigurationPropertiesScan
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}
}

