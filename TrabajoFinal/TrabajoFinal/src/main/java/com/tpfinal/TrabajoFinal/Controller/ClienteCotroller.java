package com.tpfinal.TrabajoFinal.Controller;

import com.tpfinal.TrabajoFinal.Model.Cliente;
import com.tpfinal.TrabajoFinal.Service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteCotroller {

    @Autowired
    private IClienteService repocli;

    //Traigo todos los clientes de la base de datos
    @GetMapping("/clientes/traer")
    public List<Cliente> traerCliente(){
        return repocli.getCliente();

    }
    //Cargo los cliente en la base de datos
    @PostMapping("/clientes/crear")
    public String saveCliente(@RequestBody Cliente cli){
        repocli.saveCliente(cli);
        return "El cliente fue creado con exito";
    }
    //Elimino un cliente de la base de datos

    @DeleteMapping("/clientes/borrar/{id_cliente}")
    public String deleteCliente(@PathVariable Long id_cliente){
        repocli.deleteCliente(id_cliente);
        return"El cliente fue borrado con exito";
    }

    //Traigo de la base de datos un cliente en particular
    @GetMapping("/clientes/traer/{id_cliente}")
    public Cliente traerCliente(@PathVariable Long id_cliente){
        return repocli.findCliente(id_cliente);
    }
    //Editamos o modificamos las datos de un cliente en la base de datos

    @PutMapping("/clientes/editar")
    public String editCliente(@RequestBody Cliente cli){
        repocli.editCliente(cli);

        return "Los Datos del cliente fueron modificados con exitos";
    }
}
