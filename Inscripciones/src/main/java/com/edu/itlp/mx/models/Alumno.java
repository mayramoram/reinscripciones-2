package com.edu.itlp.mx.models;

public class Alumno {
	
	int nocontrol;
	String nombre;
	String apellidoP;
	String apellidoM;
	String sexo;
	int carrera_id;
	int Semestre;
	String email;
	String password;
	public Alumno() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Alumno(int nocontrol, String nombre, String apellidoP, String apellidoM, String sexo, int carrera_id,
			int semestre, String email, String password) {
		super();
		this.nocontrol = nocontrol;
		this.nombre = nombre;
		this.apellidoP = apellidoP;
		this.apellidoM = apellidoM;
		this.sexo = sexo;
		this.carrera_id = carrera_id;
		Semestre = semestre;
		this.email = email;
		this.password = password;
	}
	public int getNocontrol() {
		return nocontrol;
	}
	public void setNocontrol(int nocontrol) {
		this.nocontrol = nocontrol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidoP() {
		return apellidoP;
	}
	public void setApellidoP(String apellidoP) {
		this.apellidoP = apellidoP;
	}
	public String getApellidoM() {
		return apellidoM;
	}
	public void setApellidoM(String apellidoM) {
		this.apellidoM = apellidoM;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getCarrera_id() {
		return carrera_id;
	}
	public void setCarrera_id(int carrera_id) {
		this.carrera_id = carrera_id;
	}
	public int getSemestre() {
		return Semestre;
	}
	public void setSemestre(int semestre) {
		Semestre = semestre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
