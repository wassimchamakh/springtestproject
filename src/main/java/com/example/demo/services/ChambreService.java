package com.example.demo.services;

import com.example.demo.Entity.Chambre;
import com.example.demo.repositories.ChambreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChambreService implements IChambreService {

    private final ChambreRepository chambrerepo ;

    @Autowired
    public ChambreService(ChambreRepository chambrerepo) {
        this.chambrerepo = chambrerepo;
    }



    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambrerepo.save(chambre) ;
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambrerepo.save(chambre);
    }

    @Override
    public void  deleteChambre(Chambre Chambre) {
        chambrerepo.delete(Chambre);
    }

    @Override
    public List<Chambre> getAllChambre() {
        return chambrerepo.findAll() ;
    }

    public Optional<Chambre> FindByChambre(Long id) {
        return chambrerepo.findById(id) ;
    }
}
