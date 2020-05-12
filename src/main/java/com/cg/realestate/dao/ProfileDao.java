package com.cg.realestate.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.realestate.model.Profile;

@Repository
public interface ProfileDao extends CrudRepository<Profile, Integer>{

	//public User findById(int userId);
	//public User findByEmailId(String emailId);
	
}
