package com.teamfive.service;

import java.util.Optional;

import com.teamfive.model.Categorias;
import com.teamfive.model.Departamentos;
import com.teamfive.model.Personas;

public interface AgendaService {
	
	
	public Iterable<Personas> list();
	
	public Iterable<Categorias> listCategoria();
	public Iterable<Departamentos> listDepartamentos();
	public void savePerson(Personas person);
	public Optional<Categorias> get(int idcategorias);
	
	public void saveOrUpdate(Categorias categorias);
	
	public void delete(int idcategorias);
}
