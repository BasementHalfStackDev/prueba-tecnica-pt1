/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package PT1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PT1.dao.GameDAO;
import PT1.dto.Game;

@Service // Assign Service
public class GameService {

	// Load DAO
	@Autowired
	GameDAO gameDAO;

	// CRUD functions
	public List<Game> listGames() {
		return gameDAO.findAll();
	}

	public Game saveGame(Game game) {
		return gameDAO.save(game);
	}

	public Game gameById(Long id) {
		return gameDAO.findById(id).get();
	}

	public Game updateGame(Game game) {
		return gameDAO.save(game);
	}

	public void deleteGame(Long id) {
		gameDAO.deleteById(id);
	}

}
