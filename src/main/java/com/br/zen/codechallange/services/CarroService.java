package com.br.zen.codechallange.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.zen.codechallange.domain.Carro;
import com.br.zen.codechallange.repositories.CarroRepository;


@Service
public class CarroService {

	@Autowired
	private CarroRepository carroRepo;
	
	public Carro searchById(Integer id) {
		Optional<Carro> obj = carroRepo.findById(id);		
		return obj.orElse(null);		
	}
	
	public Carro insert(Carro obj) {
		obj.setId(null);
		return carroRepo.save(obj);
	}
}
