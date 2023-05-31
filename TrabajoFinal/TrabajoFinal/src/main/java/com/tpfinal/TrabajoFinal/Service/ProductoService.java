package com.tpfinal.TrabajoFinal.Service;

import com.tpfinal.TrabajoFinal.Repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {

    @Autowired
    private IProductoRepository repoProducto;
}
