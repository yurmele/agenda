package com.teamfive.model;

import javax.persistence.*;


@Entity
@Table(name = "direcciones")

public class Direcciones {
	
	@Id
	@GeneratedValue
	private int iddirecciones;
	private String direccion;
	private int codPostal;
	private String localidad;
	private int idPerson;
	
	public Direcciones(){
		
	}

	public Direcciones(int iddirecciones, String direccion, int codPostal, String localidad, int idPerson) {
		super();
		this.iddirecciones = iddirecciones;
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.localidad = localidad;
		this.idPerson = idPerson;
	}

	public int getIddirecciones() {
		return iddirecciones;
	}

	public void setIddirecciones(int iddirecciones) {
		this.iddirecciones = iddirecciones;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}

	@Override
	public String toString() {
		return "Direcciones [iddirecciones=" + iddirecciones + ", direccion=" + direccion + ", codPostal=" + codPostal
				+ ", localidad=" + localidad + ", idPerson=" + idPerson + "]";
	}
	
	

}
