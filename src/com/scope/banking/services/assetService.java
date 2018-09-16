package com.scope.banking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scope.banking.models.Scope_Asset;
import com.scope.banking.repositories.assetRepository;

@Service
public class assetService {
	
	@Autowired
	private assetRepository assetRepo;
	
	public boolean addAsset(Scope_Asset asset){
		
		if( assetRepo.save(asset) != null )
			return true;
		
		return false;
	}
	
	public Scope_Asset findAsset(String userName){
		Scope_Asset asset = null;
		asset = assetRepo.findByName(userName);
		return asset;
	}
	
	public Scope_Asset getAsset(Integer id){
		Scope_Asset asset = null;
		asset = assetRepo.findById(id).orElse(new Scope_Asset());
		return asset;
	}
	
}
