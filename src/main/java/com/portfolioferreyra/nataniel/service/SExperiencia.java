
package com.portfolioferreyra.nataniel.service;

import com.portfolioferreyra.nataniel.entity.Experiencia;
import com.portfolioferreyra.nataniel.repository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SExperiencia implements ISExperiencia {
    @Autowired
    RExperiencia rExperiencia;

    @Override
    public List<Experiencia> verExperiencias() {
    List<Experiencia> listaExperiencias = rExperiencia.findAll();
        return listaExperiencias;
    }

    @Override
    public void crearExperiencia(Experiencia exp) {
        rExperiencia.save(exp);
    }

    @Override
    public void borrarExperiencia(int id) {
        rExperiencia.deleteById(id);
    }

    @Override
    public Experiencia buscarExperiencia(int id) {
        Experiencia exp = rExperiencia.findById(id).orElse(null);
        return exp;
    }

    @Override
    public void editarExperiencia(Experiencia exp) {
        rExperiencia.save(exp);
    }
}
