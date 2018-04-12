package com.teamfive.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teamfive.model.Empleados;

public interface EmpleadoDAOImpl extends JpaRepository<Empleados,Long>{

}
