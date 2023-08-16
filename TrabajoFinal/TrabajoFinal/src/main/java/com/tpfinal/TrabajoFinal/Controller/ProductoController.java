package com.tpfinal.TrabajoFinal.Controller;

import com.tpfinal.TrabajoFinal.Model.Producto;
import com.tpfinal.TrabajoFinal.Service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private IProductoService repopro;

    //Traemos todos los productos de la base datos

    @GetMapping("/productos/traer")
    public List<Producto> traerProductos(){
        return repopro.getProducto();
    }
    //Creamos los productos en la base de datos

    @PostMapping("/productos/crear")
    public String crearProcuto(@RequestBody Producto pro){
        repopro.saveProducto(pro);
        return "El producto fue creado con exito";
    }
    // Traemos un producto desde la base de datos

    @GetMapping("/productos/traer/{id_producto}")
    public void traerProducto(@PathVariable Long id_producto){
        repopro.getProducto();
    }
    //Eliminamos un producto de la base de datos
    @DeleteMapping("productos/borar/{id_producto}")
    public String deleteProducto(@PathVariable Long id_producto){
        repopro.deleteProducto(id_producto);

        return "El producto fue eliminado con exito";
    }
    //Modificamos un dato del producto

    @PutMapping("/productos/editar")
    public String editProducto(@RequestBody Producto pro){
        repopro.editProducto(pro);
        return "El producto fue modificado con exito";
    }
    @GetMapping("/productos/falta_stock")
    public List<Producto> falta_stock(){

        return repopro.getCantidadDisponible();
    }


}
