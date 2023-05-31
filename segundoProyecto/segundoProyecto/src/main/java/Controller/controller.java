
package Controller;

import Model.Posteo;
import Respository.IPosteoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    
    @Autowired
    IPosteoRepository repo;
    
    @GetMapping("/posteos")
    public List<Posteo> traerTodos(){
        return repo.traerTodos();
    }
}
