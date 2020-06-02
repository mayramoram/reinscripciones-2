package com.edu.itlp.mx.models;

public class Carrera {
	
	int IdCarrera;
	String nombre;
	String clave;
	int Creditos;
	public Carrera() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Carrera(int idCarrera, String nombre, String clave, int creditos) {
		super();
		IdCarrera = idCarrera;
		this.nombre = nombre;
		this.clave = clave;
		Creditos = creditos;
	}
	public int getIdCarrera() {
		return IdCarrera;
	}
	public void setIdCarrera(int idCarrera) {
		IdCarrera = idCarrera;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public int getCreditos() {
		return Creditos;
	}
	public void setCreditos(int creditos) {
		Creditos = creditos;
	}
	
}