package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.domain.CurrentUser;
import com.example.domain.User;

/*
	UserDetailsService
	
	It is a core interface in spring security to load user specific data. 
	This interface is considered as user DAO and will be implemented by specific DAO implementations. 
	
	For example, for a basic in memory authentication, there is a InMemoryUserDetailsManager. 
	This interface declares only one method loadUserByUsername(String username) 
	which simplifies the implementation classes to write other specific methods.
	
	if you want to use your existing DAO classes to load the user details from the database, 
	just implement the UserDetailsService and override the method loadUserByUsername(String username). 
	
	the model CurrentUser must be of type org.springframework.security.userdetails.UserDetails.
	This will have the advantage of not exposing our domain class.
 */
@Service
public class CurrentUserDetailsService implements UserDetailsService {

	private final UserService userService;

	@Autowired
	public CurrentUserDetailsService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userService.getUserByUsername(username);
		return new CurrentUser(user);
	}

}
