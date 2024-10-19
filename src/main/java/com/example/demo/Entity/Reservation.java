package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdReservation ;

    private Date anneeUniversitaire ;
    private Boolean estValide ;


    @ManyToMany(cascade= CascadeType.ALL)
    private Set<Etudiant> etudiants ;

}
