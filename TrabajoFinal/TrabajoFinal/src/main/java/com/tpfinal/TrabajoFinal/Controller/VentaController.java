package com.tpfinal.TrabajoFinal.Controller;

import com.tpfinal.TrabajoFinal.Dto.MayorVentaDto;
import com.tpfinal.TrabajoFinal.Model.Venta;
import com.tpfinal.TrabajoFinal.Service.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class VentaController {

    @Autowired
    private IVentaService repoVen;

    @GetMapping("/ventas/traer")
    public List<Venta> traerVenta(){
         return repoVen.getVenta();
    }

    @PostMapping("/ventas/crear")
    public String saveVenta(@RequestBody Venta ven){
        repoVen.saveVenta(ven);
        return "La venta fue registrada con exito";
    }
    @DeleteMapping("/ventas/borrar/{id_venta}")
    public String deleteVenta(@PathVariable Long id_venta){
        repoVen.deleteVenta(id_venta);
        return "La venta fue eliminada con exito";
    }
    @GetMapping("/ventas/traer/{codigo_venta}")
    public List<Venta>traeProductos(@PathVariable Long codigo_venta){
        return repoVen.findVenta(codigo_venta);
    }
    @PutMapping("/ventas/editar")
    public String editVenta(@RequestBody Venta ve){
        repoVen.editVenta(ve);

        return "La venta fue modificada con exito";
    }
    @GetMapping("/ventas/{fecha_venta}")
    public String sumVentas(@RequestBody String fecha_venta){
        List<Venta>tventas=this.traerVenta();
        List<Venta>sumVenta=new ArrayList<Venta>();


        //Obtener la cantidad de ventas realizadas en la fecha que se ingrese
        int totalventas=0;
        for (Venta ve:tventas ) {
            //int totalventas1=0;
            if (ve.getCodigo_venta()!=0){
                totalventas=totalventas+1;
            }
            //System.out.println(totalventas1);
        }
        //Obtener el monto total realizadas en esa fecha seleccionada
        Double montovendido=0.0;
        for (Venta ves: tventas) {
            if (ves.getTotal()!=0){
                montovendido=montovendido+ves.getTotal();
            }
        }
        return "El monto vendido en esta fecha es: "+" "+totalventas+
                " "+"La cantidad de ventas que se realizaron en esta fecha es de"+
                " "+montovendido;
    }
    /*@GetMapping("/ventas/mayor_venta")
    public List<MayorVentaDto> mayorVentaObtenida(){

        return repoVen.getMayorVenta();

    }*/
}
