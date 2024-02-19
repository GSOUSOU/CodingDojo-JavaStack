package com.codingdojo.dojoAndninjas.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.dojoAndninjas.Models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long>  {
	 // this method retrieves all the ninjas from the database
    List<Ninja> findAll();

}