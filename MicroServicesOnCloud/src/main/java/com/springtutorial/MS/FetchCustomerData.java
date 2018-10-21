package com.springtutorial.MS;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FetchCustomerData {

	@RequestMapping(value="/getCustomerdata",produces= {"application/json"})
	public Customer getCustomerData() {
	//	System.out.println("Customer id is "+ id);
		Customer customer = new Customer();
		customer.setName("Ruchi");
		customer.setSurname("Dubey");
		customer.setCompany("IBM");
		return customer;
	}
}
