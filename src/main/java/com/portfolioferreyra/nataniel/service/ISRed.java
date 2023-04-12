
package com.portfolioferreyra.nataniel.service;

import com.portfolioferreyra.nataniel.entity.Red;
import java.util.List;


public interface ISRed {
    public List<Red> verRedes();
    
    public void crearRed(Red redes);
    
    public void borrarRed(int id);
    
    public Red buscarRed(int id);
    
    public void editarRed(Red redes);
}
