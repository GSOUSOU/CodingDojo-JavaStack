package com.codingdojo.dojoAndninjas.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojoAndninjas.Models.Ninja;
import com.codingdojo.dojoAndninjas.Repositories.NinjaRepository;

@Service
public class NinjaService {
	@Autowired 
	private NinjaRepository ninjaRepo;
	public List<Ninja> allNinjas() {
        return ninjaRepo.findAll();
    }
 // creates a ninja
    public Ninja createNinja(Ninja n) {
        return ninjaRepo.save(n);
    }
    // retrieves a ninja
    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalninja = ninjaRepo.findById(id);
        if(optionalninja.isPresent()) {
            return optionalninja.get();
        } else {
            return null;
        }
    }

}
