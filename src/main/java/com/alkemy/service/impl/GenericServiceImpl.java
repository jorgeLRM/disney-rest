package com.alkemy.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.alkemy.service.GenericService;

public abstract class GenericServiceImpl<T, ID> implements GenericService<T, ID> {
	
	protected abstract CrudRepository<T, ID> getRepository();
	
	@Override
	public T save(T t) {
		return getRepository().save(t);
	}

	@Override
	public T update(T t) {
		return getRepository().save(t);
	}

	@Override
	public List<T> findAll() {
		return (List<T>) getRepository().findAll();
	}

	@Override
	public T findById(ID id) {
		return getRepository().findById(id).orElse(null);
	}

	@Override
	public void delete(ID id) {
		getRepository().deleteById(id);
	}
}
