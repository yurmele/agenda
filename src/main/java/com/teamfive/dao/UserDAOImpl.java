package com.teamfive.dao;

import org.springframework.data.repository.CrudRepository;

import com.teamfive.model.Personas;



public interface UserDAOImpl extends CrudRepository<Personas, Integer> {
	
	
}