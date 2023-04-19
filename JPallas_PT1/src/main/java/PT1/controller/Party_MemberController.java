/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package PT1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import PT1.dto.Party_Member;
import PT1.service.Party_MemberService;

@RestController // Rest controller
@RequestMapping("/api")
public class Party_MemberController {

	// Implement service
	@Autowired
	Party_MemberService party_MemberService;

	// Get Mappings
	@GetMapping("/party_members")
	public List<Party_Member> listParty_Members() {
		return party_MemberService.listParty_Members();
	}

	@GetMapping("/party_members/{id}")
	public Party_Member party_MemberById(@PathVariable(name = "id") Long id) {
		Party_Member party_MemberxID = new Party_Member();

		party_MemberxID = party_MemberService.party_memberById(id);

		return party_MemberxID;
	}

	// Post Mappings
	@PostMapping("/party_members")
	public Party_Member saveParty_Member(@RequestBody Party_Member party_Member) {
		return party_MemberService.saveParty_Member(party_Member);
	}

	// Delete Mappings
	@DeleteMapping("/party_members/{id}")
	public void deleteParty_Member(@PathVariable(name = "id") Long id) {
		party_MemberService.deleteParty_Member(id);
	}

}
