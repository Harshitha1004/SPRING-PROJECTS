package com.cognizant.airline.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.airline.entity.Flight;
import com.cognizant.airline.service.FlightService;


@RestController
public class FlightController {

	@Autowired
	private FlightService service;
	
	@PostMapping("/addFlight")
	public Flight addFlight(@RequestBody Flight flight)
	{
		return service.saveFlight(flight);
	}
	@PostMapping("/addFlights")
	public List<Flight> addFlights(@RequestBody List<Flight> flights)
	{
		return service.saveFlights(flights);
	}
	@GetMapping("/flights")
	public List<Flight> findAllFlights()
	{
		return service.getFlights();
	}
	@GetMapping("/flightById/{id}")
	public Flight findFlightById(@PathVariable int id)
	{
		return service.getFlightById(id);
	}
	@GetMapping("/flightByName/{name}")
	public Flight findFlightByName(@PathVariable String name)
	{
		return service.getFlightByName(name);
	}
	
	@GetMapping("/flightByStart/{start}")
	public Flight findFlightByStart(@PathVariable String start)
	{
		return service.getFlightByStart(start);
	}
	@GetMapping("/flightByDestination/{destination}")
	public Flight findFlightByDestination(@PathVariable String destination)
	{
		return service.getFlightByDestination(destination);
	}
	

	
	@GetMapping("/flightByStartDate/{startDate}")
	public Flight findFlightByStartDate(@PathVariable String startDate)
	{
		return service.getFlightByStartDate(startDate);
	}
	
	@GetMapping("/flightByEndDate/{endDate}")
	public Flight findFlightByEndDate(@PathVariable String endDate)
	{
		return service.getFlightByEndDate(endDate);
	}
	@PutMapping("/update")
	public Flight updateFlight(@RequestBody Flight flight)
	{
		return service.updateFlight(flight);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteFlight(@PathVariable int id)
	{
		return service.deleteFlight(id);
	}
}
