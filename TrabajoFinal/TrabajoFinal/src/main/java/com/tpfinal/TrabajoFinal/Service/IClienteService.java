package com.tpfinal.TrabajoFinal.Service;

import com.tpfinal.TrabajoFinal.Model.Cliente;
import com.tpfinal.TrabajoFinal.Model.Producto;

import java.util.List;

public interface IClienteService {

    //Metodo para traer todos los clientes

    public List<Cliente> getCliente();
    // Metodo para el alta de un cliente

    public void saveCliente(Cliente cli);

    //Metodo para dar de baja un cliente

    public void deleteCliente(Long id_cliente);

    //Metodo para traer un cliente en particular.

    public Cliente findCliente(Long id_cliente);

    //Metodo para Actualizar o modificar un elemento en particular

    public void editCliente(Cliente cli);

    //Metodo para traer la cantidad de Stock



}
