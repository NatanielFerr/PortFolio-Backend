
package com.portfolioferreyra.nataniel.service;

import com.portfolioferreyra.nataniel.entity.Educacion;
import java.util.List;

public interface ISEducacion {
     public List<Educacion> verEducaciones();
    
    public void crearEducacion(Educacion educ);
    
    public void borrarEducacion(int id);
    
    public Educacion buscarEducacion(int id);
    
    public void editarEducacion(Educacion educ);
}
