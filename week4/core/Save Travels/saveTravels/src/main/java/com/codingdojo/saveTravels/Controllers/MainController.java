package com.codingdojo.saveTravels.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.saveTravels.Models.Expense;
import com.codingdojo.saveTravels.Services.ExpenseService;

import jakarta.validation.Valid;

@Controller
public class MainController {
	@Autowired
	ExpenseService expenseService ;
	
	@RequestMapping("/expenses")
	public String index(@ModelAttribute("expense") Expense expense, Model model ) {
		 List <Expense> expenses = expenseService.allExpenses();
		 model.addAttribute("expenses",expenses);
		return "/Expenses/index.jsp";
	}
	
	 @PostMapping("/Expensesaction")
	    public String create(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
	        if (result.hasErrors()) {
	        	 List <Expense> expenses = expenseService.allExpenses();
	    		 model.addAttribute("expenses",expenses);
	    		return "/Expenses/index.jsp";
	        } else {
	        	expenseService.addExpense(expense);
	            return "redirect:/expenses";
	        }
	    }
	 
		@RequestMapping("/expenses/edit/{id}")
		public String edit(@PathVariable("id") Long id, Model model) {
			  System.out.println(id);
			  Expense expense = expenseService.findExpense(id);
		   
		        model.addAttribute("id",id);
		        model.addAttribute("expense", expense);
		        return "/Expenses/edit.jsp";
		    } 
		 @RequestMapping(value="/Expensesupdate/{id}", method=RequestMethod.PUT)
		    public String update(@Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		        if (result.hasErrors()) {
		            model.addAttribute("expense", expense);
		            return "/Expenses/edit.jsp";
		        } else {
		            expenseService.updateExpense(expense);
		            return "redirect:/expenses";
		        }
		    }
		 
		@RequestMapping("/expenses/{id}")
	public String show(Model model,@PathVariable("id") long id) {
		  Expense expense = expenseService.findExpense(id);
		model.addAttribute("expense", expense);
		
		return "/Expenses/show.jsp";
	}
			
		 @RequestMapping("/expenses/delete/{id}")
			public String deleteExpense(@PathVariable("id") Long id) {
				Expense expense = expenseService.findExpense(id);
				expenseService.deleteExpense(expense);
				return "redirect:/expenses";
			}
		  
}
