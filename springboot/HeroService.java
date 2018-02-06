package com.example.demo;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class HeroService {
	
	@Autowired
	private HeroRepository heroRepository;
	
	
	public List<Hero> getAllheroes(){
		List<Hero> heroes = new ArrayList<>(Arrays.asList(
				new Hero(11,"Mr. Nice"),
				new Hero(12,"Rishi"),
				new Hero(13,"Bombasto"),
				new Hero(14,"Celeritas"),
				new Hero(15,"Magneta")
				));
		heroes.forEach(hero->{
			heroRepository.save(hero);
		});
		ArrayList<Hero> list= new ArrayList<Hero>(); 
		heroRepository.findAll().forEach(hero->list.add(hero));
		return list;
	}

	public Hero getHero(int id) {
		return heroRepository.findOne(id);
		//return heroes.stream().filter(t -> t.getId()==id).findFirst().get();
	}
	
	public boolean updateHero(int id, String name) {
		return true;
	}
}

