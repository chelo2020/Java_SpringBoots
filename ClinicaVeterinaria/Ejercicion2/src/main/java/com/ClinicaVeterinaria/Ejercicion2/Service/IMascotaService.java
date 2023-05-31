package com.ClinicaVeterinaria.Ejercicion2.Service;

import com.ClinicaVeterinaria.Ejercicion2.Dto.mascotaDueñoDto;

import com.ClinicaVeterinaria.Ejercicion2.Model.Mascota;


import java.util.List;


public interface IMascotaService {

    //Buscar todas las Mascotas:
    public List<Mascota> getMascota();
    //Guardar una Mascota:
    public void saveMascota(Mascota ma);
    //Eliminar una Mascota:
    public void deleteMascota(Long id);
    //Buscar una Mascota
    public Mascota findMascota(Long id);
    //Modificar una Mascota:
    public void editMascota(Mascota ma);
    //Listado para Traer Datos generales de las mascotas
    public List<Mascota> getCaniches();


}
