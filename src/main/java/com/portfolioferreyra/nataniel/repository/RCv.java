
package com.portfolioferreyra.nataniel.repository;
import com.portfolioferreyra.nataniel.entity.Cv;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RCv extends JpaRepository<Cv, Integer>{
      List<Cv> findByPersonaId(Long personaId);
}
