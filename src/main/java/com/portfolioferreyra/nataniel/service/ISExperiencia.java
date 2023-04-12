
package com.portfolioferreyra.nataniel.service;

import com.portfolioferreyra.nataniel.entity.Experiencia;
import java.util.List;


public interface ISExperiencia {
    public List<Experiencia> verExperiencias();
    
    public void crearExperiencia(Experiencia exp);
    
    public void borrarExperiencia(int id);
    
    public Experiencia buscarExperiencia(int id);
    
    public void editarExperiencia(Experiencia exp);
}
