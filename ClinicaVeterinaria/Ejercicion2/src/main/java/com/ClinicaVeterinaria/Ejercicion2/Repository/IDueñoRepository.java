package com.ClinicaVeterinaria.Ejercicion2.Repository;

import com.ClinicaVeterinaria.Ejercicion2.Model.Dueño;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDueñoRepository extends JpaRepository<Dueño,Long> {
}
