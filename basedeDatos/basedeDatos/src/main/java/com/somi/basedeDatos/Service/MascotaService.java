package com.somi.basedeDatos.Service;

import com.somi.basedeDatos.Model.Mascota;
import com.somi.basedeDatos.Model.Persona;
import com.somi.basedeDatos.Repository.IMascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository repoMasco;

    @Override
    public List<Mascota> getMascota() {
        List<Mascota> listaMascota= repoMasco.findAll();
        // Con Finall() puedo listar todas las personas de mi base de datos
        return listaMascota;
    }

    @Override
    public void saveMascota(Mascota masco) {
        repoMasco.save(masco);
        //repoPersona.save(perso);
    }
    @Override
    public void deleteMascota(Long id_macosta) {
        repoMasco.deleteById(id_macosta);
        //repoPersona.deleteById(id);
    }

    @Override
    public Mascota findMascota(Long id_macosta) {
        Mascota masco=repoMasco.findById(id_macosta).orElse(null);
        //Persona perso=repoPersona.findById(id).orElse(null);

        return masco;
    }

    @Override
    public void ediMascota(Long idOriginal, Long id_mascotaNueva, String nuevoNombre, String nuevaEspecie, String nuevaRaza, String nuevoColor) {
        Mascota masco=this.findMascota(idOriginal);
        //Persona perso = this.findPersona(idOriginal);

        masco.setId_mascota(id_mascotaNueva);
        masco.setNombre(nuevoNombre);
        masco.setEspecie(nuevaEspecie);
        masco.setRaza(nuevaRaza);
        masco.setColor(nuevoColor);


        // Guardamos los cambios con el metodo que creamos savePersona
        this.saveMascota(masco);
    }
}
