package com.br.zen.codechallange.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.zen.codechallange.domain.Peca;
import com.br.zen.codechallange.services.PecaService;

@RestController
@RequestMapping(value = "/pecas")
public class PecaResource {

	@Autowired
	private PecaService pecaService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> searchOne(@PathVariable Integer id) {

		Peca obj = pecaService.searchById(id);

		return ResponseEntity.ok().body(obj);

	}

}
