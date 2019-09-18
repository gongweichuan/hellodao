package net.gwc.springboot.hellodao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HellodaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HellodaoApplication.class, args);
	}

	@RequestMapping("")
	public String hello()
	{
		return "Hello World!";
	}
}
