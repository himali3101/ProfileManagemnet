package com.cg.realestate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.realestate.dao.ProfileDao;
import com.cg.realestate.model.Profile;

@Service
public class ProfileService{

	@Autowired
	private ProfileDao dao;
	
	public Profile createProfile(Profile adduser) {
		Profile user = dao.save(adduser);
		return user;
	}
	
	public List<Profile> findAll(){
		 List<Profile> users = new ArrayList<>();
		 dao.findAll().forEach(users::add);
		 return users;
		
	}
	
	public Profile updateProfile(Profile updateUser) {
	
		Profile user = dao.findById(updateUser.getUserId()).get();
	 
		if( user == null) {
	    	return null;
	    }
	    else {
	    	user.setUserName(updateUser.getUserName());
	    	user.setEmailId(updateUser.getEmailId());
	    	user.setPhoneNo(updateUser.getPhoneNo());
	    	
	    	
	    	dao.save(user);
	    	return user;
	    }
	}
	
	/*public User findByEmailId(String emailId) {
		return dao.findByEmailId(emailId)
	}*/
}
