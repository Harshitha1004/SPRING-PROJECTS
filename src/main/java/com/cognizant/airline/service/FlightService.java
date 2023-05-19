package com.cognizant.airline.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.airline.entity.Flight;
import com.cognizant.airline.repository.FlightRepository;

@Service
public class FlightService {

	@Autowired
	private FlightRepository repository;
	
	public Flight saveFlight(Flight flight)
	{
		return repository.save(flight);
	}
	public List<Flight> saveFlights(List<Flight> flights)
	{
		return repository.saveAll(flights);
	}
	public List<Flight> getFlights()
	{
		return repository.findAll();
	}
	public Flight getFlightById(int id)
	{
		return repository.findById(id).orElse(null);
	}
	public Flight getFlightByName(String flightName)
	{
		return repository.findFlightByName(flightName).orElse(null) ;
	}
	 public String deleteFlight(int id)
	 {
		 repository.deleteById(id);
		 return "Flight removed !!"+id;
	 }
	 public Flight updateFlight(Flight flight)
	 {
		 Flight existingFlight=repository.findById(flight.getId()).orElse(null);
		 existingFlight.setName(flight.getName());
		 existingFlight.setPrice(flight.getPrice());
		 existingFlight.setStart(flight.getStart());
		 existingFlight.setDestination(flight.getDestination());
		 existingFlight.setStartDate(flight.getStartDate());
		 existingFlight.setEndDate(flight.getEndDate());
		 existingFlight.setStartTime(flight.getStartTime());
		 existingFlight.setArrivalTime(flight.getArrivalTime());
		 return repository.save(existingFlight);
	 }
	public Flight getFlightByStart(String start) {
		// TODO Auto-generated method stub
		return repository.findFlightByStart(start).orElse(null) ;
	}


	public Flight getFlightByDestination(String destination) {
		// TODO Auto-generated method stub
		return repository.findFlightByDestination(destination).orElse(null) ;
	}
	public Flight getFlightByStartDate(String startDate) {
		// TODO Auto-generated method stub
		return repository.findFlightByStartDate(startDate).orElse(null) ;
	}
	public Flight getFlightByEndDate(String endDate) {
		// TODO Auto-generated method stub
		return repository.findFlightByEndDate(endDate).orElse(null) ;
	}
}
