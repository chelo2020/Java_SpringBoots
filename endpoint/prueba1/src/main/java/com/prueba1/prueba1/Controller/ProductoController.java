package com.prueba1.prueba1.Controller;

import com.prueba1.prueba1.Model.Producto;
import com.prueba1.prueba1.Service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    private IProductoService repoProducto;

    @GetMapping("/productos/traer")
    public List<Producto>traerLista(){
        return repoProducto.getProducto();
    }
    @PostMapping("/productos/crear")
    public String craerProducto(@RequestBody Producto pro){
        repoProducto.saveProducto(pro);
        return "El producto fue creado con exito";
    }
    @GetMapping("productos/traer/{codigo_producto}")
    public List<Producto> crearUnProducto(@PathVariable Long codigo_producto){
        return repoProducto.findProducto(codigo_producto);
    }
    @DeleteMapping("/productos/borrar/{codigo_producto}")
    public  String borrarProducto(@PathVariable Long codigo_producto){
        repoProducto.deleteProducto(codigo_producto);

        return "El Producto fue eliminado con exito";
    }
    @PutMapping("/productos/editar")
    public String editarProducto(@RequestBody Producto pro){
        repoProducto.editProducto(pro);

        return "El producto fue actualizado con exito";
    }

}
