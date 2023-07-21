package com.alkemy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.alkemy.domain.Personage;
import com.alkemy.service.PersonageService;

@Service
public class PersonageServiceImpl extends GenericServiceImpl<Personage, Integer> implements PersonageService {

	@Autowired
	private CrudRepository<Personage, Integer> personageRepository;
	
	@Override
	protected CrudRepository<Personage, Integer> getRepository() {
		return personageRepository;
	}

}
