package com.capgemini.model;

import java.util.Objects;

public class Television {

	private String televisionCompany;
	private String televisionType;
	private boolean television3denabled;
	private long televisionPrice;

	public Television() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Television(String televisionCompany, String televisionType, boolean television3denabled,
			long televisionPrice) {
		super();
		this.televisionCompany = televisionCompany;
		this.televisionType = televisionType;
		this.television3denabled = television3denabled;
		this.televisionPrice = televisionPrice;
	}

	public String getTelevisionCompany() {
		return televisionCompany;
	}

	public void setTelevisionCompany(String televisionCompany) {
		this.televisionCompany = televisionCompany;
	}

	public String getTelevisionType() {
		return televisionType;
	}

	public void setTelevisionType(String televisionType) {
		this.televisionType = televisionType;
	}

	public boolean isTelevision3denabled() {
		return television3denabled;
	}

	public void setTelevision3denabled(boolean television3denabled) {
		this.television3denabled = television3denabled;
	}

	public long getTelevisionPrice() {
		return televisionPrice;
	}

	public void setTelevisionPrice(long televisionPrice) {
		this.televisionPrice = televisionPrice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(televisionCompany,televisionType,televisionPrice);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(!(obj instanceof Television))
			return false;
		
		Television television=(Television) obj;
		
		if((television.televisionPrice==this.televisionPrice) && television.televisionCompany.equals(this.televisionCompany) && this.televisionType.equals(television.televisionType) )
			return true;
		return false;
		
	}

}
