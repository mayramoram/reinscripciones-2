package com.edu.itlp.mx.dao;

import java.sql.SQLException;
import java.sql.ResultSet;
import org.springframework.jdbc.core.RowMapper;
import com.edu.itlp.mx.models.Alumno;

public class AlumnoRM implements RowMapper<Alumno>{

	@Override
	public Alumno mapRow(ResultSet rs, int rowNum)throws SQLException {
		Alumno alumno = new Alumno();
		alumno.setNocontrol(rs.getInt("nocontrol"));
		alumno.setNombre(rs.getString("nombre"));
		alumno.setApellidoP(rs.getNString("apellidoP"));
		alumno.setApellidoM(rs.getNString("apellidoM"));
		alumno.setSexo(rs.getNString("sexo"));
		alumno.setCarrera_id(rs.getInt("carrera_id"));
		alumno.setSemestre(rs.getInt("semestre"));
		alumno.setEmail(rs.getNString("email"));
		alumno.setPassword(rs.getNString("password"));
		return alumno;
	}
}
