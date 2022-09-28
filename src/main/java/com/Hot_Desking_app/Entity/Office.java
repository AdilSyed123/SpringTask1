package com.Hot_Desking_app.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Office {
	@Id
	private int officeid;
	private boolean isactive;
	private String officename;
	private int cityid;
	
	public int getOfficeid() {
		return officeid;
	}
	public void setOfficeid(int officeid) {
		this.officeid = officeid;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public String getOfficename() {
		return officename;
	}
	public void setOfficename(String officename) {
		this.officename = officename;
	}
	public int getCity() {
		return cityid;
	}
	public void setCity(int city) {
		this.cityid = city;
	}
	

}
