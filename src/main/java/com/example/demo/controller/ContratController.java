package com.example.demo.controller;


import com.example.demo.entity.Contrat;
import com.example.demo.service.IContrat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/contrat")
public class ContratController{
    @Autowired
    IContrat contratService;

    @GetMapping
    List<Contrat> listContrat(){
        return contratService.getAllContrat();
    }
    @GetMapping("/{id}")
    Contrat getOneContrat(@PathVariable("id") long id){
        return contratService.getContratById(id);
    }


    @PostMapping
    Contrat addContrat(@RequestBody Contrat contrat){
        return contratService.addContrat(contrat);
    }

    @PutMapping
    Contrat updateContrat(@RequestBody  Contrat contrat){
        return contratService.updateContrat(contrat);
    }

    @DeleteMapping("{id}")
    void deleteContrat(@PathVariable long id){
         contratService.deleteContrat(id);
    }

}
