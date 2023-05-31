package com.somi.basedeDatos.Controller;

import com.somi.basedeDatos.Model.Persona;
import com.somi.basedeDatos.Service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {
    @Autowired
    private IPersonaService persoServ;
    @GetMapping("/personas/traer")
    public List<Persona> getPersonas(){

        return persoServ.getPersona();
    }
    @PostMapping("/personas/crear")
    public String savePersona(@RequestBody Persona perso){
        persoServ.savePersona(perso);
        return "La persona se creo correctamente";
    }
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable long id){
        persoServ.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    // endpoint para modificar la persona

    /*
    @PutMapping("/personas/editar/{idOriginal}")
    public Persona editPersona(@PathVariable Long idOriginal,
                               @RequestParam(required = false, name="id")Long nuevaId,
                               @RequestParam(required = false, name= "nombre")String nuevoNombre,
                               @RequestParam(required = false,name= "apellido")String nuevoApellido,
                               @RequestParam(required = false,name= "edad")int nuevaEdad){

            persoServ.ediPersona(idOriginal,nuevaId,nuevoNombre,nuevoApellido,nuevaEdad);
            Persona perso= persoServ.findPersona(nuevaId);

            return perso;

    }
    */
    @PutMapping("/personas/editar")
    public Persona editPersona(@RequestBody Persona perso){
        persoServ.ediPersona(perso);

        return persoServ.findPersona(perso.getId());
    }






}
