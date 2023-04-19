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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import PT1.dto.Party;
import PT1.service.PartyService;

@RestController // Rest controller
@RequestMapping("/api")
public class PartyController {

	// Implement service
	@Autowired
	PartyService partyService;

	// Get Mappings
	@GetMapping("/parties")
	public List<Party> listParties() {
		return partyService.listParties();
	}

	@GetMapping("/parties/{gametitle}")
	public List<Party> listPartiesByGameTitle(@PathVariable(name = "gametitle") String gametitle) {
		return partyService.listPartiesByGameTitle(gametitle);
	}

	@GetMapping("/parties/{id}")
	public Party partyById(@PathVariable(name = "id") Long id) {
		Party partyxID = new Party();

		partyxID = partyService.partyById(id);

		return partyxID;
	}

	// Post Mappings
	@PostMapping("/parties")
	public Party saveParty(@RequestBody Party party) {
		return partyService.saveParty(party);
	}

	// Put Mappings
	@PutMapping("/parties/{id}")
	public Party updateParty(@PathVariable(name = "id") Long id, @RequestBody Party party) {
		Party selectedParty = new Party(id, party.getTitle(), party.getDescription(), party.getGame(),
				party.getCreated_by());
		Party updatedParty = new Party();

		updatedParty = partyService.updateParty(selectedParty);
		return updatedParty;
	}

	// Delete Mappings
	@DeleteMapping("/parties/{id}")
	public void deleteParty(@PathVariable(name = "id") Long id) {
		partyService.deleteParty(id);
	}

}
