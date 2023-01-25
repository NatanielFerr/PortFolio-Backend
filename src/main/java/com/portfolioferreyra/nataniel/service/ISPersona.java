
package com.portfolioferreyra.nataniel.service;

import com.portfolioferreyra.nataniel.entity.Persona;
import java.util.List;

public interface ISPersona {
    public Persona loginPersona(String email, String contrasenia);
    
    public List<Persona> verPersonas();
    
    public void crearPersona(Persona per);
    
    public void borrarPersona(Long id);
    
    public Persona buscarPersona(Long id);
    
    public void editarPersona(Persona per);
}
