/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package PT1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import PT1.dto.Game;

public interface GameDAO extends JpaRepository<Game, Long> {

}
