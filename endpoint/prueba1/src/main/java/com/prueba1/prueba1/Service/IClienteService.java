package com.prueba1.prueba1.Service;

import com.prueba1.prueba1.Model.Cliente;

import java.util.List;

public interface IClienteService {

    //Metodo para traer todos los clientes
    public List<Cliente>getCliente();
    //Metodo para crear un cliente
    public void saveCliente(Cliente cli);
    //Metodo para borrar un cliente
    public void deleteCliente(Long id_cliente);
    //Metodo para traer un cliente en particular
    public List<Cliente>unCliente(Long id_cliente);
    //Metodo para actualizar un cliente
    public void editCliente(Cliente cli);

}
