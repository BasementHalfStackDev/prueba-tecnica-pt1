/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package PT1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import PT1.dto.Message;

public interface MessageDAO extends JpaRepository<Message, Long> {

	public List<Message> findMessagesByPartyId(Long partyId);

}
