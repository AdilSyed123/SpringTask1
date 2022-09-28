package com.Hot_Desking_app.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="City")
public class City {
    @Id
    private int cityid;
	
	private boolean isactive;
	private String cityname;
	private String country;
	private String pincode;
	private String statename;
	

	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	
}
