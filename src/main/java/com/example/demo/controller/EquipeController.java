package com.example.demo.controller;


import com.example.demo.entity.Equipe;
import com.example.demo.service.EquipeServiceImpl;
import com.example.demo.service.IEquipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("equipe")
public class EquipeController {

    EquipeServiceImpl equipeService;
    EquipeController(EquipeServiceImpl equipeService){
        this.equipeService = equipeService;
    }

    @GetMapping
    List<Equipe> getListEquipes(){
        return this.equipeService.getAllEquipe();
    }
    @GetMapping("/{id}")
    Equipe getEquipe(@PathVariable("id") long id){
        return this.equipeService.getEquipeById(id);
    }
    @PostMapping
    Equipe createEquipe(@RequestBody Equipe equipe){
        return equipeService.addEquipe(equipe);
    }

    @PutMapping
    Equipe updateEquipe(@RequestBody Equipe equipe){
        return equipeService.updateEquipe(equipe);
    }
    @DeleteMapping("/{id}")
    void deleteEquipe(@PathVariable("id") long id){
        equipeService.deleteEquipe(id);
    }
/*
    @GetMapping("/equipes/{idEtudiant}")
    List<Equipe> getEquipesByIdEtudiant(@PathVariable("idEtudiant") long idEtudiant){
        return equipeService.findbyEtudiantsIdEtudiant(idEtudiant);
    } */


}

