
package com.portfolioferreyra.nataniel.service;
import com.portfolioferreyra.nataniel.entity.Cv;
import com.portfolioferreyra.nataniel.repository.RCv;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SCv implements ISCv {
    @Autowired
    RCv rCv;

    @Override
    public List<Cv> verCvs() {
        List<Cv> listaCvs = rCv.findAll();
        return listaCvs;
    }

    @Override
    public void crearCv(Cv cvs) {
        rCv.save(cvs);
    }

    @Override
    public void borrarCv(int id) {
        rCv.deleteById(id);
    }

    @Override
    public Cv buscarCv(int id) {
        Cv curriculum = rCv.findById(id).orElse(null);
        return curriculum;
    }

    @Override
    public void editarCv(Cv cvs) {
        rCv.save(cvs);
    }
    
}