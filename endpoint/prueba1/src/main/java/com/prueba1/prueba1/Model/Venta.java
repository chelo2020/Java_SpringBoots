package com.prueba1.prueba1.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter @Setter
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long codigo_venta;
    private LocalDate fecha_venta;
    private Double total;
    @OneToMany
    List<Producto>listaproductos;
    @OneToOne
    @JoinColumn(name="uncliente_id_cliente", referencedColumnName = "id_cliente")
    private Cliente uncliente;

    public Venta() {
    }

    public Venta(Long codigo_venta, LocalDate fecha_venta, Double total, List<Producto> listaproductos, Cliente uncliente) {
        this.codigo_venta = codigo_venta;
        this.fecha_venta = fecha_venta;
        this.total = total;
        this.listaproductos = listaproductos;
        this.uncliente = uncliente;
    }
}
