/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package PT1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import PT1.dto.Party_Member;

public interface Party_MemberDAO extends JpaRepository<Party_Member, Long> {

	public List<Party_Member> findPartiesByUserId(Long userId);

	public List<Party_Member> findUsersByPartyId(Long partyId);

}
