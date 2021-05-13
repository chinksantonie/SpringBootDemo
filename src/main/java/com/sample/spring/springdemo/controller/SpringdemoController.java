package com.sample.spring.springdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.spring.springdemo.domain.Items;

@RestController
public class SpringdemoController {

	@GetMapping(value = "/api/getAllItems",produces = "application/json")
	public List<Items> handleGetAllItemsAPIRequest() throws Exception {
		List<Items> itemList = new ArrayList<Items>();
		Items biba = new Items(1234, "Apparels", 1239, "Biba");
        Items fabIndia = new Items(2345,"Kurtis",2346,"FabIndia");
        Items allenSolly = new Items(3467,"Formal Shirts",2999,"Allen Solly");
        Items westSide = new Items(1123,"Bags",3500,"WestSide");
        Items zara = new Items(1678,"Jumpsuits",1270,"Zara");
		itemList.add(biba);
		itemList.add(fabIndia);
		itemList.add(allenSolly);
		itemList.add(westSide);
		itemList.add(zara);
		return itemList;
		
	}
}
