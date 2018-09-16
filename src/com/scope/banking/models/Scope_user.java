package com.scope.banking.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SCOPE_USER")
public class Scope_user {
	@Id
	@Column(name="U_Name", length=50)
	private String userName;

	@Column(name="Password", length=10, nullable=false)
	private String password;
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
	
}
