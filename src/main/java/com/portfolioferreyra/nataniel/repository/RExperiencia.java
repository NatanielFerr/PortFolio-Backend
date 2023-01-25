
package com.portfolioferreyra.nataniel.repository;

import com.portfolioferreyra.nataniel.entity.Experiencia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RExperiencia extends JpaRepository<Experiencia, Integer> {
    List<Experiencia> findByPersonaId(Long personaId);
}
