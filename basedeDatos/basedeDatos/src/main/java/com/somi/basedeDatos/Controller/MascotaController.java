package com.somi.basedeDatos.Controller;

import com.somi.basedeDatos.Model.Mascota;
import com.somi.basedeDatos.Service.IMascotaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {

    @Autowired
    private IMascotaService mascoServ;
    @PostMapping("/mascotas/crear")
    public String saveMascota(@RequestBody Mascota masco){

        mascoServ.saveMascota(masco);

        return "La Mascota fue creada correctamente";
    }

}
