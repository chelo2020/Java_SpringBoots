
package miprimerproyectomodel;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class persona {
    private Long id;
    private String nombre;
    private String apellido;

    public persona() {
    }

    public persona(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
}
