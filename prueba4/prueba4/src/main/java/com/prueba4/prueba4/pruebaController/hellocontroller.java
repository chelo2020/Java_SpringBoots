
package com.prueba4.prueba4.pruebaController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class hellocontroller {
     
    @GetMapping("/Hello")// Los parametros siemrpe van entre llaves
    public String sayHello(@RequestParam String Nombre){
        return "HELLO WORD como esto es una prueba " + Nombre;
    }
        
    @GetMapping("/Bye")
    public String sayBye(@RequestParam String Nombre,@RequestParam int Edad,@RequestParam String Profesion){
        return "Hello me voy"+ "Mi nombre era: "+" "+Nombre+" "+"Mi edad es: "+" "+ Edad+" "+
                "Mi profesion es: "+" "+Profesion;
    }
}


