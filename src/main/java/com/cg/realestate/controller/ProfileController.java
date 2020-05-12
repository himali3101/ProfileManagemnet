package com.cg.realestate.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.realestate.model.Profile;
import com.cg.realestate.service.ProfileService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@CrossOrigin
@RequestMapping("/profile")
@Api(value = "Profile Management")
public class ProfileController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProfileController.class);

	
	@Autowired
	ProfileService service;
	
	@GetMapping(path = "/display")
	@ApiOperation(value = "displayProfile", nickname = "displayProfile")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Profile.class),
							@ApiResponse(code = 500, message = "Failure", response = Profile.class) })
	public List<Profile> display() {
		logger.info("display profile.");
		logger.trace(" Inside profile display() function");
		logger.error("Error happened at profile display()");
		return service.findAll();
		//return "display";
	}
	

	@PostMapping(path = "/create")
	@ApiOperation(value = "addProfile", nickname = "addProfile")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Profile.class),
							@ApiResponse(code = 500, message = "Failure", response = Profile.class) })
	public Profile createProfile(@RequestBody Profile user) {
		logger.info("Adding Profile.");
		logger.trace(" Inside createProfile() function");
		logger.error("Error happened at createProfile()");
		return service.createProfile(user);
		
	}
	
	@PostMapping(path = "/update")
	@ApiOperation(value = "updateProfile", nickname = "updateProfile")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = Profile.class),
							@ApiResponse(code = 500, message = "Failure", response = Profile.class) })
	public Profile updateProfile(@RequestBody Profile updateUser) {
		logger.info("updating Profile.");
		logger.trace(" Inside updateProfile() function");
		logger.error("Error happened at updateProfile()");
		Profile user = service.updateProfile(updateUser);		
		if(user == null) {
			return null;
		}
		else {
			return user;
		
		}	
	}
	
	/*@GetMapping(path = "/login/{emailId}")
	public User (@PathVariable String emailId) {
		return service.findByEmailId(emailId);
	}
	*/
}
