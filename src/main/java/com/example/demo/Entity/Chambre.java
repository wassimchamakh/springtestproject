package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Chambre {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idChambre ;

    private Long numeroChambre ;

    private TypeChambre typeC ;

    @OneToMany(cascade=CascadeType.ALL)
    private Set<Reservation> reservs ;

    @ManyToOne
    private Bloc bloc ;




}
