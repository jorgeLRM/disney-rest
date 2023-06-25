package com.alkemy.controller;

import com.alkemy.domain.Personage;
import com.alkemy.repository.PersonageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/personages")
public class PersonageController {

    @Autowired
    private PersonageRepository personageRepository;

    @GetMapping
    public ResponseEntity<List<Personage>> findAll() {
        List<Personage> personages = personageRepository.findAll();
        return new ResponseEntity<>(personages, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Personage> findById(@PathVariable("id") Integer id) {
        Personage personage = personageRepository.findById(id).get();
        return new ResponseEntity<>(personage, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Personage> save(@RequestBody Personage personage) {
        Personage addedPersonage = personageRepository.save(personage);
        return new ResponseEntity<>(addedPersonage, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Personage> update(@RequestBody Personage personage) {
        Personage updatedPersonage = personageRepository.save(personage);
        return new ResponseEnti
    }



























}
