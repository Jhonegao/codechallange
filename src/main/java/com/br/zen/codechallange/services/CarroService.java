package com.br.zen.codechallange.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.br.zen.codechallange.DTO.CarroNewDTO;
import com.br.zen.codechallange.domain.Carro;
import com.br.zen.codechallange.repositories.CarroRepository;

@CrossOrigin
@Service
public class CarroService {

	@Autowired
	private CarroRepository carroRepo;

	public Carro searchById(Integer id) {
		Optional<Carro> obj = carroRepo.findById(id);
		return obj.orElse(null);
	}

	public List<Carro> findAll() {
		return carroRepo.findAll();
	}

	public Carro insert(Carro obj) {
		obj.setId(null);
		return carroRepo.save(obj);
	}

	public Carro fromDTO(CarroNewDTO objDTO) {
		return new Carro(objDTO.getId(), objDTO.getNome());
	}
}
