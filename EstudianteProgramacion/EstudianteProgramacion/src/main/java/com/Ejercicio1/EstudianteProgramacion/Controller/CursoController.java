package com.Ejercicio1.EstudianteProgramacion.Controller;

import com.Ejercicio1.EstudianteProgramacion.Dto.CursoTemaDto;
import com.Ejercicio1.EstudianteProgramacion.Model.Curso;
import com.Ejercicio1.EstudianteProgramacion.Service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CursoController {

    @Autowired
    private ICursoService interCurso;

    @GetMapping("/cursos/traer")
    public List<Curso> getCurso(){

        return interCurso.getCurso();
    }
    @PostMapping("/cursos/crear")
    public String createCurso(@RequestBody Curso cur){

        interCurso.saveCurso(cur);
        return "El curso fue creado correctamente";
    }
    @DeleteMapping("/cursos/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        interCurso.deleteCurso(id);
        return "El curso fue eliminado correctamente";
    }
    @PutMapping("/cursos/editar")
    public Curso editCurso(@RequestBody Curso cur){
        interCurso.ediCurso(cur);
        return interCurso.findCurso(cur.getId());
    }
    //Obtener los temas de un determindado curso

    @GetMapping("/cursos/temas/{id}")
    public CursoTemaDto temasPorCurso(@PathVariable Long id){
        return interCurso.temasPorCurso(id);
    }
    //Obtener los cursos que son de Java

    @GetMapping("/cursos/java")
    public List<Curso> getCursosJava(){
        return interCurso.getCursosJava();
    }
}

