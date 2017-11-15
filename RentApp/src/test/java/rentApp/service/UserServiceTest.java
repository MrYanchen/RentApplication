package rentApp.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import rentApp.RentAppApplication;
import rentApp.domain.User;
import rentApp.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = RentAppApplication.class)
public class UserServiceTest {

	@Autowired
	UserService userService;

	@Autowired
	UserRepository userRepository;

	@Test
	public void createAndRetriveUserTest() {
		User user = new User("yanc", "1001", "1@gmail.com", "123");
		userService.create(user);
		User u = userService.findByUsername("yanc");
		assertEquals("User created and reterived", u.getEmail(), user.getEmail());
	}

	@Test
	public void uniqueUsernameTest() {
		User user1 = new User("yanc", "1002", "1@gmail.com", "123");
		userService.create(user1);
		User user2 = new User("yan", "1001", "1@gmail.com", "123");
		userService.create(user2);
	}

}
