package com.cg.realestate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.realestate.model.User;
import com.cg.realestate.service.ProfileService;

@RestController
@CrossOrigin
public class ProfileController {
	
	@Autowired
	ProfileService service;
	
	@GetMapping(path = "/")
	public List<User> display() {
		
		return service.findAll();
		//return "display";
	}
	

	@PostMapping(path = "/create")
	public User createProfile(@RequestBody User user) {
		
		return service.createProfile(user);
		
	}
	
	@PostMapping(path = "/update")
	public String updateProfile(@RequestBody User updateUser) {
		
		User user = service.updateProfile(updateUser);		
		if(user == null) {
			return "not updated";
		}
		else {
			return "Profile Updated";
		
		}	
	}
	
	/*@GetMapping(path = "/login/{emailId}")
	public User (@PathVariable String emailId) {
		return service.findByEmailId(emailId);
	}
	*/
}
