package jp.shibadog.fdt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping(method = RequestMethod.GET, value = "/index")
	public String index(Model model) {
		return "login";
	}

	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public String login(Model model, @RequestParam(value="inputCardNo",required=true) String inputCardNo,
			@RequestParam(value="inputPassword",required=true) String inputPassword) {
		
		return "toppage";
	}
}
