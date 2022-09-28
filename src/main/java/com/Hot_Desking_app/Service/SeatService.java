package com.Hot_Desking_app.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hot_Desking_app.Dao.SeatDao;
 
import com.Hot_Desking_app.Entity.Seat;

@Service
public class SeatService {
	@Autowired
	SeatDao seatdao;
	
	public List<Seat> getAllSeat(int id){
		
List<Seat> seats = new ArrayList<Seat>(); 
		
		Iterable<Seat> s = seatdao.findAll();
		for(Seat ss: s) {
			if(ss.getFloorid()== id) {
				seats.add(ss);
			}
		
		}
		return seats;
		
	}
	

}
