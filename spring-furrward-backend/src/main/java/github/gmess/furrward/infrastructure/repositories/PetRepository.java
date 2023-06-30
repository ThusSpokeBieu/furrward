package github.gmess.furrward.infrastructure.repositories;

import github.gmess.furrward.domain.entities.Pet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PetRepository extends JpaRepository<Pet, UUID>, JpaSpecificationExecutor<Pet> {
}
