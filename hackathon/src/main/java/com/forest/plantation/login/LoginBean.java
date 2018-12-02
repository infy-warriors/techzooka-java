package com.forest.plantation.login;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LoginBean {
	
	@Id
	private String username;
	private String password;
	private LoginUserType usertype;

	public LoginBean() {

	}

	public LoginBean(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public LoginBean(String username, String password, LoginUserType usertype) {
		super();
		this.username = username;
		this.password = password;
		this.usertype = usertype;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public LoginUserType getUsertype() {
		return usertype;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setUsertype(LoginUserType usertype) {
		this.usertype = usertype;
	}

}
