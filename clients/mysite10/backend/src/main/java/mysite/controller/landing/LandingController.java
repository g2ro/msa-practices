package mysite.controller.landing;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LandingController {
	
	@GetMapping
	public String index() {
		return "index";
	}
	
    @GetMapping("favicon.ico")
    @ResponseBody
    void returnNoFavicon() {
    }	
}
