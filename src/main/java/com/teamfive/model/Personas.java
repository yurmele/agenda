package com.teamfive.model;

import java.util.Date;
import java.sql.*;
import javax.persistence.*;

@Entity
@Table(name = "personas")
public class Personas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idpersonas;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private int dni;
	private Date fechanacimiento;

	@OneToOne(fetch=FetchType.EAGER, cascade = {CascadeType.ALL})
	@JoinColumn(name = "idempleado")
	private Empleados empleados;

	public Empleados getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Empleados empleados) {
		this.empleados = empleados;
	}

	public Personas() {

	}

	public Personas(int idpersonas, String nombre, String apellido1, String apellido2, int dni, Date fechanacimiento) {
		super();
		this.idpersonas = idpersonas;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechanacimiento = fechanacimiento;
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

	public Date getFechanacimiento() {
		return fechanacimiento;
	}

	public void setFechanacimiento(Date fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}

	@Override
	public String toString() {
		return "Personas [idpersonas=" + idpersonas + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", dni=" + dni + ", fechanacimiento=" + fechanacimiento + "]";
	}

}
