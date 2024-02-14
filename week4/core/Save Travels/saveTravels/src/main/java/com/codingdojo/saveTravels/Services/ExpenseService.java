package com.codingdojo.saveTravels.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.saveTravels.Models.Expense;
import com.codingdojo.saveTravels.Repositories.ExpenseRepository;

@Service
public class ExpenseService {
	// dependency injection
	@Autowired
	ExpenseRepository expenseRepository;
	 // returns all expenses
	public List<Expense> allExpenses(){
		return expenseRepository.findAll();
		
	}

	// create an expense
    public Expense addExpense(Expense expense) {
	 return expenseRepository.save(expense);
    }

    // retrieves an Expense
    public Expense findExpense(Long id) {
    Optional<Expense> optionalExpense = expenseRepository.findById(id);
    if(optionalExpense .isPresent()) {
        return optionalExpense.get();
    } else {
        return null;
    }
}
 // update an expense
    public Expense updateExpense(Expense expense) {
	 return expenseRepository.save(expense);
    }
  //
    public void deleteExpense(Expense expense) {
		expenseRepository.delete(expense);
	}

}
