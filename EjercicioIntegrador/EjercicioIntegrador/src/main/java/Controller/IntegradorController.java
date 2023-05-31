/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IntegradorController {
     
    @GetMapping("/pasaje/{galones}")
    public String galonesLitros(@PathVariable double galones){
        
        //Convertimos los galones en litros
        double litros=galones*3.78541;
        return "La cantidad de galones es de: "+ " "+litros;
    }
}
