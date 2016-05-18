package com.developer.model;

/**
 * Models the flight departure by encapsulating flight id, gate, destination and flight time 
 *
 */
public class FlightDeparture {

	private String flightId;
	private String flightGate;
	private String destination;
	private String flightTime;

	public FlightDeparture(String flightId,String flightGate,String destination,String flightTime){
		this.flightId = flightId;
		this.flightGate = flightGate;
		this.destination = destination;
		this.flightTime = flightTime;
	}
	
	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public String getFlightGate() {
		return flightGate;
	}

	public void setFlightGate(String flightGate) {
		this.flightGate = flightGate;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}
	
	
}
