/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respository;

import Model.Posteo;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class PosteoRepository implements IPosteoRepository{

    @Override
    public List<Posteo> traerTodos() {
        List<Posteo> listarPosteos= new ArrayList<Posteo>();
        listarPosteos.add(new Posteo(1l,"Como formatear una PC","Juan Marcelo"));
        listarPosteos.add(new Posteo(2l,"Como formatear una PC","Juan Manuel"));
        
        return listarPosteos;
    }
    
}
