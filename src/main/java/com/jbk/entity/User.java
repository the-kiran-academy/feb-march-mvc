package com.jbk.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@Column(unique = true,nullable = false)
	private String username;
	
	@Column(nullable = false)
	private String lastName;
	
	@Column(nullable = false)
	private String password;
	
	@Column(nullable = false)
	private String gender;
	
	@Column(unique = true,nullable = false)
	private String mail;
	
	@Column(unique = true,nullable = false)
	private String phone;
	
	@Column(nullable = false)
	private String question;
	
	@Column(nullable = false)
	private String answer;
	
	
	public User() {
		// TODO Auto-generated constructor stub
	}


	public User(String username, String lastName, String password, String gender, String mail, String phone,
			String question, String answer) {
		super();
		this.username = username;
		this.lastName = lastName;
		this.password = password;
		this.gender = gender;
		this.mail = mail;
		this.phone = phone;
		this.question = question;
		this.answer = answer;
	}


	

	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getLastName() {
		return lastName;
	}


	public String getPassword() {
		return password;
	}


	public String getGender() {
		return gender;
	}


	public String getMail() {
		return mail;
	}


	public String getPhone() {
		return phone;
	}


	public String getQuestion() {
		return question;
	}


	public String getAnswer() {
		return answer;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public void setAnswer(String answer) {
		this.answer = answer;
	}


	@Override
	public String toString() {
		return "User [firtName=" + username + ", lastName=" + lastName + ", password=" + password + ", gender=" + gender
				+ ", mail=" + mail + ", phone=" + phone + ", question=" + question + ", answer=" + answer + "]";
	}
	
	

}
