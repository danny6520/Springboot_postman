package com.springpostman.fetchdata_spr_pm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArrliHash {

	String sArray[] = {"html", "php", "java", "python"};
	List<String> list = Arrays.asList(sArray);
	ArrayList<String> result = new ArrayList<String>(list);

	public ArrayList<String> getResult() {
		return result;
	}
	public void setResult(ArrayList<String> result) {
		this.result = result;
	}
	
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
