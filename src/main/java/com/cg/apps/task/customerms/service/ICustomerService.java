package com.cg.apps.task.customerms.service;

import com.cg.apps.task.customerms.entities.*;

public interface ICustomerService {
	
    Customer findById(Long customerId);
	
	Customer createCustomer(String name);	
	
	Customer addAmount(Long customerId, double amount);


}