package com.kuebiko;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class AccountMainBoot {
	
	public static void main(String[] args) {
		SpringApplication.run(AccountMainBoot.class, args);
		SpringApplication springApplication = new SpringApplication(AccountMainBoot.class);

		Map<String, Object> defaultProperties = new HashMap<String, Object>();
		defaultProperties.put("property.one", "Value One");
		defaultProperties.put("property.two", "Value Two");

		springApplication.setDefaultProperties(defaultProperties);

		springApplication.run(args);
		
	}

}
