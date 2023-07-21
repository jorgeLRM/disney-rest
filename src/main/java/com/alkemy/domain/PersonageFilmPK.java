package com.alkemy.domain;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.EqualsAndHashCode;

@Embeddable
@EqualsAndHashCode
public class PersonageFilmPK implements Serializable {
	
	private static final long serialVersionUID = 601318766662353076L;

	@ManyToOne
	@JoinColumn(name = "idPersonage")
	private Personage personage;
	
	@ManyToOne
	@JoinColumn(name = "idFilm")
	private Film film;
	
}
