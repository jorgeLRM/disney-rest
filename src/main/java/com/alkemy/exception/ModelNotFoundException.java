package com.alkemy.exception;

public class ModelNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 3006542918064977504L;

	public ModelNotFoundException(Integer id) {
		super("Entity with id: " + id + " not found");
	}
	
}
