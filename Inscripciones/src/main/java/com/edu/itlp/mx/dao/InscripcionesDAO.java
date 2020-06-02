package com.edu.itlp.mx.dao;

import com.edu.itlp.mx.models.Alumno;
import com.edu.itlp.mx.models.Carrera;

public interface InscripcionesDAO {



public Alumno buscarAlumno(int idcarrera);

public Carrera buscarCarrera(int id_carrera);



}
