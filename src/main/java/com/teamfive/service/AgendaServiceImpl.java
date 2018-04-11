package com.teamfive.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.teamfive.dao.CategoriaDAOImpl;
import com.teamfive.dao.IDepartamentoDAO;
import com.teamfive.dao.UserDAOImpl;
import com.teamfive.model.Categorias;
import com.teamfive.model.Departamentos;
import com.teamfive.model.Empleados;
import com.teamfive.model.Personas;

@Service
@Transactional
public class AgendaServiceImpl implements AgendaService {

	
	@Autowired
	UserDAOImpl impl;
	@Autowired
	CategoriaDAOImpl implCat;	
	
	@Autowired
	IDepartamentoDAO depardao;
	
	
	public Iterable<Personas> list() {
		return impl.findAll();
	}
	
	public Iterable<Categorias> listCategoria() {
		return implCat.findAll();
	}
	
	@Override
	public Optional<Categorias> get(int idcategorias) {
		return implCat.findById(idcategorias);
	}

	@Override
	public void saveOrUpdate(Categorias categorias) {
		implCat.save(categorias);

	}

	@Override
	public void delete(int idcategorias) {
		implCat.deleteById(idcategorias);

	}

	@Override
	public void savePerson(Personas per) {///save person tambien deberia enviar desde control el departamento que recibio del combobox
		Empleados em=generarEmpleado(null);
		per.setEmpleados(em);
		em.setPersonas(per);
		
		impl.save(per);
		
	}
	
	@Override
	public Iterable<Departamentos> listDepartamentos() {
		// TODO Auto-generated method stub
		return depardao.findAll();
	}
	
	public Empleados generarEmpleado(Departamentos depar) {
		//Iterable<Departamentos> depars= listDepartamentos();
		Empleados em = null;
		
		/*
		if(depar.getNombre()=="RRHH") {// agregar en departamento una columna mas de 1 a 5 para saber rango de sueldos
		}*/
		em = new  Empleados("A231",1500,null,0,0);

		
		
		return em;
	}
}
