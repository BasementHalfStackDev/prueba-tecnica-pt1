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

import PT1.dto.Game;
import PT1.service.GameService;

@RestController // Rest controller
@RequestMapping("/api")
public class GameController {

	// Implement service
	@Autowired
	GameService gameService;

	// Get Mappings
	@GetMapping("/games")
	public List<Game> listGames() {
		return gameService.listGames();
	}

	@GetMapping("/games/{id}")
	public Game gameById(@PathVariable(name = "id") Long id) {
		Game gamexID = new Game();

		gamexID = gameService.gameById(id);

		return gamexID;
	}

	// Post Mappings
	@PostMapping("/games")
	public Game saveGame(@RequestBody Game game) {
		return gameService.saveGame(game);
	}

	// Put Mappings
	@PutMapping("/games/{id}")
	public Game updateGame(@PathVariable(name = "id") Long id, @RequestBody Game game) {
		Game selectedGame = new Game(id, game.getTitle(), game.getDescription(), game.getPlaytime());
		Game updatedGame = new Game();

		updatedGame = gameService.updateGame(selectedGame);
		return updatedGame;
	}

	// Delete Mappings
	@DeleteMapping("/games/{id}")
	public void deleteGame(@PathVariable(name = "id") Long id) {
		gameService.deleteGame(id);
	}

}
