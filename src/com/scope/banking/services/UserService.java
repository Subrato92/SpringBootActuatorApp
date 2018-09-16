package com.scope.banking.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scope.banking.models.Scope_user;
import com.scope.banking.repositories.UsersRepository;

@Service
public class UserService {
	
	@Autowired
	private UsersRepository userRepo;
	private boolean status;
	private List<Scope_user> uLst; 
	
	public boolean addUser(Scope_user user){
		if( userRepo.save(user) != null )
			status = true;
		else
			status = false;
		
		return status;
	}
	
	public Scope_user findByName(String name){
		Scope_user usr = null;
		
		//usr = userRepo.findOne(name);
		usr = userRepo.findById(name).orElse(new Scope_user());
		
		return usr;
	}
	
	public boolean changePassword(Scope_user usr){
		
		if( userRepo.save(usr) != null )
			return true;
		else
			return false;
	}
	
	public List<Scope_user> getAllUsers(){
		
		uLst = new ArrayList<Scope_user>();
		userRepo.findAll().forEach(uLst::add);
		
		return uLst;
	}
	
	public Scope_user getUser(String name){
		Scope_user uObj = null;
		
		uObj = userRepo.findById(name).orElse(new Scope_user());
		
		return uObj;
	}
	
}
