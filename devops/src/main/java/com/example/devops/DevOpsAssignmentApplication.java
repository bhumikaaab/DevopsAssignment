package com.example.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DevOpsAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevOpsAssignmentApplication.class, args);
	}

}
