package com.br.zen.codechallange.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;
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
import com.br.zen.codechallange.DTO.CarroNewDTO;
import com.br.zen.codechallange.DTO.PecaDTO;
import com.br.zen.codechallange.domain.Carro;
import com.br.zen.codechallange.domain.Peca;
import com.br.zen.codechallange.services.CarroService;
import com.br.zen.codechallange.services.PecaService;


@RestController
@RequestMapping(value = "/carros")
public class CarroResource {

	@Autowired
	private CarroService carroService;
	@Autowired
	private PecaService pecaService;
//METHODS GET//
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> searchOne(@PathVariable Integer id) {
		Carro obj = carroService.searchById(id);
		return ResponseEntity.ok().body(obj);
	}	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<CarroDTO>> findAll() {
		List<Carro> listCarros = carroService.findAll();
		List<CarroDTO> listDTO = listCarros.stream().map(obj -> new CarroDTO(obj)).collect(Collectors.toList());
		return ResponseEntity.ok().body(listDTO);
	}
	@RequestMapping(value = "/{carroId}/pecas", method = RequestMethod.GET)
		public ResponseEntity<List<PecaDTO>> findPecas(@PathVariable Integer carroId) {
			List<Peca> listPecas = pecaService.findByCarro(carroId);
			List<PecaDTO> listDTO = listPecas.stream().map(obj -> new PecaDTO(obj)).collect(Collectors.toList());
			return ResponseEntity.ok().body(listDTO);
	}
	
//METHODS POST//	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@Valid @RequestBody CarroNewDTO objDTO){
		Carro obj = carroService.fromDTO(objDTO);
		obj = carroService.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
}