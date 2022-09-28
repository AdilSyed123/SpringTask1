package com.Hot_Desking_app.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
 

import com.Hot_Desking_app.Entity.SeatType;
@Component
public interface SeatTypeDao extends CrudRepository<SeatType, Integer> {

}
