package com.ClinicaVeterinaria.Ejercicion2.Service;

import com.ClinicaVeterinaria.Ejercicion2.Dto.mascotaDueñoDto;
import com.ClinicaVeterinaria.Ejercicion2.Model.Dueño;
import com.ClinicaVeterinaria.Ejercicion2.Repository.IDueñoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DueñoService implements IDueñoService{

    @Autowired
    private IDueñoRepository dueñoRepo;

    @Override
    public List<Dueño> getDueño() {
        return dueñoRepo.findAll();
    }

    @Override
    public void saveDueño(Dueño due) {
        dueñoRepo.save(due);
    }

    @Override
    public void deleteDueño(Long id) {
        dueñoRepo.deleteById(id);
    }

    @Override
    public Dueño findDueño(Long id) {

        return dueñoRepo.findById(id).orElse(null);
    }

    @Override
    public void editDueño(Dueño due) {
        this.saveDueño(due);
    }

    @Override
    public List<mascotaDueñoDto> getMascoDuenios() {
        List<Dueño>listdu=this.getDueño();
        List<mascotaDueñoDto> listmasdue=new ArrayList<mascotaDueñoDto>();
        mascotaDueñoDto madue=new mascotaDueñoDto();

        for (Dueño du:listdu){
            System.out.println(du.getNombre());
            madue.setNombre_Dueño(du.getUnamascota().getNombre());
            madue.setNombre_Mascota(du.getNombre());
            madue.setApellido_Dueño(du.getApellido());
            madue.getEspecie_Mascota(du.getUnamascota().getEspecie());
            madue.getRaza_Mascota(du.getUnamascota().getRaza());
            listmasdue.add(madue);
            madue=new mascotaDueñoDto();
        }
        return listmasdue;
    }
}
