package com.edu.itlp.mx.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.edu.itlp.mx.models.Carrera;

public class CarreraRM implements RowMapper<Carrera>{

	@Override
	public Carrera mapRow(ResultSet rs, int rowNum) throws SQLException {
		Carrera carrera = new Carrera();
		
		carrera.setIdCarrera(rs.getInt("idCarrera"));
		carrera.setNombre(rs.getNString("nombre"));
		carrera.setClave(rs.getNString("clave"));
		carrera.setCreditos(rs.getInt("creditos"));
		return carrera;
	}
}
