package com.prueba1.prueba1.Service;

import com.prueba1.prueba1.Model.Producto;
import com.prueba1.prueba1.Repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class ProductoService implements IProductoService {
    @Autowired
    public IProductoRepository repoproducto;

    @Override
    public List<Producto> getProducto() {
        List<Producto>listaProductos=repoproducto.findAll();
        return listaProductos;
    }

    @Override
    public void saveProducto(Producto pro) {
        repoproducto.save(pro);

    }

    @Override
    public void deleteProducto(Long codigo_producto) {
        repoproducto.deleteById(codigo_producto);
    }

    @Override
    public List<Producto> findProducto(Long codigo_producto) {
        List<Producto> prod=repoproducto.findAllById(Collections.singleton(codigo_producto));
        return prod;
    }

    @Override
    public void editProducto(Producto pro) {
        this.saveProducto(pro);
    }


}
