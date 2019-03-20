package com.capgemini.model;

import java.util.Objects;

public class School {

	private String schoolName;
	private String schoolCity;
	private String schoolDistrict;
	private long greatSchoolRanking;

	public School() {
		super();
	}

	public School(String schoolName, String schoolCity, String schoolDistrict, long greatSchoolRanking) {
		super();
		this.schoolName = schoolName;
		this.schoolCity = schoolCity;
		this.schoolDistrict = schoolDistrict;
		this.greatSchoolRanking = greatSchoolRanking;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolCity() {
		return schoolCity;
	}

	public void setSchoolCity(String schoolCity) {
		this.schoolCity = schoolCity;
	}

	public String getSchoolDistrict() {
		return schoolDistrict;
	}

	public void setSchoolDistrict(String schoolDistrict) {
		this.schoolDistrict = schoolDistrict;
	}

	public long getGreatSchoolRanking() {
		return greatSchoolRanking;
	}

	public void setGreatSchoolRanking(long greatSchoolRanking) {
		this.greatSchoolRanking = greatSchoolRanking;
	}

	@Override
	public int hashCode() {
		return Objects.hash(schoolName, schoolCity, schoolDistrict);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;

		if (this == obj)
			return true;

		if (!(obj instanceof School))
			return false;

		School school = (School) obj;

		if (this.schoolName.contentEquals(school.schoolName) && this.schoolCity.contentEquals(school.schoolCity)
				&& this.schoolDistrict.contentEquals(school.schoolDistrict))
			return true;
		return true;
	}

}
