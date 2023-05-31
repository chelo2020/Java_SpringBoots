package com.Ejercicio1.EstudianteProgramacion.Service;


import com.Ejercicio1.EstudianteProgramacion.Model.Curso;
import com.Ejercicio1.EstudianteProgramacion.Model.Tema;
import com.Ejercicio1.EstudianteProgramacion.Repository.ITemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemaService implements ITemaService {

    @Autowired
    private ITemaRepository repoTema;

    @Override
    public List<Tema> getTema() {
        List<Tema> listaTema=repoTema.findAll();
        return listaTema;
    }

    @Override
    public void saveTema(Tema te) {
        repoTema.save(te);
    }

    @Override
    public void deleteTema(Long id) {
        repoTema.deleteById(id);
    }

    public Tema findTema(Long id) {
        Tema  te= repoTema.findById(id).orElse(null);
        return te;
    }

    @Override
    public void ediTema(Long idOriginal, Long idNueva, String nuevoNombre,
                        String nuevaDescripcion) {
        Tema te=this.findTema(idOriginal);

        te.setId(idNueva);
        te.setNombre(nuevoNombre);
        te.setDescripcion(nuevaDescripcion);

        this.saveTema(te);

    }

    @Override
    public void ediTema(Tema te) {
        this.saveTema(te);
    }
}
