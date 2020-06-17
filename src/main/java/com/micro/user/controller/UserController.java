package com.micro.user.controller;

import java.util.Optional;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.micro.user.entity.User;
import com.micro.user.repository.UserRepository;

@RestController
@Produces(MediaType.APPLICATION_JSON)
public class UserController {
	
	@Value("${server.port}")
	int port;
	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/check")
	public String check()
	{
		return "ok";
	}
	
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable int id)
	{
		Optional<User> user = userRepository.findById(id);
		System.out.println("working port is: " +port +" of user service");
		return user.get();
	}
	

}
