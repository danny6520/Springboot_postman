package com.springpostman.fetchdata_spr_pm;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface FetchDataService extends JpaRepository<UserModel,Integer> {
	@Override
	List<UserModel> findAll();
}
