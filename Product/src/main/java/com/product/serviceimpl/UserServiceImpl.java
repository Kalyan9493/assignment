package com.product.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.entity.User;
import com.product.repository.UserRepository;
import com.product.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	public User register(User user) {
		
		return userRepository.save(user);
		
	}

}
