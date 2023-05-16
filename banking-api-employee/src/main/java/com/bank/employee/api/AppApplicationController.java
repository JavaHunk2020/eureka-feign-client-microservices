package com.bank.employee.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppApplicationController {
	
	@Value("${app.oppo.app.name:oeie-1212}")
	private String appName;
	
	
	
	@Value("${spring.app.name}")
	private String appName100;
	
	
	@Value("${spring.oppo.name:magic}")
	private String oppoName;
	
	
	
	@Value("${app.service:Kuebiko}")
	private String appService;
	
	@GetMapping("/")
	public String findName() {
		return "<b>"+(appName+" : "+appName100+ " :  "+oppoName+ " : "+appService).toUpperCase()+"</b>";
	}

}
