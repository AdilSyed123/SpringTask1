package com.Hot_Desking_app.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Hot_Desking_app.Dao.OfficeDao;
import com.Hot_Desking_app.Entity.Office;


@Service
public class OfficeService {
	@Autowired
	OfficeDao officedao;
	 
	
	public List<Office> getAllOfficie(int id){
		List<Office> officies = new ArrayList<Office>(); 
		
		Iterable<Office> o = officedao.findAll();
		for(Office oo: o) {
			if(oo.getCity()== id) {
				officies.add(oo);
			}
		
		}
		return officies;
	}


	
	
	

}
