package com.Ejercicio1.EstudianteProgramacion.Controller;

import com.Ejercicio1.EstudianteProgramacion.Model.Curso;
import com.Ejercicio1.EstudianteProgramacion.Model.Tema;
import com.Ejercicio1.EstudianteProgramacion.Service.ICursoService;
import com.Ejercicio1.EstudianteProgramacion.Service.ITemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TemaController {

    @Autowired
    private ITemaService repoTema;

    @GetMapping("/temas/traer")
    public List<Tema> getTema(){

        return repoTema.getTema();
    }
    @PostMapping("/temas/crear")
    public String createTema(@RequestBody Tema te){

        repoTema.saveTema(te);
        return "El Tema fue creado correctamente";
    }
    @DeleteMapping("/temas/borrar/{id}")
    public String deleteTema(@PathVariable Long id){
        repoTema.deleteTema(id);
        return "El Tema fue eliminado correctamente";
    }
    @PutMapping("/tema/editar")
    public Tema editTema(@RequestBody Tema te){
        repoTema.ediTema(te);
        return repoTema.findTema(te.getId());
    }

}
