package rentApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import rentApp.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByUsername(String username);
}
