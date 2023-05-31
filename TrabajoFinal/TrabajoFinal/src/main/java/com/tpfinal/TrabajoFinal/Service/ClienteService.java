package com.tpfinal.TrabajoFinal.Service;

import com.tpfinal.TrabajoFinal.Repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    private IClienteRepository repoCliente;
}
