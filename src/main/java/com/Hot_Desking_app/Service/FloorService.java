package com.Hot_Desking_app.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hot_Desking_app.Dao.FloorDao;
 
import com.Hot_Desking_app.Entity.Floor;


@Service
public class FloorService {

@Autowired
FloorDao floordao;

public List<Floor> getAllFloor(int id){
	List<Floor> floors = new ArrayList<Floor>(); 
	
	Iterable<Floor> f = floordao.findAll();
	for(Floor ff: f) {
		if(ff.getBuildingid()== id) {
			floors.add(ff);
		}
	
	}
	return floors;
}
}
	

