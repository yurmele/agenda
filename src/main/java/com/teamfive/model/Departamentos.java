package com.teamfive.model;


import javax.persistence.*;

@Entity
@Table(name = "departamentos")

public class Departamentos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int iddepartamento;
	private String nombre;
	public Departamentos(){
		
	}
	
	

	public Departamentos(int iddepartamento, String nombre) {
		super();
		this.iddepartamento = iddepartamento;
		this.nombre = nombre;
	}



	public int getIddepartamento() {
		return iddepartamento;
	}

	public void setIddepartamento(int iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Departamentos [iddepartamento=" + iddepartamento + ", nombre=" + nombre + "]";
	}
	
	

}
