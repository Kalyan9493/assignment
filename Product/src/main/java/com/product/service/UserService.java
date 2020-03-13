package com.product.service;

import org.springframework.stereotype.Service;

import com.product.entity.User;
@Service
public interface UserService {
	
	public User register(User user);

}
