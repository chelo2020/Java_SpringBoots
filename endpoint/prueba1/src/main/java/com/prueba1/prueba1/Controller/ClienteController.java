package com.prueba1.prueba1.Controller;

import com.prueba1.prueba1.Model.Cliente;
import com.prueba1.prueba1.Service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    private IClienteService repocliente;

    //Trae todos los clientes
    @GetMapping("/clientes/traer")
    public List<Cliente>traerClientes(){
        List<Cliente>clientes=repocliente.getCliente();

        return clientes;
    }
    //Carga un cliente en la base de datos
    @PostMapping("/clientes/crear")
    public String crearClientes(@RequestBody Cliente cli){
        repocliente.saveCliente(cli);
        return "El cliente fue creado con exito";
    }
    //Eliminamos un cliente pasando su ID
    @DeleteMapping("/clientes/eliminar/{id_cliente}")
    public String eliminarCliente(@PathVariable Long id_cliente) {

        repocliente.deleteCliente(id_cliente);

        return "El cliente fue elimnado con exito";
    }
    //Traemos un cliente en particular
    @GetMapping("/clientes/traer/{id_cliente}")
    public List<Cliente>uncliente(@PathVariable Long id_cliente){
        List<Cliente> cli=repocliente.unCliente(id_cliente);

        return cli;
    }
}
