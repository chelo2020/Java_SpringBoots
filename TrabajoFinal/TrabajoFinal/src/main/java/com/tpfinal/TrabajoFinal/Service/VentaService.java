package com.tpfinal.TrabajoFinal.Service;

import com.tpfinal.TrabajoFinal.Repository.IVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService {

    @Autowired
    private IVentaRepository repoVenta;
}
