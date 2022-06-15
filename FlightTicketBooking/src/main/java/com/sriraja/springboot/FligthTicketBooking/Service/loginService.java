package com.sriraja.springboot.FligthTicketBooking.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sriraja.springboot.FligthTicketBooking.Model.UserLogin;

@Component
public class loginService {
	
	@Autowired
	private UserLogin login;
	
	public boolean isvaliduser(String user, String password) {
		return user.equalsIgnoreCase(login.getName()) && password.equalsIgnoreCase(login.getPassword()) ||
				user.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin");	
	}
	
	public void registration(String user, String password, String email) {
		login.setName(user);
		login.setPassword(password);
		login.setEmail(email);
	}

}
