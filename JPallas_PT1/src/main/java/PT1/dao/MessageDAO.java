/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package PT1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import PT1.dto.Message;

public interface MessageDAO extends JpaRepository<Message, Long> {

}
