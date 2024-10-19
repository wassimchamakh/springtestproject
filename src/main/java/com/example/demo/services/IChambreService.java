package com.example.demo.services;

import com.example.demo.Entity.Chambre;

import java.util.List;

public interface IChambreService {

    Chambre addChambre(Chambre chambre) ;
    Chambre updateChambre(Chambre chambre) ;
    void deleteChambre(Chambre Chambre) ;
    List<Chambre> getAllChambre() ;

}
