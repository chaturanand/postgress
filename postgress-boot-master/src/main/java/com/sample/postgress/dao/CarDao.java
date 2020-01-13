package com.sample.postgress.dao;

import java.util.List;

/**
* CarDao Class is the Data Access object of Car 
* @author Chaturanand Yadav
* @version 1.0
* @since   2020-01-13 
*/

import com.sample.postgress.entity.Car;

public interface CarDao {

	List<Car> findAll();

	void insertCar(Car car);

	void updateCar(Car car);

	void executeUpdateCar(Car car);

	public void deleteCar(Car car);
}
