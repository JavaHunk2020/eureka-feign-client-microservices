package com.kuebiko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.kuebiko.vo.AccountVO;
import com.kuebiko.vo.ApplicationResponseVO;



//HTTP verbs
//POST , GET , PUT , DELETE, PATCH
@RestController
//Versioning in rest api
//@RequestMapping("/v2")
public class AccountController {
	
	  @Value("${server.port}")
	   private int port;
	
		/*
		 * @LoadBalanced
		 * 
		 * @Bean RestTemplate restTemplate() { return new RestTemplate(); }
		 * 
		 * @Autowired private RestTemplate restTemplate;
		 */
		

	    @Autowired
	    private BankEmploeeServiceFeignClient bankEmploeeService;
	
	@GetMapping("/accounts/employees")
	public List<EmployeeVO> findEmployee() {
		//HttpHeaders getHeaders = new HttpHeaders();
       // getHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
       // HttpEntity<EmployeeVO> entity = new HttpEntity<>(getHeaders);
       // List<EmployeeVO> customerVOs=new ArrayList<>();
		//ResponseEntity<? extends List>  result = restTemplate.exchange("http://BANKING-API-EMP"+"/v2/employees",HttpMethod.GET,entity,customerVOs.getClass());
		System.out.println("Magic of feign client1!!!");
		return bankEmploeeService.getAllEmpoyees();
	}
	
	@GetMapping("/accounts/employees/{eid}")
	public EmployeeVO findEmployee(@PathVariable int eid) {
		System.out.println("Magic of feign client2!!!");
		return bankEmploeeService.getAllEmpoyees(eid);
	}
	
	//CRUD - Create , Read , Update , Delete
	//Resource - is conceptual entity
	//which represent data and mapped with unique URI
	//URL
	//www.amazon.com/v23/friends
	@GetMapping("/accounts/{aid}")
	public AccountVO findAccount(@PathVariable String aid) {
		System.out.println("Request is served from port number ["+port+"]");
		AccountVO accountVO=new AccountVO();
		accountVO.setPort(port);
		accountVO.setAc(aid);
		accountVO.setBalance(1222);
		accountVO.setMobile("+919873003702");
		accountVO.setEmail("technohunk444@gmail.com");
		accountVO.setName("Nagendra Kumar");
		return accountVO; 
	}
	
	@DeleteMapping("/accounts/{aid}")
	public ApplicationResponseVO deleteAccount(@PathVariable String aid) {
		ApplicationResponseVO applicationResponseVO=new ApplicationResponseVO();
		applicationResponseVO.setCode("C900");
		applicationResponseVO.setMessage("Account is created successfully!!!");
		return applicationResponseVO; 
	}
	
	//@RequestBody ->> This annotation which reads JSON/XML data from
	//incoming request body and map with Java Object
	@PostMapping("/accounts")
	public ApplicationResponseVO createAccount(@RequestBody AccountVO accountVO) {
		ApplicationResponseVO applicationResponseVO=new ApplicationResponseVO();
		applicationResponseVO.setCode("C900");
		applicationResponseVO.setMessage("Account is created successfully!!!");
		return applicationResponseVO; 
	}
	
	@GetMapping("/")
	public List<AccountVO> findAccounts() {
		AccountVO accountVO=new AccountVO();
		accountVO.setAc("A100");
		accountVO.setBalance(1222);
		accountVO.setEmail("technohunk444@gmail.com");
		accountVO.setName("Nagendra Kumar");
		return Arrays.asList(accountVO);
	}

}
