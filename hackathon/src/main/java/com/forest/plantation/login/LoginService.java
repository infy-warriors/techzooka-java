package com.forest.plantation.login;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {

	@Autowired
	LoginRepository loginRepository;

	public LoginUserType getUserType(LoginBean loginBean) {
		Optional<LoginBean> loginDetail = loginRepository.findById(loginBean.getUsername());
		return loginDetail.get().getUsertype();

	}

	public void addTempUsers() {
		List<LoginBean> listOfUsers = Arrays.asList(new LoginBean("admin", "admin", LoginUserType.ADMIN_USER),
				new LoginBean("user1", "user1", LoginUserType.END_USER),
				new LoginBean("user2", "user2", LoginUserType.END_USER));
		for (LoginBean login : listOfUsers) {
			loginRepository.save(login);
		}
	}
	
	public List<LoginBean> getAllUsers(){
		List<LoginBean> listOfUsers = new ArrayList<>();
		loginRepository.findAll().forEach(listOfUsers :: add);
		return listOfUsers;
	}

}
