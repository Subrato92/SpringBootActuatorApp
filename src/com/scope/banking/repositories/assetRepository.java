package com.scope.banking.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.scope.banking.models.Scope_Asset;

public interface assetRepository extends CrudRepository<Scope_Asset, Integer>{

	//Customizing Query which JPA dosen't Have
	@Query("select a from Scope_Asset a where a.uName=:name")
	public Scope_Asset findByName(@Param("name") String name);
	
}
