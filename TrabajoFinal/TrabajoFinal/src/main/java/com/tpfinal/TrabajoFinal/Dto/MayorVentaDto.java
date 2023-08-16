package com.tpfinal.TrabajoFinal.Dto;

import lombok.Getter;
import lombok.Setter;


@Getter @Setter
public class MayorVentaDto {
    private Long codigo_venta;
    private Double total_venta;
    private int cantidad_producto_venta;
    private String nombre_cliente_venta;
    private String apellido_cliente_venta;

    public MayorVentaDto() {
    }

    public MayorVentaDto(Long codigo_venta, Double total_venta, int cantidad_producto_venta, String nombre_cliente_venta, String apellido_cliente_venta) {
        this.codigo_venta = codigo_venta;
        this.total_venta = total_venta;
        this.cantidad_producto_venta = cantidad_producto_venta;
        this.nombre_cliente_venta = nombre_cliente_venta;
        this.apellido_cliente_venta = apellido_cliente_venta;
    }
}
