package com.br.zen.codechallange.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.zen.codechallange.DTO.PecaDTO;
import com.br.zen.codechallange.domain.Peca;
import com.br.zen.codechallange.repositories.PecaRepository;


import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class PecaService {

	@Autowired
	private PecaRepository pecaRepo;
	
	public Peca searchById(Integer id) throws ObjectNotFoundException 	{
		Optional<Peca> obj = pecaRepo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Não Cadastrado Id: " + id + ", Peca:" + Peca.class.getName()));		
	}
	
	public Peca insert(Peca obj) {
		obj.setId(null);
		return pecaRepo.save(obj);
	}
	
	public void delete(Integer id) throws ObjectNotFoundException {
		searchById(id);
		pecaRepo.deleteById(id);
	}
	
	public List<Peca> findAll(){
		return pecaRepo.findAll();
	}
	
	public Peca fromDTO(PecaDTO objDTO) {		
		return new Peca(objDTO.getId(), objDTO.getNome(), objDTO.getPesoLiquido(), objDTO.getPesoBruto(), objDTO.getCarro());
	}

}
