
package Controller;

import com.DTO1.DTO1.Inquilino;
import com.DTO1.DTO1.Propiedad;
import com.DTO1.DTO1.PropiedadDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class ControllerDTO {
    @GetMapping ("/propiedad/{id}")
    public PropiedadDTO DevolverPropiedad(@PathVariable long id){
        Propiedad prop=new Propiedad(13456,"casa","308 River",200.0,40000.0);
        Inquilino inqui=new Inquilino(1l,"123456","Walter","white","profesor de matematicas");
        
        PropiedadDTO propDTO=new PropiedadDTO();
        
        propDTO.setId_propiedad(prop.getId_propiedad());
        propDTO.setTipo_propiedad(prop.getTipo_propiedad());
        propDTO.setDireccion(prop.getDireccion());
        propDTO.setValor_alquiler(prop.getValor_alquiler());
        propDTO.setNombre(inqui.getNombre());
        propDTO.setApellido(inqui.getApellido());
        
        return propDTO;
    }
}
