package com.prueba1.prueba1.Service;

import com.prueba1.prueba1.Model.Producto;

import java.util.List;

public interface IProductoService {

    //Metodo para traer todos los productos
    public List<Producto> getProducto();

    //Metodo para crear o cargar un producto nuevo
    public void saveProducto(Producto pro);

    //Metodo para borrar un producto en particular
    public void deleteProducto(Long codigo_producto);

    //Metodo para encontrar un solo producto en particular
    public List<Producto> findProducto(Long codigo_producto);

    //Metodo para modificar un producto en particular
    public void editProducto(Producto pro);
    //Metodo para modificar un producto en particular

}
