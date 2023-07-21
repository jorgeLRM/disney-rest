package com.alkemy.service;

import java.util.List;
import java.util.Optional;

public interface GenericService<T, ID> {
	
	T save(T t);
	T update(T t);
	List<T> findAll();
	T findById(ID id);
	void delete(ID id);
	
}
