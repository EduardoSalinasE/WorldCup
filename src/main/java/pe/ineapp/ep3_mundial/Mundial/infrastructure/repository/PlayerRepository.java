package pe.ineapp.ep3_mundial.Mundial.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.ineapp.ep3_mundial.Mundial.domain.entity.Player;

public interface PlayerRepository extends JpaRepository<Player,Long> {
}
