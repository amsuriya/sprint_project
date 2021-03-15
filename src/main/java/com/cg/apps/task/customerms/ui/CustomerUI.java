package com.cg.apps.task.customerms.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.apps.task.customerms.entities.*;
import com.cg.apps.task.customerms.service.*;

@Component
public class CustomerUI {

	@Autowired
	ICustomerService service;

	public void start() {

		Customer suriya = service.createCustomer("Suriya");
		display(suriya);

		Customer rohan = service.createCustomer("Rohan");
		display(rohan);

		Customer findCustomer = service.findById(6L);
		display(findCustomer);

		Long suriyaId = suriya.getId();
		Customer suriyaAmount = service.addAmount(suriyaId, 223.0);
		display(suriyaAmount);

	}

	void display(Customer customer) {
		Account account = customer.getAccount();
		System.out.println("Customer Id is " + customer.getId() + "\nCustomer Name is " + customer.getName()
				+ " \n Customer Account Id  is " + account.getAccountID() + "\n Account Balance is "
				+ account.getBalance() + " \n Time Of Creation is" + account.getCreated());
	}

}