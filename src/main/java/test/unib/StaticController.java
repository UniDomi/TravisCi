package test.unib;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class StaticController {
	
	@GetMapping
	public String showIndex() {
		return "index";
	}
}
