
package com.portfolioferreyra.nataniel.service;

import com.portfolioferreyra.nataniel.entity.Educacion;
import com.portfolioferreyra.nataniel.repository.REducacion;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion implements ISEducacion {
    @Autowired
    REducacion rEducacion;

    @Override
    public List<Educacion> verEducaciones() {
        List<Educacion> listaEducaciones = rEducacion.findAll();
        return listaEducaciones;
    }

    @Override
    public void crearEducacion(Educacion educ) {
        rEducacion.save(educ);
    }

    @Override
    public void borrarEducacion(int id) {
        rEducacion.deleteById(id);
    }

    @Override
    public Educacion buscarEducacion(int id) {
        Educacion educa = rEducacion.findById(id).orElse(null);
        return educa;
    }

    @Override
    public void editarEducacion(Educacion educ) {
        rEducacion.save(educ);
    }
    
}
