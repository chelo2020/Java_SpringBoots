package com.ClinicaVeterinaria.Ejercicion2.Controller;

import com.ClinicaVeterinaria.Ejercicion2.Model.Mascota;
import com.ClinicaVeterinaria.Ejercicion2.Service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MascotaController {

    @Autowired
    public IMascotaService repoMasco;

    //Crea la mascota
    @PostMapping("/mascotas/crear")
    public String crearMascotas(@RequestBody Mascota ma){
        repoMasco.saveMascota(ma);
        return "La mascota fue creada con exito";
    }
    //Obtengo todas las lista de moscotas
    @GetMapping("/mascotas/traer")
    public List<Mascota> getMascota(){
         return repoMasco.getMascota();
    }
    //Obtengo una Mascota

    @GetMapping("/mascotas/traer/{id}")
    public Mascota obtenerMascota(@PathVariable Long id){
        return  repoMasco.findMascota(id);
    }
    //Para Eliminar una Mascota
    @DeleteMapping("/mascotas/borrar/{id}")
    public String eliminarMascota(@PathVariable Long id){
        repoMasco.deleteMascota(id);
        return "La mascota fue eliminada con exito";
    }
    //Para modificar una mascota

    @PutMapping("/mascotas/editar")
    public Mascota editMascota(@RequestBody Mascota ma){
        repoMasco.editMascota(ma);
        return repoMasco.findMascota(ma.getId_mascota());
    }
    // Traer Caniches
    @GetMapping("/mascotas/traer-caniches")
    public List<Mascota> traerCaniches(){
        return repoMasco.getCaniches();
    }

}
