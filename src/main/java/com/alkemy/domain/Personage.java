package com.alkemy.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Personage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idPersonage;
    private String name;
    private int age;
    private float weight;
    private String story;
    private String image;

    @OneToMany(mappedBy = "film", fetch = FetchType.EAGER)
    private List<PersonageFilm> films;





}
