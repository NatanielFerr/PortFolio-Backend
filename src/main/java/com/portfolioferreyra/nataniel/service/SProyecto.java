
package com.portfolioferreyra.nataniel.service;

import com.portfolioferreyra.nataniel.entity.Proyecto;
import com.portfolioferreyra.nataniel.repository.RProyecto;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto implements ISProyecto {
   @Autowired
    RProyecto rProyecto;

    @Override
    public List<Proyecto> verProyectos() {
        List<Proyecto> listaProyectos = rProyecto.findAll();
        return listaProyectos;
    }

    @Override
    public void crearProyecto(Proyecto pro) {
        rProyecto.save(pro);
    }

    @Override
    public void borrarProyecto(int id) {
        rProyecto.deleteById(id);

    }

    @Override
    public Proyecto buscarProyecto(int id) {
        Proyecto proye = rProyecto.findById(id).orElse(null);
        return proye;
    }

    @Override
    public void editarProyecto(Proyecto pro) {
        rProyecto.save(pro);
    }

    
    
}
