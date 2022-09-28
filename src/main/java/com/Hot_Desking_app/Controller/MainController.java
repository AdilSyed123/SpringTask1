package com.Hot_Desking_app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.Hot_Desking_app.Entity.Building;
import com.Hot_Desking_app.Entity.City;
import com.Hot_Desking_app.Entity.Floor;
import com.Hot_Desking_app.Entity.Office;
import com.Hot_Desking_app.Entity.Seat;
import com.Hot_Desking_app.Service.BuildingService;
import com.Hot_Desking_app.Service.CityService;
import com.Hot_Desking_app.Service.FloorService;
import com.Hot_Desking_app.Service.OfficeService;
import com.Hot_Desking_app.Service.SeatService;

 

@RestController
public class MainController {
@Autowired
CityService cityservice	;
@GetMapping("/city/getAll")
public List<City> getAll(){
	return cityservice.getAllCities();
}

@Autowired
OfficeService off;


@GetMapping("/office/{cityId}")
public List<Office> getAllOffices(@PathVariable("cityId") int cityid ){
	return off.getAllOfficie(cityid);
}

@Autowired
BuildingService bui;

@GetMapping("/building/{officeId}")
public List<Building> getAllBuildings(@PathVariable("officeId") int officeid ){
	return bui.getAllBuilding(officeid);
}


@Autowired
FloorService fs;

@GetMapping("/floor/{buildingId}")
public List<Floor> getAllFloors(@PathVariable("buildingId") int buildingid)
{
	return fs.getAllFloor(buildingid);
	
}


@Autowired
SeatService ss;


@GetMapping("/seat/{floorId}")
public List<Seat> getAllSeats(@PathVariable("floorId") int floorid){
	
return ss.getAllSeat(floorid);




}










}
