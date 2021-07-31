package com.xworkz.grocery.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.search.GrocerySearch;

public class GroceryDAOImpl implements GroceryDAO{

	private List<GroceryDTO> collection = new ArrayList<GroceryDTO>();
	
	@Override
	public boolean create(GroceryDTO dto) {
	boolean add = collection.add(dto);
	System.out.println(dto);
		return add;
	}

	@Override
	public Optional<GroceryDTO> findone(String name) {
	
		return this.collection.stream().filter(dto -> dto.getName().equals(name)).findFirst();
	}

	@Override
	public Collection<GroceryDTO> findAll(GrocerySearch search) {
		Collection<GroceryDTO> temp = new ArrayList<GroceryDTO>();
		this.collection.forEach(w -> {
			if(search.test(w)) {
				temp.add(w);
			}
		});
		return temp;
	}

	@Override
	public Optional<GroceryDTO> findbyMaxQuantity() {
     Optional<GroceryDTO> opt = Optional.of(Collections.max(collection));
		return opt;
	}

	@Override
	public Optional<GroceryDTO> findbyManufacturingDate(String date) {
		
		return this.collection.stream().filter(dto -> dto.getManufactureDate().equals(date)).findFirst();
	}

	@Override
	public Optional<GroceryDTO> findAllByExpiredDate(String date) {
		
		return this.collection.stream().filter(dto -> dto.getManufactureDate().equals(date)).findFirst();
	}

}
