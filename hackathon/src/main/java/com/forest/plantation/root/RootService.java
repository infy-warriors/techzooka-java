package com.forest.plantation.root;

import org.springframework.stereotype.Service;

@Service
public class RootService {
	
	public String getRootPage() {
		return "<center><H2>Hello Homosapien!</h2></center><br />"
				+ "<h3>Exposed APIs:</h3><br />"
				+ "Login<br />"
				+ "<ul>"
				+ "<li>/users: [GET] - lists all the user login details</li>"
				+ "<li>/login: [POST] - accepts login credentials and returns type of user, if user is valid</li>"
				+ "<li>/addusers: [GET] - adds 3 hard coded users to data repo (can be used while initialising app)</li>"
				+ "</ul>";
		
	}
	
}
