package com.br.zen.codechallange.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.zen.codechallange.domain.Peca;

@RestController
@RequestMapping(value="/pecas")
public class PecaResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Peca> listar() {
		
		Peca peca1 = new Peca(1, "Polia", 2.22, 3.222);
		Peca peca2 = new Peca(2, "Roda", 33.22, 5.11222);
		
		List<Peca> pecas = new ArrayList<Peca>();
		pecas.add(peca1);
		pecas.add(peca2);
		
		return pecas;
	}

}
