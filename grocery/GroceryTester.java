package com.xworkz.grocery;

import java.util.Arrays;
import java.util.Collection;
import java.util.Optional;

import com.xworkz.grocery.dao.GroceryDAO;
import com.xworkz.grocery.dao.GroceryDAOImpl;
import com.xworkz.grocery.dto.GroceryDTO;

public class GroceryTester {

	public static void main(String[] args) {
	
		GroceryDTO gt = new GroceryDTO("Biscuit", 45f, "Snaks",1 , true, "MariGold", "25/12/2021","31/03/2015",true,true,"123456789122331");
		
		GroceryDTO gt1 = new GroceryDTO("Chocolate", 450f, "Snaks",50 , true, "Cadburry", "25/12/2021","1/03/2015",true,true,"12311222 789122331");
        
		GroceryDTO gt2 = new GroceryDTO("ToorDal", 25f, "Pulse",1 , true, "Goodness", "5/12/2021","3/03/2015",true,true,"12345678914569");

		GroceryDTO gt3 = new GroceryDTO("oil", 55f, "cookingOil",1 , true, "SunFlower", "13/12/2020","1/03/2017",true,true,"1234567891223233");

		System.out.println("All DTO");
		
		GroceryDAO dao = new GroceryDAOImpl();
		dao.create(gt3);
		dao.create(gt1);
		dao.create(gt);
		dao.create(gt2);
		
		Collection<GroceryDTO> list = Arrays.asList(gt,gt1,gt2);
		System.out.println("**************************");
		
		System.out.println("Find One");
		Optional<GroceryDTO> dtoFound = list.stream().filter(t -> t.getName().equals("Biscuit")).findFirst();
		if(dtoFound.isPresent()) {
			GroceryDTO opt = dtoFound.get();
			System.out.println("dto" +opt);
			
		}else {
			System.out.println("Grocery not found");
		}
		
		System.out.println("******************************");
		System.out.println("Find All");
		Collection<GroceryDTO> coll = dao.findAll(b ->
		b.getName().equals("Chocolate"));
		for(GroceryDTO gro : coll) {
			System.out.println(gro);
		}
		
		
		System.out.println("*******************************");
		System.out.println("Find by manufacturing date");
		
		Optional<GroceryDTO> dtofound1 = list.stream().filter(q ->
		q.getManufactureDate().equals("13/12/2020")).findAny();
		if(dtofound1.isPresent()) {
			GroceryDTO opt1 = dtofound1.get();
			System.out.println(opt1);
		}else {
			System.out.println("Grocery not found");
		}
		
		System.out.println("******************************");
		
		System.out.println("Find by max Quantity");
		System.out.println(dao.findbyMaxQuantity());
		
		System.out.println("****************************");
		System.out.println("Find by expiry date");
		
		Optional<GroceryDTO> dtofound2 = list.stream().filter(s ->
		s.getExpireDate().equals("13/12/2020")).findAny();
		if(dtofound2.isPresent()) {
			GroceryDTO opt1 = dtofound2.get();
			System.out.println(opt1);
			
		}else {
			System.out.println("Grocery not found");
		}
				
	}

}
