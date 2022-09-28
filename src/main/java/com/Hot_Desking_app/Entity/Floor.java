package com.Hot_Desking_app.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Floor {

@Id
private int floorid;
private boolean isactive;
private String floorname;
private String floorplan;
private int buildingid;


public int getFloorid() {
	return floorid;
}
public void setFloorid(int floorid) {
	this.floorid = floorid;
}
public boolean isIsactive() {
	return isactive;
}
public void setIsactive(boolean isactive) {
	this.isactive = isactive;
}
public String getFloorname() {
	return floorname;
}
public void setFloorname(String floorname) {
	this.floorname = floorname;
}
public String getFloorplan() {
	return floorplan;
}
public void setFloorplan(String floorplan) {
	this.floorplan = floorplan;
}
public int getBuildingid() {
	return buildingid;
}
public void setBuildingid(int buildingid) {
	this.buildingid = buildingid;
}



}
