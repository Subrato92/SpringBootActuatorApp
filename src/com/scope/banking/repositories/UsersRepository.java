package com.scope.banking.repositories;
import org.springframework.data.repository.CrudRepository;

import com.scope.banking.models.Scope_user;

//CRUD repository has all possible operations and 
public interface UsersRepository extends CrudRepository<Scope_user, String>{
	
}
