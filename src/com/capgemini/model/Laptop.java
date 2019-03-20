package com.capgemini.model;

import java.util.Objects;

public class Laptop {

	private String companyName;
	private String companyModel;
	private String operatingSystem;
	private String laptopProcessor;

	public Laptop() {
		super();
	}

	public Laptop(String companyName, String companyModel, String operatingSystem, String laptopProcessor) {
		super();
		this.companyName = companyName;
		this.companyModel = companyModel;
		this.operatingSystem = operatingSystem;
		this.laptopProcessor = laptopProcessor;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyModel() {
		return companyModel;
	}

	public void setCompanyModel(String companyModel) {
		this.companyModel = companyModel;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getLaptopProcessor() {
		return laptopProcessor;
	}

	public void setLaptopProcessor(String laptopProcessor) {
		this.laptopProcessor = laptopProcessor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(companyName, companyModel);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (!(obj instanceof Laptop))
			return false;

		if (this == obj)
			return true;

		Laptop laptop = (Laptop) obj;

		if (this.companyName.equals(laptop.companyName) && this.companyModel.equals(laptop.companyModel))
			return true;
		return false;
	}

}
