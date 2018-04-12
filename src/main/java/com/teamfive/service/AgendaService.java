package com.teamfive.service;

import java.util.Optional;

import com.teamfive.model.Categorias;
import com.teamfive.model.Departamentos;
import com.teamfive.model.Personas;

public interface AgendaService {
	
	
	public Iterable<Personas> listPersonas();
	public Iterable<Categorias> listCategoria();
	public Iterable<Departamentos> listDepartamentos();
	
	public void savePerson(Personas perso,int idDepar,int iDcate);
	public void saveCategoria(Categorias categorias);
	public void saveDepartamento(Departamentos departamentos);

	public Optional<Categorias> getCategoria(int idcategorias);
	public Optional<Departamentos> getDepartamentos(int iddepartamento);
	
	public void deleteCategoria(int idcategorias);
	public void deleteDepartamento(int iddepartamento);
	public void deletePersonas(int idpersonas);
}
