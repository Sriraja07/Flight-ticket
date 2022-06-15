package com.sriraja.springboot.FligthTicketBooking.Controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.sriraja.springboot.FligthTicketBooking.Service.FlightService;
import com.sriraja.springboot.FligthTicketBooking.Service.loginService;

@Controller
@SessionAttributes("name")
public class FlightController {
	
	@Autowired
	private loginService service;
	
	@Autowired
	private FlightService fservice;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginpage() {
		return "login";
	}
	
	@RequestMapping(value="/signup", method=RequestMethod.GET)
	public String signuppage() {
		return "/signup";
	}
	
	@RequestMapping(value="/user")
	public String userpage(ModelMap model) {
		String name = (String) model.get("name");
		model.put("flights", fservice.retrieveflights(name));
		return "user";
	}
	@RequestMapping(value="/signup", method=RequestMethod.POST)
	public String signupvalidation(@RequestParam String user,@RequestParam String password, @RequestParam String email) {
		service.registration(user, password, email);
		return "redirect:/login";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String loginvalidation(@RequestParam String name,@RequestParam String password, ModelMap model) {
		if(service.isvaliduser(name, password)) {
			model.put("name", name);
			System.out.println(name);
			if(name.equals("admin"))
				return "redirect:/admin";
			else
				return "welcome";
		}
		else {
			model.put("errorMessage", "Invalid login");
			return "login";
		}
	}
	
	@RequestMapping("/admin")
	public String flightlist(ModelMap model) {
		String name = (String) model.get("name");
		model.put("flights", fservice.retrieveflights(name));
		return "admin";
	}
	@RequestMapping(value="/add-flight",method=RequestMethod.GET)
	public String addTodo() {
		return "add-flight";	
	}
	
	@RequestMapping(value="/delete-flight", method=RequestMethod.GET)
	public String deletetodo(ModelMap model,@RequestParam int id) {
		fservice.deleteflight(id);
		return "redirect:/admin";
	}
	
	@RequestMapping(value="/add-flight",method=RequestMethod.POST)
	public String showaddTodo(ModelMap model, String flightname,String date, String place, double cost ) {
		fservice.addflight(flightname, place, new Date(),cost );
		return "redirect:/admin";	
	}
}
