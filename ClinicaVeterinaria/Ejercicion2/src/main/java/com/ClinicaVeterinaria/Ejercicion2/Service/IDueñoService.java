package com.ClinicaVeterinaria.Ejercicion2.Service;

import com.ClinicaVeterinaria.Ejercicion2.Dto.mascotaDueñoDto;
import com.ClinicaVeterinaria.Ejercicion2.Model.Dueño;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IDueñoService {

    //Buscar todos los dueños:
    public List<Dueño> getDueño();
    //Guardar un dueño:
    public void saveDueño(Dueño due);
    //Eliminar un Dueño:
    public void deleteDueño(Long id);
    //Buscar un Dueño
    public Dueño findDueño(Long id);
    //Modificar un Dueño:
    public void editDueño(Dueño due);

    //Listado para el DTO
    public List<mascotaDueñoDto> getMascoDuenios();

}
