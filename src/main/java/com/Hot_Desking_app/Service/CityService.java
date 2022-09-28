package com.Hot_Desking_app.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.Hot_Desking_app.Dao.CityDao;
import com.Hot_Desking_app.Entity.City;

@Service
@ComponentScan("com.Hot_Desking_app.Dao.CityDao")
public class CityService {
	
	@Autowired
	 CityDao citydao;
	
	//return all cities to controller class(Works as service class)
	public List<City> getAllCities(){
		List<City> cities = new ArrayList<City>();
		citydao.findAll().forEach( city->cities.add(city));
		return cities;
	}
	

}
