package com.sample.postgress.mapper;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sample.postgress.entity.Car;

/**
 * CarRowMapper Class is the Factory Class or Entity Mapper Class of Car
 * 
 * @author Chaturanand Yadav
 * @version 1.0
 * @since 2020-01-13
 */

public class CarRowMapper implements RowMapper<Car> {

	@Override
	public Car mapRow(ResultSet rs, int arg1) throws SQLException {
		Car car = new Car();
		car.setCarId(rs.getString("carId"));
		car.setLicensePlate(rs.getString("licensePlate"));
		car.setSeatCount(rs.getString("seatCount"));
		car.setCovertiable(rs.getString("covertiable"));
		car.setRating(rs.getString("rating"));
		car.setEngineType(rs.getString("engineType"));

		return car;
	}

}
