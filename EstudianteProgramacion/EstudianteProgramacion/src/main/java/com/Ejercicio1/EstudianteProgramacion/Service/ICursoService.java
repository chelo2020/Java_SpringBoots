package com.Ejercicio1.EstudianteProgramacion.Service;

import com.Ejercicio1.EstudianteProgramacion.Dto.CursoTemaDto;
import com.Ejercicio1.EstudianteProgramacion.Model.Curso;

import java.util.List;

public interface ICursoService {

    //Metodo para crear todas las personas
    public List<Curso> getCurso();

    // Metodo para dar de alta una persona
    public void saveCurso(Curso cur);

    // Metodo para borrar una persona
    public void deleteCurso(Long id);

    // Metodo para encontrar una persona
    public Curso findCurso(Long id);

    // Metodo para modificar los datos del curso

    public  void ediCurso(Long idOriginal, Long idNueva, String nuevoNombre,
                          String nuevaModalidad, String nuevaFechaFinalizacion
                          );


    void ediCurso(Curso cur);

    // Metodo para traer  temas de un determindado curso
    public CursoTemaDto temasPorCurso(Long id_curso);
    public List<Curso> getCursosJava();
}
