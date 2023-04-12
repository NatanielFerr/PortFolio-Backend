
package com.portfolioferreyra.nataniel.service;

import com.portfolioferreyra.nataniel.entity.Habilidad;
import java.util.List;


public interface ISHabilidad {
    
    public List<Habilidad> verHabilidades();
    
    public void crearHabilidad(Habilidad hab);
    
    public void borrarHabilidad(int id);
    
    public Habilidad buscarHabilidad(int id);
    
    public void editarHabilidad(Habilidad habi);
}
