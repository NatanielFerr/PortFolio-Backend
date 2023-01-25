
package com.portfolioferreyra.nataniel.service;

import com.portfolioferreyra.nataniel.entity.Persona;
import com.portfolioferreyra.nataniel.repository.RPersona;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SPersona implements ISPersona {
    @Autowired
    RPersona rPersona;

    @Override
    public List<Persona> verPersonas() {
        List<Persona> listaPersonas = rPersona.findAll();
        return listaPersonas;
    }

    @Override
    public void crearPersona(Persona per) {
        rPersona.save(per);
    }

    @Override
    public void borrarPersona(Long id) {
        rPersona.deleteById(id);
    }

    @Override
    public Persona buscarPersona(Long id) {
        Persona perso = rPersona.findById(id).orElse(null);
        return perso;
    }
    
    @Override
     public Persona loginPersona(String email, String contrasenia) {
     List <Persona> personas = rPersona.findByEmailAndContrasenia(email, contrasenia);
     if(!personas.isEmpty()){
         return personas.get(0);
     }
     return null;
    }

    @Override
    public void editarPersona(Persona per) {
        rPersona.save(per);
    }
    
}
