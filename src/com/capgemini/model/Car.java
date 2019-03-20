package com.capgemini.model;

import java.util.Objects;

public class Car implements Comparable<Car> {

	private String carmake;
	private String carmodel;
	private long yearOfManunfactering;
	private long carPrice;

	public Car() {
		super();
	}

	public Car(String carmake, String carmodel, long yearOfManunfactering, long carPrice) {
		super();
		this.carmake = carmake;
		this.carmodel = carmodel;
		this.yearOfManunfactering = yearOfManunfactering;
		this.carPrice = carPrice;
	}

	public String getCarmake() {
		return carmake;
	}

	public void setCarmake(String carmake) {
		this.carmake = carmake;
	}

	public String getCarmodel() {
		return carmodel;
	}

	public void setCarmodel(String carmodel) {
		this.carmodel = carmodel;
	}

	public long getYearOfManunfactering() {
		return yearOfManunfactering;
	}

	public void setYearOfManunfactering(long yearOfManunfactering) {
		this.yearOfManunfactering = yearOfManunfactering;
	}

	public long getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(long carPrice) {
		this.carPrice = carPrice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(carmake, carmodel);
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return false;
		if (this == obj)
			return true;
		if (!(obj instanceof Car))
			return false;
		Car carobject = (Car) obj;

		if (carobject.carmake.equals(this.carmake) && carobject.carmodel.equals(this.carmodel))
			return true;
		return false;

	}

	@Override
	public int compareTo(Car obj) {
		
		int result=this.carmake.compareTo(obj.carmake);
		
		if(result<0) {
			return -1;
		}
		else if(result>0) {
				return 1;
		}
		else {
			return 0;
		}
	}

}
