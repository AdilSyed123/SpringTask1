package com.Hot_Desking_app.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Building {
	@Id
	private int buildingid;
	private boolean isactive;
	private String buildingname;
	private int officeid;
	public int getBuildingid() {
		return buildingid;
	}
	public void setBuildingid(int buildingid) {
		this.buildingid = buildingid;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public String getBuildingname() {
		return buildingname;
	}
	public void setBuildingname(String buildingname) {
		this.buildingname = buildingname;
	}
	public int getOfficeid() {
		return officeid;
	}
	public void setOffice(int officeid) {
		this.officeid = officeid;
	}
	

}
