package com.prueba1.prueba1.Service;

import com.prueba1.prueba1.Model.Venta;
import com.prueba1.prueba1.Repository.IVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class VentaService implements IVentaService{

    @Autowired
    public IVentaRepository repoVenta;

    @Override
    public List<Venta> getVenta() {
        List<Venta> ven = repoVenta.findAll();
        return ven;
    }

    @Override
    public void saveVenta(Venta ven) {
        repoVenta.save(ven);
    }

    @Override
    public List<Venta> oneVenta(Long codigo_venta) {
        List<Venta>ven=repoVenta.findAllById(Collections.singleton(codigo_venta));
        return ven;
    }

    @Override
    public void deleteVenta(Long codigo_venta) {
        repoVenta.deleteById(codigo_venta);
    }

    @Override
    public void editVenta(Venta ven) {
        this.saveVenta(ven);
    }
}
