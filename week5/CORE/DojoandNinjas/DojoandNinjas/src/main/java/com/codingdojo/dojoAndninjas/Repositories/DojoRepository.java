package com.codingdojo.dojoAndninjas.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.dojoAndninjas.Models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long>  {
	 // this method retrieves all the dojos from the database
    List<Dojo> findAll();

}
