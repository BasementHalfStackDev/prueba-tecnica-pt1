/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package PT1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PT1.dao.Party_MemberDAO;
import PT1.dto.Party_Member;

@Service // Assign Service
public class Party_MemberService {

	// Load DAO
	@Autowired
	Party_MemberDAO party_memberDAO;

	// CRUD functions
	public List<Party_Member> listParty_Members() {
		return party_memberDAO.findAll();
	}

	public List<Party_Member> listPartiesByUserId(Long userId) {
		return party_memberDAO.findPartiesByUserId(userId);
	}

	public List<Party_Member> listUsersByPartyId(Long partyId) {
		return party_memberDAO.findUsersByPartyId(partyId);
	}

	public Party_Member saveParty_Member(Party_Member party_member) {
		return party_memberDAO.save(party_member);
	}

	public Party_Member party_memberById(Long id) {
		return party_memberDAO.findById(id).get();
	}

	public void deleteParty_Member(Long id) {
		party_memberDAO.deleteById(id);
	}

}
