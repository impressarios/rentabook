package Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {
	@RequestMapping("/welcome")
	public String welcomes()
	{
		return "WELCOME TO BOOK APP";
	}
	
}
