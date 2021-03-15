package com.cg.apps.task;

import org.springframework.boot.SpringApplication;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.apps.task.customerms.ui.*;
import com.cg.apps.task.items.ui.*;
@SpringBootApplication
public class TaskApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=	SpringApplication.run(TaskApplication.class, args);
		
		CustomerUI customerUI = context.getBean(CustomerUI.class);
		customerUI.start();
		
		ItemUI itemUI = context.getBean(ItemUI.class);
		itemUI.start();
		
	}

}