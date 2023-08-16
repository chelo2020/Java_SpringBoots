package com.tpfinal.TrabajoFinal.Service;

import com.tpfinal.TrabajoFinal.Dto.MayorVentaDto;
import com.tpfinal.TrabajoFinal.Model.Cliente;
import com.tpfinal.TrabajoFinal.Model.Producto;
import com.tpfinal.TrabajoFinal.Model.Venta;
import com.tpfinal.TrabajoFinal.Repository.IVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class VentaService implements IVentaService{

    @Autowired
    private IVentaRepository repoVenta;

    @Override
    public List<Venta> getVenta() {
        List<Venta> listaVentas=repoVenta.findAll();
        return listaVentas;
    }

    @Override
    public void saveVenta(Venta ven) {
        repoVenta.save(ven);
    }

    @Override
    public void deleteVenta(Long id_venta) {
        repoVenta.deleteById(id_venta);
    }

    @Override
    public List<Venta>findVenta(Long codigo_venta) {
        List<Venta> listaProductos=repoVenta.findAllById(Collections.singleton(codigo_venta));
        return listaProductos;

    }

    @Override
    public void editVenta(Venta ven) {
        this.saveVenta(ven);
    }

    @Override
    public void getSuma(String fecha_venta) {
        repoVenta.findAll();
    }
    @Override
    public List<MayorVentaDto> getMayorVenta() {
        List<Venta>listaventas=this.getVenta();
        List<MayorVentaDto>mayorventa=new ArrayList<MayorVentaDto>();
        MayorVentaDto mayor=new MayorVentaDto();

        for (Venta ven:listaventas) {
            mayor.setCodigo_venta(ven.getCodigo_venta());
            mayor.setTotal_venta(ven.getTotal());
            mayor.setNombre_cliente_venta(ven.getUnCliente().getNombre());
            mayor.setApellido_cliente_venta(ven.getUnCliente().getApellido());
            mayorventa.add(mayor);
            mayor=new MayorVentaDto();
            int cantidad=0;
            for (Producto prod:listaventas) {
                if (prod.getCantidad_disponible()!=0){
                    cantidad=cantidad+1;
                    System.out.println(cantidad);
                }
            }
            //mayor.setCantidad_producto_venta(ven.getCantidad_disponible(cantidad));
        }
        return mayorventa;

    }



}
