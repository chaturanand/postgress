package com.sample.postgress.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.postgress.entity.Car;
import com.sample.postgress.service.CarService;

/**
 * ApplicationController class is open or autodetected through path.
 * 
 * @author Chaturanand Yadav
 * @version 1.0
 * @since 2020-01-13
 */

@RestController
@RequestMapping("/postgressApp")
public class ApplicationController {

	@Resource
	CarService carService;

	@GetMapping(value = "/carList")
	public List<Car> getCar() {
		return carService.findAll();

	}

	@PostMapping(value = "/createcar")
	public void createCar(@RequestBody Car car) {
		carService.insertCar(car);

	}

	@PutMapping(value = "/updatecar")
	public void updateCar(@RequestBody Car car) {
		carService.updateCar(car);

	}

	@PutMapping(value = "/executeUpdatecar")
	public void executeUpdateCar(@RequestBody Car car) {
		carService.executeUpdateCar(car);

	}

	@DeleteMapping(value = "/deletecarById")
	public void deleteCar(@RequestBody Car car) {
		carService.deleteCar(car);

	}

}
