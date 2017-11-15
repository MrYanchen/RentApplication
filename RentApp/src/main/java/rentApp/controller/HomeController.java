package rentApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value = "/")
	public String home() {
		return "Welcome!";
	}

	@RequestMapping(value = "/login")
	public String login() {
		return "Login!";
	}

	@RequestMapping(value = "/logout")
	public String logout() {
		return "Welcome!";
	}

	@RequestMapping(value = "/signup")
	public String signup() {
		return "Welcome!";
	}

}
