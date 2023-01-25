
package com.portfolioferreyra.nataniel.repository;

import com.portfolioferreyra.nataniel.entity.Proyecto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RProyecto extends JpaRepository<Proyecto, Integer> {
    List<Proyecto> findByPersonaId(Long personaId);
}
