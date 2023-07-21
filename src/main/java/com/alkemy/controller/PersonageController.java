package com.alkemy.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.alkemy.domain.Personage;
import com.alkemy.dto.PersonageDTO;
import com.alkemy.service.PersonageService;

@RestController
@RequestMapping("/personages")
public class PersonageController {
	
	@Autowired
	private PersonageService personageService;
	
	@Autowired
	private ModelMapper mapper;
	
	@GetMapping
	public ResponseEntity<List<PersonageDTO>> findAll() {
		List<PersonageDTO> personages = personageService.findAll()
				.stream()
				.map(personage -> mapper.map(personage, PersonageDTO.class))
				.collect(Collectors.toList());
		return new ResponseEntity<>(personages, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Personage> findById(@PathVariable("id") Integer idPersonage) {
		Personage personage = personageService.findById(idPersonage);
		
		if (personage == null) {
			throw new 
		}
	}
	
	@PostMapping
	public ResponseEntity<Personage> save(@RequestBody Personage personage) {
		Personage personageCreated = personageService.save(personage);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(personageCreated.getIdPersonage())
				.toUri();
		return ResponseEntity.created(location).body(personageCreated);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Personage> update(
			@PathVariable("id") Integer idPersonage,
			@RequestBody Personage updatedPersonage) {
		Optional<Personage> updatedPersonage = personageService.update(updatedPersonage)
	}
}
