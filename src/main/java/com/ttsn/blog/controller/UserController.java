package com.ttsn.blog.controller;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.ttsn.blog.payloads.UserDto;
import com.ttsn.blog.services.UserService;

@RestController
@RequestMapping("api/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	//POST-create user
	@PostMapping("/")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
		
		UserDto createUserDto = this.userService.createUser(userDto);
		return  new ResponseEntity<>(createUserDto, HttpStatus.CREATED);
	}
	
	
	//PUT- update user
	
	//DELETE - delete user
	
	//GET - user get
	
	
}
