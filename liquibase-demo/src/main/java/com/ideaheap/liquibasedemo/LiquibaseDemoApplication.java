package com.ideaheap.liquibasedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
public class LiquibaseDemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(LiquibaseDemoApplication.class, args);
	}
}
