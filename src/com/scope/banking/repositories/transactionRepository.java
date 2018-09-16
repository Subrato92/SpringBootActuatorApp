package com.scope.banking.repositories;

import org.springframework.data.repository.CrudRepository;
import com.scope.banking.models.Transaction;

public interface transactionRepository extends CrudRepository<Transaction, Integer>{

}
