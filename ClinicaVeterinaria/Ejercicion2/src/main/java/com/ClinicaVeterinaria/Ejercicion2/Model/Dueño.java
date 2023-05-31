package com.ClinicaVeterinaria.Ejercicion2.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter  @Setter
@Entity
public class Dueño {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String dni;
    private String nombre;
    private String apellido;
    private String celular;

    @OneToOne
    @JoinColumn(name="id_mascota", referencedColumnName = "id_mascota")
    private Mascota unamascota;
    public Dueño() {
    }

    public Dueño(Long id, String dni, String nombre, String apellido, String celular, Mascota unamascota) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
        this.unamascota = unamascota;
    }
}
