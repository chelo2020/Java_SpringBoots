package com.Ejercicio1.EstudianteProgramacion.Repository;

import com.Ejercicio1.EstudianteProgramacion.Model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemaRepository extends JpaRepository<Tema,Long> {
}
