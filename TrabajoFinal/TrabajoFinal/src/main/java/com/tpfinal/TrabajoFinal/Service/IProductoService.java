package com.tpfinal.TrabajoFinal.Service;

import com.tpfinal.TrabajoFinal.Model.Producto;

import java.util.List;

public interface IProductoService {

    //Metodo para traer todos los productos

    public List<Producto> getProducto();
    // Metodo para el alta de un producto

    public void saveProducto(Producto pro);

    //Metodo para dar de baja un producto

    public void deleteProducto(Long id_producto);

    //Metodo para traer un producto en particular.

    public Producto findProducto(Long id_producto);

    //Metodo para Actualizar o modificar un elemento en particular

    public void editProducto(Producto pro);

    public List<Producto> getCantidadDisponible();
}
