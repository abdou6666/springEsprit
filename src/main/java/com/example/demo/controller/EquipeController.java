package com.example.demo.controller;


import com.example.demo.entity.Equipe;
import com.example.demo.service.EquipeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("equipe")
public class EquipeController {
    @Autowired
    EquipeServiceImpl equipeService;

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
        return this.createEquipe(equipe);
    }

    @PutMapping
    Equipe updateEquipe(@RequestBody Equipe equipe){
        return this.updateEquipe(equipe);
    }
    @DeleteMapping("/{id}")
    void deleteEquipe(@PathVariable("id") long id){
        this.deleteEquipe(id);
    }
}
