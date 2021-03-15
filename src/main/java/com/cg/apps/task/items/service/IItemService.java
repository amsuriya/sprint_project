package com.cg.apps.task.items.service;

import com.cg.apps.task.items.entities.*;

public interface IItemService {

	Item create(Double price, String description);

	Item findById(String itemID);

	Item buyItem(String itemId, Long customerId);

}