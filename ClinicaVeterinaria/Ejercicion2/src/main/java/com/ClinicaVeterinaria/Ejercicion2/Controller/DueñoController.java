package com.ClinicaVeterinaria.Ejercicion2.Controller;

import com.ClinicaVeterinaria.Ejercicion2.Dto.mascotaDueñoDto;
import com.ClinicaVeterinaria.Ejercicion2.Model.Dueño;
import com.ClinicaVeterinaria.Ejercicion2.Service.IDueñoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DueñoController {

    @Autowired
    public IDueñoService repoDueño;

    //Crea un Dueño
    @PostMapping("/dueños/crear")
    public String creardueños(@RequestBody Dueño du){
        repoDueño.saveDueño(du);
        return "El dueño fue creado con exito";
    }
    //Obtengo todas las lista de los Dueños
    @GetMapping("/Dueños/trear")
    public List<Dueño> getDueño(){
        return repoDueño.getDueño();
    }
    //Obtengo un Dueño

    @GetMapping("/dueños/traer/{id}")
    public Dueño obtenerDueño(@PathVariable Long id){
        return  repoDueño.findDueño(id);
    }
    //Para Eliminar un Dueño
    @DeleteMapping("/dueños/borrar/{id}")
    public String deleteDueño(@PathVariable Long id){
        repoDueño.deleteDueño(id);
        return "El dueño fue eliminado con exito";
    }
    //Para modificar un Dueño

    @PutMapping("/dueños/editar")
    public Dueño editDueño(@RequestBody Dueño du){
        repoDueño.editDueño(du);
        return repoDueño.findDueño(du.getId());
    }
    @GetMapping("/dueño/traer-duenios")
    public List<mascotaDueñoDto> traerMascoDue(){
        return repoDueño.getMascoDuenios();
    }

}
