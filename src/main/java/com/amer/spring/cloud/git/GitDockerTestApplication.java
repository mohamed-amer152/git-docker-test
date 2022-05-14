package com.amer.spring.cloud.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitDockerTestApplication {
	
	@GetMapping("/")
	public String message()
	{
		return " hello prince " ;
	}

	public static void main(String[] args) {
		SpringApplication.run(GitDockerTestApplication.class, args);
	}

}
