package com.sample.postgress.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.sample.postgress.dao.CarDao;
import com.sample.postgress.entity.Car;

/**
 * CarServiceImpl Class is the implemetation Detail of Car Service
 * 
 * @author Chaturanand Yadav
 * @version 1.0
 * @since 2020-01-13
 */
@Component
public class CarServiceImpl implements CarService {
	@Resource
	CarDao carDao;

	@Override
	public List<Car> findAll() {
		return carDao.findAll();
	}

	@Override
	public void insertCar(Car car) {
		carDao.insertCar(car);

	}

	@Override
	public void updateCar(Car car) {
		carDao.updateCar(car);

	}

	@Override
	public void executeUpdateCar(Car car) {
		carDao.executeUpdateCar(car);

	}

	@Override
	public void deleteCar(Car car) {
		carDao.deleteCar(car);

	}
}
