
package com.portfolioferreyra.nataniel.repository;

import com.portfolioferreyra.nataniel.entity.Habilidad;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RHabilidad extends JpaRepository<Habilidad, Integer>{
    List<Habilidad> findByPersonaId(Long personaId);
}
