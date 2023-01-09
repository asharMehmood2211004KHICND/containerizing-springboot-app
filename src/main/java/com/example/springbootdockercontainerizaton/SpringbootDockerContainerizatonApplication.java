package com.example.springbootdockercontainerizaton;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDockerContainerizatonApplication {



	@GetMapping("/home")
	public String welcomeHome(){
		return "welcome home , we are containerzing the spring boot app !";
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerContainerizatonApplication.class, args);
	}

}
