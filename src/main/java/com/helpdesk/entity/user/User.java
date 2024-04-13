package com.helpdesk.entity.user;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false, unique = true)
	private String email;

	@Column(nullable = false)
	private String password;

	@Column(nullable = false, unique = true)
	private String userUniqueId = UUID.randomUUID().toString();

	private String designation;

	@Column(nullable = false)
	private LocalDateTime localDateTime = LocalDateTime.now();

	public User() {

	}

	public User(int userId, String name, String email, String password, String userUniqueId, String designation,
			LocalDateTime localDateTime) {
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
		this.userUniqueId = userUniqueId;
		this.designation = designation;
		this.localDateTime = localDateTime;
	}

	public User(String name, String email, String password, String userUniqueId, String designation,
			LocalDateTime localDateTime) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.userUniqueId = userUniqueId;
		this.designation = designation;
		this.localDateTime = localDateTime;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	public String getUserUniqueId() {
		return userUniqueId;
	}

	public void setUserUniqueId(String userUniqueId) {
		this.userUniqueId = userUniqueId;
	}

}
