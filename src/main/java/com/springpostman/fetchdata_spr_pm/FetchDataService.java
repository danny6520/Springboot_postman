package com.springpostman.fetchdata_spr_pm;

import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;


@Repository
public interface FetchDataService extends JpaRepository<UserModel,Integer>{
	ArrayList arrlist=new ArrayList();
	@Override
	ArrayList<UserModel> findAll();
	public static void main (String[] args) {
		//System.out.println(List<UserModel>);
		
		for (int i = 0; i < arrlist.size();i++) 
	      { 		      
	          System.out.println(arrlist.get(i)); 		
	      }   
	}
	
    
	
	
	/*
	HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	
    public default HashMap<Integer, String> getHashmap() {
    	try {
			hashmap.put(UserModel.election_id,UserModel.candidate_name);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	 	
	 	
        return hashmap;
    }

    public void setHashmap(HashMap<Integer, String> hashmap) {
        this.hashmap = hashmap;
    }
    */

}
