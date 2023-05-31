package com.Ejercicio1.EstudianteProgramacion.Dto;

import com.Ejercicio1.EstudianteProgramacion.Model.Tema;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class CursoTemaDto {

    private String nombreCurso;
    private List<Tema> listaTemas;

    public CursoTemaDto() {
    }

    public CursoTemaDto(String nombreCurso, List<Tema> listaTemas) {
        this.nombreCurso = nombreCurso;
        this.listaTemas = listaTemas;
    }

}
