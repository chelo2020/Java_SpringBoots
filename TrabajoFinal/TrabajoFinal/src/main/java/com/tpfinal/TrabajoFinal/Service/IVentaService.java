package com.tpfinal.TrabajoFinal.Service;

import com.tpfinal.TrabajoFinal.Dto.MayorVentaDto;
import com.tpfinal.TrabajoFinal.Model.Cliente;
import com.tpfinal.TrabajoFinal.Model.Producto;
import com.tpfinal.TrabajoFinal.Model.Venta;

import java.time.LocalDate;
import java.util.List;

public interface IVentaService {

    //Metodo para traer todos las ventas

    public List<Venta> getVenta();
    // Metodo para el alta de una Ventas

    public void saveVenta(Venta ven);

    //Metodo para dar de baja una venta

    public void deleteVenta(Long id_venta);

    //Metodo para traer una venta en particular.

    public List<Venta> findVenta(Long codigo_venta);

    //Metodo para Actualizar o modificar un elemento en particular

    public void editVenta(Venta ven);

    //Metodo para obtener sumatoria de ventas y cuantas ventas se hicieron en esa fecha

    public void getSuma(String fecha_venta);

    //Metodo para obtener la mayor_venta usando patron DTO

    public List<MayorVentaDto> getMayorVenta();



}
