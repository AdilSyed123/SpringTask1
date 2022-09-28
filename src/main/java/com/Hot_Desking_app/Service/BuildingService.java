package com.Hot_Desking_app.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hot_Desking_app.Dao.BuildingDao;
 
import com.Hot_Desking_app.Entity.Building;
 
 
@Service
public class BuildingService {
	@Autowired
	 BuildingDao buildingdao;
	 
	
	public List<Building> getAllBuilding(int id){
		List<Building> buildings = new ArrayList<Building>(); 
		
		Iterable<Building> b = buildingdao.findAll();
		for(Building bb: b) {
			if(bb.getOfficeid()== id) {
				buildings.add(bb);
			}
		
		}
		return buildings;
	}


}
