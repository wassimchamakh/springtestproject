package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Bloc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc ;

    private String nomBloc ;

    private Long capaciteBloc ;

    @ManyToOne
    private Foyer foyer ;

    @OneToMany(cascade= CascadeType.ALL , mappedBy="bloc")
    private Set<Chambre> chambres ;
}
