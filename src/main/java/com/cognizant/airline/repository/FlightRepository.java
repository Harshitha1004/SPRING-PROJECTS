package com.cognizant.airline.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.airline.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight,Integer>{

	Optional<Flight> findFlightByName(String name);

	
	


	Optional<Flight> findFlightByStart(String start);





	Optional<Flight> findFlightByDestination(String destination);





	Optional<Flight> findFlightByStartDate(String startDate);





	Optional<Flight> findFlightByEndDate(String endDate);
	
}
