package com.alkemy.dto;

import java.util.List;

import com.alkemy.domain.PersonageFilm;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PersonageDTO {
	
	@EqualsAndHashCode.Include
	private Integer idPersonage;
	
	private String name;
	
    private int age;
    
    private float weight;
    
    private String story;
    
    private String image;
    
    @JsonManagedReference
    private List<PersonageFilm> films;
	
}
