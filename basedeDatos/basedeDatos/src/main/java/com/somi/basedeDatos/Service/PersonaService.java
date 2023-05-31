package com.somi.basedeDatos.Service;

import com.somi.basedeDatos.Model.Persona;
import com.somi.basedeDatos.Repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService{
    @Autowired
    private IPersonaRepository repoPersona;


    @Override
    public List<Persona> getPersona() {
        List<Persona> listaPersona=repoPersona.findAll();
        // Con Finall() puedo listar todas las personas de mi base de datos
        return listaPersona;
    }

    @Override
    public void savePersona(Persona perso) {
            repoPersona.save(perso);
            //Con el save() con este metodo voy a guardar otra persona
    }

    @Override
    public void deletePersona(Long id) {
            repoPersona.deleteById(id);
            //Con este metodo puedo borrar a una persona en comun
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso=repoPersona.findById(id).orElse(null);
        // Usamos el metodo Findbyid() para buscar una sola persona y sino encuentra
        // para que no nos arroje un error agregamos orElse(null) para que nos devuelva
        // un null
        return perso;
    }

    @Override
    public void ediPersona(Long idOriginal, Long idNueva, String nuevoNombre, String nuevoApellido, int nuevaEdad) {
        // Primero busco el objeto origianl
        Persona perso = this.findPersona(idOriginal);

        perso.setId(idNueva);
        perso.setNombre(nuevoNombre);
        perso.setApellido(nuevoApellido);
        perso.setEdad(nuevaEdad);

        // Guardamos los cambios con el metodo que creamos savePersona
        this.savePersona(perso);


    }

    @Override
    public void ediPersona(Persona perso) {
        this.savePersona(perso);
    }
}


