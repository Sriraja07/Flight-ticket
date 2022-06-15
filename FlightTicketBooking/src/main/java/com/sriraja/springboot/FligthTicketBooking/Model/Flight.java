package com.sriraja.springboot.FligthTicketBooking.Model;

import java.util.Date;

import org.springframework.stereotype.Component;

public class Flight {
	private int flightid;
	private String flightname;
	private Date date;
	private String place;
	private double cost;
	
	
	public Flight(int flightid, String flightname, Date date, String place, double cost) {
		this.flightid = flightid;
		this.flightname = flightname;
		this.date = date;
		this.place = place;
		this.cost = cost;
	}
	
	public int getFlightid() {
		return flightid;
	}
	public void setFlightid(int flightid) {
		this.flightid = flightid;
	}
	public String getFlightname() {
		return flightname;
	}
	public void setFlightname(String flightname) {
		this.flightname = flightname;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "flight [flightid=" + flightid + ", flightname=" + flightname + ", date=" + date + ", place=" + place
				+ ", cost=" + cost + "]";
	}
	
}