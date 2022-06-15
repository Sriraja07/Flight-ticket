package com.sriraja.springboot.FligthTicketBooking.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.sriraja.springboot.FligthTicketBooking.Model.Flight;

@Service
@Component
public class FlightService {
	    private static List<Flight> flights = new ArrayList<Flight>();
	    private static int flightCount = 3;

	    static {
	        flights.add(new Flight(1, "Indigo", new Date(),"Chennai to Banglore", 4500));
	        flights.add(new Flight(2, "Go first", new Date(),"Chennai to Banglore", 4500));
	        flights.add(new Flight(3, "Air India", new Date(),"Chennai to Banglore", 4500));
	    }

	    public List<Flight> retrieveflights(String user) {
	        List<Flight> filteredflight = new ArrayList<Flight>();
	        for (Flight todo : flights) {
	                filteredflight.add(todo);
	            }
	        return filteredflight;
	    }

	    public void addflight(String name, String place, Date targetDate, double cost) {
	        flights.add(new Flight(++flightCount, name, targetDate, place, cost));
	    }

	    public void deleteflight(int id) {
	        Iterator<Flight> iterator = flights.iterator();
	        while (iterator.hasNext()) {
	            Flight flight = iterator.next();
	            if (flight.getFlightid() == id) {
	                iterator.remove();
	            }
	        }
	    }
}
