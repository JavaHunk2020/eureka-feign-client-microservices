package com.bank.employee.api;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2")
@CrossOrigin(origins = "*") //this can be acceed by other domain
public class EmployeeController {
	
	
	@GetMapping(value="/employees/{eid}",produces = {"application/json"})
	public EmployeeVO findEmployee(@PathVariable int eid) {
		EmployeeVO employeeVO=new EmployeeVO();
		employeeVO.setName("Mr. Nagendra Kumar");
		employeeVO.setEmail("technohunk100@gmail.com");
		employeeVO.setBalance(122);
		employeeVO.setPhone(1233);
		employeeVO.setEid(eid);
		return employeeVO;
	}
	
	@GetMapping(value="/employees",produces = {"application/json"})
	public List<EmployeeVO> findEmployee() {
		EmployeeVO employeeVO=new EmployeeVO();
		employeeVO.setName("Nagendra Kumar");
		employeeVO.setEmail("technohunk100@gmail.com");
		employeeVO.setBalance(122);
		employeeVO.setPhone(1233);
		
		EmployeeVO temployeeVO=new EmployeeVO();
		temployeeVO.setName("Ashish Kumar");
		temployeeVO.setEmail("amogh13051981@gmail.com");
		temployeeVO.setBalance(35);
		temployeeVO.setPhone(7688);
		
		EmployeeVO pemployeeVO=new EmployeeVO();
		pemployeeVO.setName("Durga King");
		pemployeeVO.setEmail("durga@gmail.com");
		pemployeeVO.setBalance(1000);
		pemployeeVO.setPhone(918726262);
		
		
		EmployeeVO pkemployeeVO=new EmployeeVO();
		pkemployeeVO.setName("Mahesh KUmar");
		pkemployeeVO.setEmail("mahesh@gmail.com");
		pkemployeeVO.setBalance(878700);
		pkemployeeVO.setPhone(213123213);
		
		List<EmployeeVO> employeeVOs=new ArrayList<EmployeeVO>();
		employeeVOs.add(employeeVO);
		employeeVOs.add(temployeeVO);
		employeeVOs.add(pemployeeVO);
		employeeVOs.add(pkemployeeVO);
		return employeeVOs;
	}

}
