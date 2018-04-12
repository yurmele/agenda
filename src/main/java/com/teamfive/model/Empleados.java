package com.teamfive.model;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empleados")
public class Empleados {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idempleados;
	private String codempleado;
	private int salario;
	private LocalDate  fechaalta;
	private int iddepartamento;
	private int idcategoria;


	public Empleados(){
		
	}

	public Empleados( String codEmpleado, int salario, LocalDate fechaAlta, int idDepartamento,
			int idCategoria) {
		super();
		this.codempleado = codEmpleado;
		this.salario = salario;
		this.fechaalta = fechaAlta;
		this.iddepartamento = idDepartamento;
		this.idcategoria = idCategoria;
	}

	public int getIdempleados() {
		return idempleados;
	}

	public void setIdempleados(int idempleados) {
		this.idempleados = idempleados;
	}

	public String getCodempleado() {
		return codempleado;
	}

	public void setCodempleado(String codempleado) {
		this.codempleado = codempleado;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public LocalDate getFechaalta() {
		return fechaalta;
	}

	public void setFechaalta(LocalDate fechaalta) {
		this.fechaalta = fechaalta;
	}

	public int getIddepartamento() {
		return iddepartamento;
	}

	public void setIddepartamento(int iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

	public int getIdcategoria() {
		return idcategoria;
	}

	public void setIdcategoria(int idcategoria) {
		this.idcategoria = idcategoria;
	}

	@Override
	public String toString() {
		return "Empleados [idempleados=" + idempleados + ", codempleado=" + codempleado + ", salario=" + salario
				+ ", fechaalta=" + fechaalta + ", iddepartamento=" + iddepartamento + ", idcategoria=" + idcategoria
				+ "]";
	}

	
	
	
	
}
