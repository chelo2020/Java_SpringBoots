package com.ClinicaVeterinaria.Ejercicion2.Repository;

import com.ClinicaVeterinaria.Ejercicion2.Model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMascotaRepository extends JpaRepository<Mascota,Long> {
}
