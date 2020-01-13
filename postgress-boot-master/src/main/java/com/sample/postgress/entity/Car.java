package com.sample.postgress.entity;

/**
 * Car Class is the Entity or Pojo class
 * 
 * @author Chaturanand Yadav
 * @version 1.0
 * @since 2020-01-13
 */
public class Car {

	String carId;
	String licensePlate;
	String seatCount;
	String covertiable;
	String rating;
	String engineType;

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public String getSeatCount() {
		return seatCount;
	}

	public void setSeatCount(String seatCount) {
		this.seatCount = seatCount;
	}

	public String getCovertiable() {
		return covertiable;
	}

	public void setCovertiable(String covertiable) {
		this.covertiable = covertiable;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

}
