package com.somi.basedeDatos.Service;
import com.somi.basedeDatos.Model.Mascota;

import java.util.List;


public interface IMascotaService {

    // METODO PARA TRAER TODAS LAS PERSONAS

    public List<Mascota> getMascota();

    //Metodo para alta de personas

    public void saveMascota(Mascota masco);

    // Baja

    public void deleteMascota(Long id_macosta);

    // Metedo para una sola persona

    public Mascota findMascota(Long id_macosta);

    // Para modificar

    public void ediMascota(Long idOriginal,Long id_mascotaNueva,String nuevoNombre,
                           String nuevaEspecie,String nuevaRaza,String nuevoColor);



}
