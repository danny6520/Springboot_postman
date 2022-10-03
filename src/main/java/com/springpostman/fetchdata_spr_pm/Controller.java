package com.springpostman.fetchdata_spr_pm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class Controller {
	
	@Autowired
	FetchDataService fetchDataService;
	
	@GetMapping(path = "getdata")
	List<UserModel> getUsers() {
		
		return fetchDataService.findAll();
	
		}
	
	@GetMapping(path = "testpath")
	public TestClass getTestValue () {
		TestClass tcl = new TestClass ();
		tcl.setCost(5);
		return tcl;
		
	}
	
	@GetMapping(path = "getarraylist")
	public TestArrayList getArrListVal () {
		TestArrayList tarl = new TestArrayList ();
		return tarl;
	}
	
	@GetMapping(path = "getarrhashmap")
	public TestHashMap getArrHashMap () {
		TestHashMap thm = new TestHashMap ();
		return thm;
		
		
	}
	
	@GetMapping(path = "arrhash")
	public ArrliHash getArrlHash () {
		ArrliHash arlh = new ArrliHash ();
		return arlh;
	}
	
	}

