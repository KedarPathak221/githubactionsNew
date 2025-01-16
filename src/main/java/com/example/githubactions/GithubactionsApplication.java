package com.example.githubactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubactionsApplication {

	@RequestMapping("/message")
	public String message()
	{
		return "Dockerrrrr is Finalyyyy runningggggg!!!!!";
	}
	public static void main(String[] args) {
		SpringApplication.run(GithubactionsApplication.class, args);
	}

}
