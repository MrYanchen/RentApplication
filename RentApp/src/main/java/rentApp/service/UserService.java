package rentApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rentApp.domain.User;
import rentApp.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public void create(User user) {
		repository.save(user);
	}

	public User findByUsername(String username) {
		return repository.findByUsername(username);
	}

	public User findById(Long id) {
		return repository.findOne(id);
	}

	public void update(User user) {
		repository.save(user);
	}

	public void deleteUser(Long id) {
		repository.delete(id);
	}

}
