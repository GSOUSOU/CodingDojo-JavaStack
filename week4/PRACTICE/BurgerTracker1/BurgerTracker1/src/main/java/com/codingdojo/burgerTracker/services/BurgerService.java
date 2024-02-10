package com.codingdojo.burgerTracker.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.burgerTracker.models.Burger;
import com.codingdojo.burgerTracker.repositories.BurgerRepository;

@Service
public class BurgerService {
	// adding the burger repository as a dependency
	 private final BurgerRepository burgerRepository;
	 public BurgerService(BurgerRepository burgerRepository) {
	     this.burgerRepository = burgerRepository;
	 }
	 // returns all the books
	 public List<Burger> allBurgers() {
	     return burgerRepository.findAll();
	 }
	 public Burger addBurger(Burger burger) {
		 return burgerRepository.save(burger);
	 }

}
