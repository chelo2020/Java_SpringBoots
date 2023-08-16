package com.prueba1.prueba1.Service;

import com.prueba1.prueba1.Model.Cliente;
import com.prueba1.prueba1.Repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ClienteService implements IClienteService{
    @Autowired
    public IClienteRepository repoCliente;

    @Override
    public List<Cliente> getCliente() {
        List<Cliente>clientes=repoCliente.findAll();
        return clientes;
    }

    @Override
    public void saveCliente(Cliente cli) {
        repoCliente.save(cli);

    }

    @Override
    public void deleteCliente(Long id_cliente) {
        repoCliente.deleteById(id_cliente);
    }

    @Override
    public List<Cliente> unCliente(Long id_cliente) {
        List<Cliente> cli=repoCliente.findAllById(Collections.singleton(id_cliente));
        return cli;
    }
    @Override
    public void editCliente(Cliente cli) {
        this.saveCliente(cli);
    }
}
