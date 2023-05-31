
package miprimerproyectoservice;

import java.util.List;
import miprimerproyectomodel.persona;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{

    @Override
    public void crearpersona(persona per) {
        //En esta seccion se pondria toda la logica de crear una persona
        System.out.println("Persona Creada");
    }

    @Override
    public List<persona> traerpersona() {
        // En esta seccion nos devolveria la lista de persona
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    //Aca en esta seccion van todos los metodos de logica de negocios
}
