package com.forest.plantation.login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	@Autowired
	LoginService loginService;

	@RequestMapping(method = RequestMethod.POST, value = "/login")
	public LoginUserType login(@RequestBody LoginBean loginBean) {
		return loginService.getUserType(loginBean);
	}

	@RequestMapping("/addusers")
	public String addUsers() {
		loginService.addTempUsers();
		return "New Users Added!";
	}
	
	@RequestMapping("/users")
	public List<LoginBean> getAllUsers(){
		return loginService.getAllUsers();
	}

}
