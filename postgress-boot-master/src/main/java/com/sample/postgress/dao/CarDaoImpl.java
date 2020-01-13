package com.sample.postgress.dao;

import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.sample.postgress.entity.Car;
import com.sample.postgress.mapper.CarRowMapper;

/**
 * CarDaoImpl Class is the Data Access object implementation or method is
 * Defined
 * 
 * @author Chaturanand Yadav
 * @version 1.0
 * @since 2020-01-13
 */
@Repository
public class CarDaoImpl implements CarDao {

	public CarDaoImpl(NamedParameterJdbcTemplate template) {
		this.template = template;
	}

	NamedParameterJdbcTemplate template;

	@Override
	public List<Car> findAll() {
		return template.query("select * from car", new CarRowMapper());
	}

	@Override
	public void insertCar(Car car) {
		final String sql = "insert into car(carid, licenseplate, seatcount, covertiable, rating, enginetype) values(:carId,:licensePlate,:seatCount,:covertiable,:rating,:engineType)";

		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource().addValue("carId", car.getCarId())
				.addValue("licensePlate", car.getLicensePlate()).addValue("seatCount", car.getSeatCount())
				.addValue("covertiable", car.getCovertiable()).addValue("rating", car.getRating())
				.addValue("engineType", car.getEngineType());
		template.update(sql, param, holder);

	}

	@Override
	public void updateCar(Car car) {
		final String sql = "update car set licenseplate=:licensePlate, seatcount=:seatCount, covertiable=:covertiable,rating=:rating,enginetype=:engineType where carid=:carId";

		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource().addValue("carId", car.getCarId())
				.addValue("licensePlate", car.getLicensePlate()).addValue("seatCount", car.getSeatCount())
				.addValue("covertiable", car.getCovertiable()).addValue("rating", car.getRating())
				.addValue("enginetype", car.getEngineType());
		template.update(sql, param, holder);

	}

	@Override
	public void executeUpdateCar(Car car) {
		final String sql = "update car set licenseplate=:licensePlate, seatcount=:seatCount, covertiable=:covertiable,rating=:rating,enginetype=:engineType where carid=:carId";

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("carId", car.getCarId());
		map.put("licensePlate", car.getLicensePlate());
		map.put("seatCount", car.getSeatCount());
		map.put("covertiable", car.getCovertiable());
		map.put("rating", car.getRating());
		map.put("rating", car.getRating());
		map.put("engineType", car.getEngineType());

		template.execute(sql, map, new PreparedStatementCallback<Object>() {
			@Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				return ps.executeUpdate();
			}
		});

	}

	@Override
	public void deleteCar(Car car) {
		System.out.println("Delete the value is ");
		final String sql = "delete from car where carId=:carId";

		Map<String, Object> map = new HashMap<String, Object>();
		System.out.println("Car Id is" + car.getCarId());
		map.put("carId", car.getCarId());

		template.execute(sql, map, new PreparedStatementCallback<Object>() {
			@Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				return ps.executeUpdate();
			}
		});

	}

}
