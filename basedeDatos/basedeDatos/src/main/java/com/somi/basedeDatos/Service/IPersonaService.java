package com.somi.basedeDatos.Service;

import com.somi.basedeDatos.Model.Persona;

import java.util.List;

public interface IPersonaService {

    // METODO PARA TRAER TODAS LAS PERSONAS

    public List<Persona> getPersona();

    //Metodo para alta de personas

    public void savePersona(Persona perso);

    // Baja

    public void deletePersona(Long id);

    // Metedo para una sola persona

    public Persona findPersona(Long id);

    // Para modificar

    public void ediPersona(Long idOriginal,Long idNueva,String nuevoNombre,
                           String nuevoApellido,int nuevaEdad);


    void ediPersona(Persona perso);
}
