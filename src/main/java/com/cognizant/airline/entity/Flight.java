package com.cognizant.airline.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="FLIGHT_TBL")
public class Flight {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private double price;
	//private boolean blocked;
	private String start;
	private String destination;
	private String startTime;
	private String arrivalTime;
	private String startDate;
	private String endDate;

}
