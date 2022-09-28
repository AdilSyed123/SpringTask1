package com.Hot_Desking_app.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SeatType {
@Id
private int seattypeid;
private String seatcode;
private int seatname;
public int getSeattypeid() {
	return seattypeid;
}
public void setSeattypeid(int seattypeid) {
	this.seattypeid = seattypeid;
}
public String getSeatcode() {
	return seatcode;
}
public void setSeatcode(String seatcode) {
	this.seatcode = seatcode;
}
public int getSeatname() {
	return seatname;
}
public void setSeatname(int seatname) {
	this.seatname = seatname;
}

	
	
}
