package com.br.zen.codechallange.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.zen.codechallange.domain.Peca;
import com.br.zen.codechallange.repositories.PecaRepository;

@Service
public class PecaService {

	@Autowired
	private PecaRepository pecaRepo;
	
	public Peca searchById(Integer id) {

		Optional<Peca> obj = pecaRepo.findById(id);
		
		return obj.orElse(null);
		
	}
}
