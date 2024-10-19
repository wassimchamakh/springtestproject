package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Foyer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFoyer ;

    private String nomFoyer ;

    private Long capaciteFoyer ;

    @OneToOne(cascade= CascadeType.ALL,mappedBy="foyer")
    private Universite universite ;

    @OneToMany(cascade= CascadeType.ALL , mappedBy="foyer")
    private Set<Bloc> blocs ;


}
