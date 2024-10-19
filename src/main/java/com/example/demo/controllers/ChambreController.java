package com.example.demo.controllers;

import com.example.demo.Entity.Chambre;
import com.example.demo.services.ChambreService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("api/chambre")
public class ChambreController {
    ChambreService ChambreService ;

    @PostMapping("add")
    public Chambre addChambre(@RequestBody Chambre chambre) {
        return ChambreService.addChambre(chambre) ;
    }

    @GetMapping("/all")
    public List<Chambre> getAllChambre() {
        return ChambreService.getAllChambre() ;
    }

    @DeleteMapping("delete")
    public void deleteChambre(@RequestBody Chambre chambre) {
        ChambreService.deleteChambre(chambre);
    }

   @GetMapping("/find/{id}")
    public Optional<Chambre> getById(@PathVariable Long id) {
        return ChambreService.FindByChambre(id) ;
    }

}
