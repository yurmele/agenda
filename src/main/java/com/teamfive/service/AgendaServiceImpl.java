package com.teamfive.service;


import java.time.LocalDate;
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
	UserDAOImpl implPersonas;
	@Autowired
	CategoriaDAOImpl implCat;		
	@Autowired
	IDepartamentoDAO depardao;
	
	
	@Override
	public Iterable<Personas> listPersonas() {
		// TODO Auto-generated method stub
		return implPersonas.findAll();
	}
	public Iterable<Categorias> listCategoria() {
		return implCat.findAll();
	}
	
	@Override
	public Optional<Categorias> getCategoria(int idcategorias) {
		return implCat.findById(idcategorias);
	}
	
	@Override
	public Optional<Departamentos> getDepartamentos(int iddepartamento) {
		return depardao.findById(iddepartamento);
	}
	

	@Override
	public void saveCategoria(Categorias categorias) {
		implCat.save(categorias);

	}
	@Override
	public void saveDepartamento(Departamentos departamentos) {
		depardao.save(departamentos);

	}
	

	@Override
	public void deleteCategoria(int idcategorias) {
		implCat.deleteById(idcategorias);

	}
	@Override
	public void deleteDepartamento(int iddepartamento) {
		depardao.deleteById(iddepartamento);

	}
	@Override
	public void deletePersonas(int idpersonas) {
		implPersonas.deleteById(idpersonas);

	}
	

	
	@Override
	public Iterable<Departamentos> listDepartamentos() {
		// TODO Auto-generated method stub
		return depardao.findAll();
	}
	
	@Override
	public void savePerson(Personas per,int depar,int cate) {/// save person tambien deberia enviar desde control el departamento que
											/// recibio del combobox
		Empleados empl = generarEmpleado(depar,cate);
		per.setEmpleados(empl);
		implPersonas.save(per);

	}

	

	public Empleados generarEmpleado(int  depar,int cate) {
		LocalDate localDate = LocalDate.now();
		Empleados em = null;
		/*
		 * if(depar.getNombre()=="RRHH") {// agregar en departamento una columna mas de
		 * 1 a 5 para saber rango de sueldos }
		 */
		em = new Empleados("A231", 1500, localDate, depar, cate);

		return em;
	}
	@Override
	public  Optional<Personas> findbyIdPerson(int id) {
		// TODO Auto-generated method stub
		return implPersonas.findById(id);
	}


}
