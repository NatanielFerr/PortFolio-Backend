
package com.portfolioferreyra.nataniel.service;

import com.portfolioferreyra.nataniel.entity.Red;
import com.portfolioferreyra.nataniel.repository.RRed;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SRed implements ISRed {
   @Autowired
    RRed rRed;

    @Override
    public List<Red> verRedes() {
        List<Red> listaRedes = rRed.findAll();
        return listaRedes;
    }

    @Override
    public void crearRed(Red redes) {
        rRed.save(redes);
    }

    @Override
    public void borrarRed(int id) {
        rRed.deleteById(id);

    }

    @Override
    public Red buscarRed(int id) {
        Red rede = rRed.findById(id).orElse(null);
        return rede;
    }

    @Override
    public void editarRed(Red redes) {
        rRed.save(redes);
    }

    
    
}
