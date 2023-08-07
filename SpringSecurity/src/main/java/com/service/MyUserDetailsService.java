package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.model.User;
import com.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService{

	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		//to get username we need a repository, for that we need to have a repository interface that extends JPA repository
		
		User user = userRepository.findByUsername(username);
		if(user == null)
			
			throw new UsernameNotFoundException("User 404");
		
		//if user exists we need to return user details but here userdetails return type is an interface, so we need to create a class that provide implementation of userdetails interface
		return new UserDetailsImpl(user);
	}

}
