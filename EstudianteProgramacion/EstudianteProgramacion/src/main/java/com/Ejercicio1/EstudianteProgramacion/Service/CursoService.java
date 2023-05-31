package com.Ejercicio1.EstudianteProgramacion.Service;

import com.Ejercicio1.EstudianteProgramacion.Dto.CursoTemaDto;
import com.Ejercicio1.EstudianteProgramacion.Model.Curso;
import com.Ejercicio1.EstudianteProgramacion.Repository.ICursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoService implements ICursoService{
    @Autowired
    private ICursoRepository repoCurso;

    @Override
    public List<Curso> getCurso() {
        List<Curso> listaCurso=repoCurso.findAll();
        return listaCurso;
    }

    @Override
    public void saveCurso(Curso cur) {
        repoCurso.save(cur);
    }


    @Override
    public void deleteCurso(Long id) {
        repoCurso.deleteById(id);
    }

    @Override
    public Curso findCurso(Long id) {
        Curso cur=repoCurso.findById(id).orElse(null);
        return cur;
    }

    @Override
    public void ediCurso(Long idOriginal, Long idNueva, String nuevoNombre,
                         String nuevaModalidad, String nuevaFechaFinalizacion) {
        Curso cur=this.findCurso(idOriginal);

        cur.setId(idNueva);
        cur.setNombre(nuevoNombre);
        cur.setModalidad(nuevaModalidad);
        cur.setFecha_finalizacion(nuevaFechaFinalizacion);

        this.saveCurso(cur);
    }

    @Override
    public void ediCurso(Curso cur) {
        this.saveCurso(cur);
    }

    @Override
    public CursoTemaDto temasPorCurso(Long id_curso) {
        CursoTemaDto curTemDto=new CursoTemaDto();
        Curso cur=this.findCurso(id_curso);
        curTemDto.setNombreCurso(cur.getNombre());
        curTemDto.setListaTemas(cur.getListaTemas());

        return curTemDto;
    }

    @Override
    public List<Curso> getCursosJava() {
        String palabra="Java";
        String compararTexto;

        List<Curso>listaCurso=this.getCurso();
        List<Curso>listaCursoJava=new ArrayList<Curso>();

        for (Curso cur:listaCurso){
            compararTexto=cur.getNombre();
            boolean contieneJava=compararTexto.contains(palabra);
            if (contieneJava==true){
                listaCursoJava.add(cur);
            }
        }


        return listaCursoJava;

    }
}
