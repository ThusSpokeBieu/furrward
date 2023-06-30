package github.gmess.furrward.infrastructure.repositories;

import github.gmess.furrward.domain.vo.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository extends JpaRepository<Color, Byte> {
}
