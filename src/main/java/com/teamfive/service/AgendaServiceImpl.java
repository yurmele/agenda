package com.teamfive.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teamfive.dao.CategoriaDAOImpl;
import com.teamfive.dao.UserDAOImpl;
import com.teamfive.model.Categorias;
import com.teamfive.model.Personas;

@Service
@Transactional
public class AgendaServiceImpl implements AgendaService {

	
	@Autowired
	UserDAOImpl impl;
	@Autowired
	CategoriaDAOImpl implCat;
	
	
	
	public Iterable<Personas> list() {
		return impl.findAll();
	}
	
	public Iterable<Categorias> listCategoria() {
		return implCat.findAll();
	}
}
