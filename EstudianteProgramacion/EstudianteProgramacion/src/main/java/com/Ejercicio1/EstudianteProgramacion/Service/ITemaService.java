package com.Ejercicio1.EstudianteProgramacion.Service;

import com.Ejercicio1.EstudianteProgramacion.Model.Curso;
import com.Ejercicio1.EstudianteProgramacion.Model.Tema;

import java.util.List;

public interface ITemaService {

    //Metodo para crear todas las personas
    public List<Tema> getTema();

    // Metodo para dar de alta una persona
    public void saveTema(Tema te);

    // Metodo para borrar una persona
    public void deleteTema(Long id);

    // Metodo para encontrar una persona
    public Tema findTema(Long id);

    // Metodo para modificar los datos del curso

    public  void ediTema(Long idOriginal, Long idNueva, String nuevoNombre,
                          String nuevaDescripcion );


    void ediTema(Tema te);
}
