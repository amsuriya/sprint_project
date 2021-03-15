package com.cg.apps.task.items.dao;

import com.cg.apps.task.items.entities.*;

public interface IItemDAO {

	Item add(Item item);

	Item update(Item item);

	Item findById(String itemId);

}