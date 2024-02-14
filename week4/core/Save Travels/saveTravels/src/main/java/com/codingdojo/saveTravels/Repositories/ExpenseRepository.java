package com.codingdojo.saveTravels.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.saveTravels.Models.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long> {
	 // this method retrieves all the expenses from the database
	 List<Expense> findAll();
	 Expense findById(long id);

}
