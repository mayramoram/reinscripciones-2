package com.edu.itlp.mx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.edu.itlp.mx.models.*;

@Repository
public class InscripcionesJDBC implements InscripcionesDAO{

	@Autowired
	JdbcTemplate conexion;
	
	String sql;
	
	@Override
	public Carrera buscarCarrera(int idCarrera) {
		sql= "SELECT * FROM Carreras where IdCarrera = ?";
		return conexion.queryForObject(sql, new CarreraRM(), idCarrera);
	}
	
	@Override
	public Alumno buscarAlumno(int idcarrera) {
		sql= "SELECT * FROM alumnos a "
	    + " JOIN carreras c ON c.IdCarrera = a.Carrera_id "
		+ " WHERE a.Carrera_id = ?";
		return conexion.queryForObject(sql, new AlumnoRM(), idcarrera);
	}
}
