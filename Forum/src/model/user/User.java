package model.user;

import java.io.Serializable;

public class User implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String name;
	private String surname;
	private String password;
	private String roll;
	private String email;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String username, String name, String surname, String password, String roll, String email) {
		super();
		this.username = username;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.roll = roll;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", name=" + name + ", surname=" + surname + ", password=" + password
				+ ", roll=" + roll + ", email=" + email + "]";
	}
	
	
	
	

}
