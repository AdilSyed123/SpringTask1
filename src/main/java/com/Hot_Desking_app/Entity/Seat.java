package com.Hot_Desking_app.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Seat {
	
@Id
private int seatid;
private boolean isactive;
private String cubicalposition;
private String qrnumber;
private int seatnumber;
private String seattype;
private int floorid;
private int seattypeid;
public int getSeatid() {
	return seatid;
}
public void setSeatid(int seatid) {
	this.seatid = seatid;
}
public boolean isIsactive() {
	return isactive;
}
public void setIsactive(boolean isactive) {
	this.isactive = isactive;
}
public String getCubicalposition() {
	return cubicalposition;
}
public void setCubicalposition(String cubicalposition) {
	this.cubicalposition = cubicalposition;
}
public String getQrnumber() {
	return qrnumber;
}
public void setQrnumber(String qrnumber) {
	this.qrnumber = qrnumber;
}
public int getSeatnumber() {
	return seatnumber;
}
public void setSeatnumber(int seatnumber) {
	this.seatnumber = seatnumber;
}
public String getSeattype() {
	return seattype;
}
public void setSeattype(String seattype) {
	this.seattype = seattype;
}
public int getFloorid() {
	return floorid;
}
public void setFloorid(int floorid) {
	this.floorid = floorid;
}
public int getSeattypeid() {
	return seattypeid;
}
public void setSeattypeid(int seattypeid) {
	this.seattypeid = seattypeid;
}


}
