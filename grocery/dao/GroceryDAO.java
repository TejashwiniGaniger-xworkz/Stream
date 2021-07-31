package com.xworkz.grocery.dao;

import java.util.Collection;
import java.util.Optional;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.search.GrocerySearch;

public interface GroceryDAO {

	boolean create(GroceryDTO dto);
	
	Optional<GroceryDTO> findone(String name);
	
	Collection<GroceryDTO> findAll(GrocerySearch search);
	
	Optional<GroceryDTO> findbyMaxQuantity();
	
	Optional<GroceryDTO> findbyManufacturingDate(String date);
	
	Optional<GroceryDTO> findAllByExpiredDate(String date);
}
