package com.prueba1.prueba1.Controller;

import com.prueba1.prueba1.Model.Venta;
import com.prueba1.prueba1.Service.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VentaController {

    @Autowired
    public IVentaService repoventa;

    @GetMapping("/ventas/traer")
    public List<Venta> venLista(){
        List<Venta> ven=repoventa.getVenta();
        return ven;
    }

}
