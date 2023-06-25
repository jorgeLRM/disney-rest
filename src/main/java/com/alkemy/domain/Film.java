package com.alkemy.domain;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idFilm;
    private String title;
    private LocalDate createdAt;

    @Size(min = 0, max = 5)
    private int rating;

    @Enumerated(EnumType.STRING)
    private Type type;

    @ManyToOne
    private Category category;

    @OneToMany(mappedBy = "personage")
    private List<PersonageFilm> personages;


}
