package com.teamfive.model;

import javax.persistence.*;

@Entity
@Table(name = "categorias")

public class Categorias {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int idcategorias;
	private String nombre;
	private String descripcion;
	
	public Categorias(){
		
	}
	
	public Categorias(int idcategorias, String nombre , String descripcion){
		this.idcategorias=idcategorias;
		this.nombre=nombre;
		this.descripcion=descripcion;
	}
	
	public int getIdcategorias() {
		return idcategorias;
	}

	public void setIdcategorias(int idcategorias) {
		this.idcategorias = idcategorias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Categorias [idcategorias=" + idcategorias + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
	
	

}
