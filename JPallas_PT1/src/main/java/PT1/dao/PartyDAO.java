/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package PT1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import PT1.dto.Party;

public interface PartyDAO extends JpaRepository<Party, Long> {

	public List<Party> findPartiesByGameTitle(String game);

}
