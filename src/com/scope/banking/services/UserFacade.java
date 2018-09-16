package com.scope.banking.services;

import java.util.List;
import com.scope.banking.models.Scope_user;

public interface UserFacade {
	
	void addUser(Scope_user user);
	List<Scope_user> getAllUsers();
	Scope_user getUserByName(String name);
	boolean deleteUser(String name);
	Scope_user editUser(Scope_user user);
	
}
