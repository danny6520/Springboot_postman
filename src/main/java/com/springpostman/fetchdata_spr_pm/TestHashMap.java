package com.springpostman.fetchdata_spr_pm;

import java.util.*;

public class TestHashMap {
	
	 private HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	 	
	    public HashMap<Integer, String> getHashmap() {
	    	hashmap.put(01,"html");
		 	hashmap.put(02, "css");
		 	hashmap.put(03, "php");
		 	
	        return hashmap;
	    }

	    public void setHashmap(HashMap<Integer, String> hashmap) {
	        this.hashmap = hashmap;
	    }
}
