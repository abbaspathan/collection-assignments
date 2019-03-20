package com.capgemini.model;

import java.util.Objects;

public class CellPhone {

	private String mobileCompanyName;
	private String mobileModel;
	private String mobileDescription;
	private String mobileOperatingSystem;
	private long mobilePrice;

	public CellPhone() {
		super();
	}

	public CellPhone(String mobileCompanyName, String mobileModel, String mobileDescription,
			String mobileOperatingSystem, long mobilePrice) {
		super();
		this.mobileCompanyName = mobileCompanyName;
		this.mobileModel = mobileModel;
		this.mobileDescription = mobileDescription;
		this.mobileOperatingSystem = mobileOperatingSystem;
		this.mobilePrice = mobilePrice;
	}

	public String getMobileCompanyName() {
		return mobileCompanyName;
	}

	public void setMobileCompanyName(String mobileCompanyName) {
		this.mobileCompanyName = mobileCompanyName;
	}

	public String getMobileModel() {
		return mobileModel;
	}

	public void setMobileModel(String mobileModel) {
		this.mobileModel = mobileModel;
	}

	public String getMobileDescription() {
		return mobileDescription;
	}

	public void setMobileDescription(String mobileDescription) {
		this.mobileDescription = mobileDescription;
	}

	public String getMobileOperatingSystem() {
		return mobileOperatingSystem;
	}

	public void setMobileOperatingSystem(String mobileOperatingSystem) {
		this.mobileOperatingSystem = mobileOperatingSystem;
	}

	public long getMobilePrice() {
		return mobilePrice;
	}

	public void setMobilePrice(long mobilePrice) {
		this.mobilePrice = mobilePrice;
	}

	@Override
	public int hashCode() {
		return Objects.hash(mobileCompanyName, mobileModel, mobileOperatingSystem);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof CellPhone))
			return false;

		CellPhone cellphone = (CellPhone) obj;

		if (cellphone.mobileCompanyName.equals(cellphone.mobileCompanyName)
				&& this.mobileModel.equals(cellphone.mobileModel)
				&& this.mobileOperatingSystem.equals(cellphone.mobileOperatingSystem))
			return true;
		return false;
	}

}
