package com.teamfive.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "telefonos")

public class Telefonos {
	
	@Id
	@GeneratedValue
	private int idtelefonos;
	private int telefono;
	private int idPersona;
	
	
	public Telefonos() {
		super();
	}


	public Telefonos(int idtelefonos, int telefono, int idPersona) {
		super();
		this.idtelefonos = idtelefonos;
		this.telefono = telefono;
		this.idPersona = idPersona;
	}


	public int getIdtelefonos() {
		return idtelefonos;
	}


	public void setIdtelefonos(int idtelefonos) {
		this.idtelefonos = idtelefonos;
	}


	public int getTelefono() {
		return telefono;
	}


	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}


	public int getIdPersona() {
		return idPersona;
	}


	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}


	@Override
	public String toString() {
		return "Telefonos [idtelefonos=" + idtelefonos + ", telefono=" + telefono + ", idPersona=" + idPersona + "]";
	}
	
	
	
	

}
