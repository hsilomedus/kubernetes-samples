package mk.hsilomedus.kube.controller;

import javax.servlet.http.HttpSession;

import mk.hsilomedus.kube.model.User;
import mk.hsilomedus.kube.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	private UserRepository userRepository;

	@RequestMapping(path="login", method=RequestMethod.GET)
	public String logIn(ModelMap map) {
		map.addAttribute("user", new User());
		return "login";
	}
	
	@RequestMapping(path="login", method=RequestMethod.POST)
	public String doLogIn(@ModelAttribute User user, HttpSession httpSession, ModelMap map) {
		if (user != null && user.getName() != null) {
			User foundUser = userRepository.findByName(user.getName());
			if (foundUser!= null && foundUser.getPassword().equals(user.getPassword())) {
				httpSession.setAttribute("loggeduserid", foundUser.getId());
				return "success";
			}
		}
		
		
		return "forbidden";
	}
}
