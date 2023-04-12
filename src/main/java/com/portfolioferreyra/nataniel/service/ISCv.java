
package com.portfolioferreyra.nataniel.service;

import com.portfolioferreyra.nataniel.entity.Cv;
import java.util.List;

public interface ISCv {
     public List<Cv> verCvs();
    
    public void crearCv(Cv cvs);
    
    public void borrarCv(int id);
    
    public Cv buscarCv(int id);
    
    public void editarCv(Cv cvs);
}

