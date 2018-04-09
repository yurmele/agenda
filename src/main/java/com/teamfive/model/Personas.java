package com.teamfive.model;

import java.util.Date;
import java.sql.*;
import javax.persistence.*;

@Entity
@Table(name = "personas")

public class Personas {
	
	@Id
	@GeneratedValue
	private int idpersonas;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int dni;
	private Date fechaNacimiento;
	private int idEmpleado;
	
	public Personas(){
		
	}

	public Personas(int idpersonas, String nombre, String apellido1, String apellido2, int dni, Date fechaNacimiento,
			int idEmpleado) {
		super();
		this.idpersonas = idpersonas;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.idEmpleado = idEmpleado;
	}

	public int getIdpersonas() {
		return idpersonas;
	}

	public void setIdpersonas(int idpersonas) {
		this.idpersonas = idpersonas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	@Override
	public String toString() {
		return "Personas [idpersonas=" + idpersonas + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", dni=" + dni + ", fechaNacimiento=" + fechaNacimiento + ", idEmpleado=" + idEmpleado
				+ "]";
	}
	
	
	

}
