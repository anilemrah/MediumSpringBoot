package com.anilemrah.springboot.basicrestapi.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anilemrah.springboot.basicrestapi.entity.Car;

// This class is going to be our REST Controller
// We will reach the methods via /api/XYZ
@RestController
@RequestMapping("/api")
public class BasicRestApiController {
	
	// This is legacy code from the previous example
	// You can delete this
	@RequestMapping("/")
	public String printHelloWorld() {
		return "Greetings from Spring Boot!";
	}
	
	// This method will show cars with RESTAPI GET method
	@GetMapping("/cars")
	public List<Car> getCars() {
		// Create a list of cars to show
		List<Car> listOfCars = new ArrayList<>();
		
		// Create some cars
		Car car1 = new Car("Mercedes", "A180", "white");
		Car car2 = new Car("Mercedes", "E200", "black");
		Car car3 = new Car("Mercedes", "S400", "black");
		Car car4 = new Car("BMW", "520d", "white");
		Car car5 = new Car("BMW", "320d", "red");
		Car car6 = new Car("Tesla", "ModelS", "red");
		
		// Add all cars to the list
		listOfCars.add(car1);
		listOfCars.add(car2);
		listOfCars.add(car3);
		listOfCars.add(car4);
		listOfCars.add(car5);
		listOfCars.add(car6);
		
		// Return the list
		return listOfCars;
	}
}
