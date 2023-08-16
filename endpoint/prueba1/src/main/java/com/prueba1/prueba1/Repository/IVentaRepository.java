package com.prueba1.prueba1.Repository;

import com.prueba1.prueba1.Model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVentaRepository extends JpaRepository<Venta,Long> {
}
