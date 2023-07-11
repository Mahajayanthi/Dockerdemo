package com.example.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerApplication {
	
	@GetMapping("/docker")
	public String hello()
	{
		return "Docker is a software platform that allows you to build, test, and deploy applications quickly. Docker packages software into standardized units called containers that have everything the software needs to run including libraries, system tools, code, and runtime. Using Docker, you can quickly deploy and scale applications into any environment and know your code will run.";
	}

    @GetMapping("/session")
    public String hello1()
    {
        return "welcome to Docker!";
    }

	public static void main(String[] args) {
		SpringApplication.run(DockerApplication.class, args);
	}

}
