
package com.portfolioferreyra.nataniel.service;

import com.portfolioferreyra.nataniel.entity.Proyecto;
import java.util.List;


public interface ISProyecto {
    public List<Proyecto> verProyectos();
    
    public void crearProyecto(Proyecto pro);
    
    public void borrarProyecto(int id);
    
    public Proyecto buscarProyecto(int id);
    
    public void editarProyecto(Proyecto pro);
}
