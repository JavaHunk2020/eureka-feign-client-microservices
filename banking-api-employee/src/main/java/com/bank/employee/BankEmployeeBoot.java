package com.bank.employee;

import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BankEmployeeBoot {
	
	public static void main(String[] args) {
		SpringApplication app=new SpringApplication(BankEmployeeBoot.class);
		app.run(args);
		Set<String> strings=app.getSources();
		System.out.println("_________[[ARGS]]_____________" +strings);
	}
	
	
}
