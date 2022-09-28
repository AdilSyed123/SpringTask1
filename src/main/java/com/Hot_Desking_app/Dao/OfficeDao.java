package com.Hot_Desking_app.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;

import com.Hot_Desking_app.Entity.Office;
@Component
public interface OfficeDao extends CrudRepository<Office, Integer> {

}
