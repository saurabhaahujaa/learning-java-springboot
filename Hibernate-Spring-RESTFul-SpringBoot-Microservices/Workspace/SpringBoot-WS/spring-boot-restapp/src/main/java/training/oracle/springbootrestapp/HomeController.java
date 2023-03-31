package training.oracle.springbootrestapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public String welcomeMessage() {
		return "Welcome to New Era Of Creating Spring Applications Using SB !";
	}
	
}
