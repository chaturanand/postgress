package com.sample.postgress.service;

import java.util.List;
/**
* CarService Class is the Signature of Service of Car 
* @author Chaturanand Yadav
* @version 1.0
* @since   2020-01-13 
*/

import com.sample.postgress.entity.Car;

public interface CarService {
	List<Car> findAll();

	void insertCar(Car car);

	void updateCar(Car car);

	void executeUpdateCar(Car car);

	void deleteCar(Car car);

}
