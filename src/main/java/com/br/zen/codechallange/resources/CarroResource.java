package com.br.zen.codechallange.resources;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.br.zen.codechallange.DTO.CarroDTO;
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
	
//	@RequestMapping(method = RequestMethod.POST)
//	public ResponseEntity<Void> insert(@RequestBody Carro obj){
//		obj = carroService.insert(obj);
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
//				.path("/{id}").buildAndExpand(obj.getId()).toUri();
//		return ResponseEntity.created(uri).build();
//	}
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody CarroDTO objDTO){
		Carro obj = carroService.fromDTO(objDTO);
		obj = carroService.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}