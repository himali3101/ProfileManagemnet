package com.cg.realestate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.realestate.dao.ProfileDao;
import com.cg.realestate.model.User;

@Service
public class ProfileService{

	@Autowired
	private ProfileDao dao;
	
	public User createProfile(User adduser) {
		User user = dao.save(adduser);
		return user;
	}
	
	public List<User> findAll(){
		 List<User> users = new ArrayList<>();
		 dao.findAll().forEach(users::add);
		 return users;
		
	}
	
	public User updateProfile(User updateUser) {
	
		User user = dao.findById(updateUser.getUserId()).get();
	 
		if( user == null) {
	    	return null;
	    }
	    else {
	    	user.setUserName(updateUser.getUserName());
	    	user.setEmailId(updateUser.getEmailId());
	    	user.setPassword(updateUser.getPassword());
	    	user.setPhoneNo(updateUser.getPhoneNo());
	    	user.setUserType(updateUser.getUserType());
	    	
	    	dao.save(user);
	    	return user;
	    }
	}
	
	/*public User findByEmailId(String emailId) {
		return dao.findByEmailId(emailId)
	}*/
}
