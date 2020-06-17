package com.micro.user.repository;

import org.springframework.data.repository.CrudRepository;

import com.micro.user.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	

}
