package com.somi.prueba11.Controller;

import com.somi.prueba11.Model.Cliente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @PostMapping("/cliente")
    public void nuevoCliente(@RequestBody Cliente cli){
        System.out.println("Datos del cliente: Nombre "+" "+ cli.getNombre()
        +" "+"Apellido: "+cli.getApellido());


    }
}
