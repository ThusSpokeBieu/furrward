package github.gmess.furrward.infrastructure.repositories;

import github.gmess.furrward.domain.vo.Species;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpeciesRepository extends JpaRepository<Species, Byte> {
}
