
package controller;

import com.practicon1.practicon1.Platos;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class practicoController {
   
    @PostMapping("/plato")
    public void crearPlato(@RequestBody Platos pla){
        
        
    }
    
    
    
}
