package com.teamfive.service;

import com.teamfive.model.Categorias;
import com.teamfive.model.Personas;

public interface AgendaService {
	
	
	public Iterable<Personas> list();
	
	public Iterable<Categorias> listCategoria();
}
