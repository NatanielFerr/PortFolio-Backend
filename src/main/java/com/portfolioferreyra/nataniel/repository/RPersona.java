package com.portfolioferreyra.nataniel.repository;

import com.portfolioferreyra.nataniel.entity.Persona;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RPersona extends JpaRepository<Persona, Long>{
    public List<Persona> findByEmailAndContrasenia(String email, String contrasenia);
}