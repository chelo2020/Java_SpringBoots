package com.ClinicaVeterinaria.Ejercicion2.Dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class mascotaDueñoDto {
    private String nombre_Mascota;
    private String especie_Mascota;
    private String raza_Mascota;

    private String nombre_Dueño;
    private String apellido_Dueño;

    public mascotaDueñoDto() {
    }

    public mascotaDueñoDto(String nombre_Mascota, String especie_Mascota, String raza_Mascota, String nombre_Dueño, String apellido_Dueño) {
        this.nombre_Mascota = nombre_Mascota;
        this.especie_Mascota = especie_Mascota;
        this.raza_Mascota = raza_Mascota;
        this.nombre_Dueño = nombre_Dueño;
        this.apellido_Dueño = apellido_Dueño;
    }

    public void getEspecie_Mascota(String especie) {
    }

    public void getRaza_Mascota(String raza) {
    }
}
