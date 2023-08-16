package com.prueba1.prueba1.Service;

import com.prueba1.prueba1.Model.Venta;

import java.util.List;

public interface IVentaService {

    //Metodo para traer todas las ventas

    public List<Venta>getVenta();
    //Metodo para crear una venta
    public void saveVenta(Venta ven);
    //Metodo para traer una venta en particular
    public List<Venta> oneVenta(Long codigo_venta);

    // Metodo para eliminar un venta
    public void deleteVenta(Long codigo_venta);

    //Metodo para editar una venta

    public void editVenta(Venta ven);
}
