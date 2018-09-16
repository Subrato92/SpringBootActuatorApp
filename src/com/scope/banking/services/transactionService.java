package com.scope.banking.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scope.banking.models.Scope_Asset;
import com.scope.banking.models.Scope_user;
import com.scope.banking.models.Transaction;
import com.scope.banking.repositories.transactionRepository;

@Service
public class transactionService {
	
	@Autowired
	private transactionRepository tranRepo;
	
	private assetService aService;
	private UserService uService;	
	
	public Transaction addTransaction(String buyer, String seller, Integer aId){
		Scope_Asset assetObj = null;
		Transaction tranObj = null;
		Scope_user bObj = null;
		Scope_user sObj = null;
		
		bObj = uService.getUser(buyer);
		sObj = uService.getUser(seller);
		assetObj = aService.getAsset(aId);
		
		tranObj = new Transaction();
		tranObj.setAsset(assetObj);
		tranObj.setBuyer(bObj);
		tranObj.setSeller(sObj);
		
		tranRepo.save(tranObj);
		
		return tranObj;
	}
}
