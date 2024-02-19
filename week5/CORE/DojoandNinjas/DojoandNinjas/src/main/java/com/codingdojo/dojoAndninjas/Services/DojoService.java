package com.codingdojo.dojoAndninjas.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojoAndninjas.Models.Dojo;
import com.codingdojo.dojoAndninjas.Repositories.DojoRepository;

@Service
public class DojoService {
	@Autowired 
	private DojoRepository dojoRepo;
	public List<Dojo> allDojos() {
        return dojoRepo.findAll();
    }
 // creates a dojo
    public Dojo createDojo(Dojo d) {
        return dojoRepo.save(d);
    }
    // retrieves a dojo
    public Dojo findDojo(Long id) {
        Optional<Dojo> optionaldojo = dojoRepo.findById(id);
        if(optionaldojo.isPresent()) {
            return optionaldojo.get();
        } else {
            return null;
        }
    }

}
