/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import com.prueba5.prueba5.Cliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aplicacionController {
  @PostMapping("/cliente")
    public void crearCliente(@RequestBody Cliente cli){
        System.out.println("Cliente: creado");
        System.out.println("Cliente: "+cli.getNombre());
        System.out.println("Cliente: "+cli.getApellido());
    }
}
