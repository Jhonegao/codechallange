package com.br.zen.codechallange.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.zen.codechallange.domain.Carro;
import com.br.zen.codechallange.services.CarroService;


@RestController
@RequestMapping(value = "/carros")
public class CarroResource {

	@Autowired
	private CarroService carroService;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> searchOne(@PathVariable Integer id) {

		Carro obj = carroService.searchById(id);

		return ResponseEntity.ok().body(obj);
	}
}