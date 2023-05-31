package com.Ejercicio1.EstudianteProgramacion.Repository;

import com.Ejercicio1.EstudianteProgramacion.Model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICursoRepository extends JpaRepository<Curso,Long> {
}
