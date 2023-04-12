
package com.portfolioferreyra.nataniel.service;

import com.portfolioferreyra.nataniel.entity.Habilidad;
import com.portfolioferreyra.nataniel.repository.RHabilidad;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHabilidad implements ISHabilidad {
    @Autowired
    RHabilidad rHabilidad;

     @Override
    public List<Habilidad> verHabilidades() {
      List<Habilidad> listaHabilidades = rHabilidad.findAll();
        return listaHabilidades;
    }

    @Override
    public Habilidad buscarHabilidad(int id) {
    Habilidad habi = rHabilidad.findById(id).orElse(null);
        return habi;
    }
        
    @Override
    public void crearHabilidad(Habilidad hab) {
        rHabilidad.save(hab);
    }
    
     @Override
    public void borrarHabilidad(int id) {
        rHabilidad.deleteById(id);
    }
    
    @Override
    public void editarHabilidad(Habilidad habi) {
        rHabilidad.save(habi);
    }

    
}
