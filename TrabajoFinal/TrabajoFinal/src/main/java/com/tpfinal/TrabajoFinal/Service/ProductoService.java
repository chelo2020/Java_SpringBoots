package com.tpfinal.TrabajoFinal.Service;

import com.tpfinal.TrabajoFinal.Model.Producto;
import com.tpfinal.TrabajoFinal.Repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService implements  IProductoService{

    @Autowired
    private IProductoRepository repoProducto;

    @Override
    public List<Producto> getProducto() {
        List<Producto> listaProductos=repoProducto.findAll();
        return listaProductos;
    }

    @Override
    public void saveProducto(Producto pro) {
        repoProducto.save(pro);
    }

    @Override
    public void deleteProducto(Long id_producto) {
        repoProducto.deleteById(id_producto);
    }

    @Override
    public Producto findProducto(Long id_producto) {
        return repoProducto.findById(id_producto).orElse(null);

    }

    @Override
    public void editProducto(Producto pro) {
        this.saveProducto(pro);
    }

    @Override
    public List<Producto> getCantidadDisponible() {
        List<Producto> listaProductos= this.getProducto();
        List<Producto> Cantidad_Stock=new ArrayList<Producto>();
        for (Producto pro:listaProductos) {

            if (pro.getCantidad_disponible()<=5){
                Cantidad_Stock.add(pro);
            }
        }
        return Cantidad_Stock;

    }
}
