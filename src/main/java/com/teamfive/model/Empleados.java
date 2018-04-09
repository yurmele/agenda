package com.teamfive.model;

import java.util.Date;
import java.sql.*;
import javax.persistence.*;

@Entity
@Table(name = "empleados")



public class Empleados {
	
	@Id
	@GeneratedValue
	private int idempleados;
	private String codEmpleado;
	private int salario;
	private Date fechaAlta;
	private int idDepartamento;
	private int idCategoria;
	
	public Empleados(){
		
	}

	public Empleados(int idempleados, String codEmpleado, int salario, Date fechaAlta, int idDepartamento,
			int idCategoria) {
		super();
		this.idempleados = idempleados;
		this.codEmpleado = codEmpleado;
		this.salario = salario;
		this.fechaAlta = fechaAlta;
		this.idDepartamento = idDepartamento;
		this.idCategoria = idCategoria;
	}

	public int getIdempleados() {
		return idempleados;
	}

	public void setIdempleados(int idempleados) {
		this.idempleados = idempleados;
	}

	public String getCodEmpleado() {
		return codEmpleado;
	}

	public void setCodEmpleado(String codEmpleado) {
		this.codEmpleado = codEmpleado;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public int getIdDepartamento() {
		return idDepartamento;
	}

	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	@Override
	public String toString() {
		return "Empleados [idempleados=" + idempleados + ", codEmpleado=" + codEmpleado + ", salario=" + salario
				+ ", fechaAlta=" + fechaAlta + ", idDepartamento=" + idDepartamento + ", idCategoria=" + idCategoria
				+ "]";
	}
	
	
	
	
}
