package com.kuebiko;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "${employee.service.name}")
public interface BankEmploeeServiceFeignClient {

	@GetMapping("/v2/employees")
    List<EmployeeVO> getAllEmpoyees();
	
	@GetMapping("/v2/employees/{eid}")
    EmployeeVO getAllEmpoyees(@PathVariable int eid);
}
