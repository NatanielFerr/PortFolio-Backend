
package com.portfolioferreyra.nataniel.repository;

import com.portfolioferreyra.nataniel.entity.Red;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RRed extends JpaRepository<Red, Integer> {
    List<Red> findByPersonaId(Long personaId);
}
