/**
 * @author BasementHalfStackDev/Josep Maria Pallas Batalla
 */
package PT1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PT1.dao.UserDAO;
import PT1.dto.User;

@Service // Assign Service
public class UserService {

	// Load DAO
	@Autowired
	UserDAO userDAO;

	// CRUD functions
	public List<User> listUsers() {
		return userDAO.findAll();
	}

	public User saveUser(User user) {
		return userDAO.save(user);
	}

	public User userById(Long id) {
		return userDAO.findById(id).get();
	}

	public User updateUser(User user) {
		return userDAO.save(user);
	}

	public void deleteUser(Long id) {
		userDAO.deleteById(id);
	}

}
