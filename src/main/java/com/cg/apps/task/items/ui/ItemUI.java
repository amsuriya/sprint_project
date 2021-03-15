package com.cg.apps.task.items.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.cg.apps.task.items.entities.*;
import com.cg.apps.task.items.service.*;

@Component
public class ItemUI {

	@Autowired
	IItemService service;

	public void start() {

		Item item1 = service.create(150.0, "rice");
		display(item1);

		Item item2 = service.create(80.0, "sugar");
		display(item2);

	}

	void display(Item item) {
		System.out.println("Item id is " + item.getId() + "\n Price if item is  " + item.getPrice()
				+ "\n Name of item is  " + item.getDescription());

	}

}