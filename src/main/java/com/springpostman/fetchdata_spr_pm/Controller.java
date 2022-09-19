package com.springpostman.fetchdata_spr_pm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	FetchDataService fetchDataService;
	
	@GetMapping(path = "getdata")
	List<UserModel> getUsers() {
		
		return fetchDataService.findAll();
		
		
		
	}
}
