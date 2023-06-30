package github.gmess.furrward.infrastructure.repositories;

import github.gmess.furrward.domain.vo.Breed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BreedRepository extends JpaRepository<Breed, Integer> {
}
