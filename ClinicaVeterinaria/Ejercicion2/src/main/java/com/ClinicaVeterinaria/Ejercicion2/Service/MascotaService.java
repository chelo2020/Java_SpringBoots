package com.ClinicaVeterinaria.Ejercicion2.Service;


import com.ClinicaVeterinaria.Ejercicion2.Dto.mascotaDueñoDto;
import com.ClinicaVeterinaria.Ejercicion2.Model.Dueño;
import com.ClinicaVeterinaria.Ejercicion2.Model.Mascota;
import com.ClinicaVeterinaria.Ejercicion2.Repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    public IMascotaRepository mascotaRepo;

    @Override
    public List<Mascota> getMascota() {
        return mascotaRepo.findAll();
    }

    @Override
    public void saveMascota(Mascota ma) {
        mascotaRepo.save(ma);
    }

    @Override
    public void deleteMascota(Long id) {
        mascotaRepo.deleteById(id);
    }

    @Override
    public Mascota findMascota(Long id) {
        return mascotaRepo.findById(id).orElse(null);
    }

    @Override
    public void editMascota(Mascota ma) {
        this.saveMascota(ma);

    }

    @Override
    public List<Mascota> getCaniches() {
        List<Mascota>listMascotas=this.getMascota();
        List<Mascota>listCaniches=new ArrayList<Mascota>();
        for (Mascota ma:listMascotas){
            if (ma.getEspecie().equalsIgnoreCase("perro")&&
                    ma.getRaza().equalsIgnoreCase("caniche")){
                listCaniches.add(ma);
            }
        }
        return listCaniches;
    }


}
