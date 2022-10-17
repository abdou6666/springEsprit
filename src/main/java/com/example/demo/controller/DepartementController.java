package com.example.demo.controller;

import com.example.demo.entity.Departement;
import com.example.demo.service.DepartementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departement")
public class DepartementController {
    @Autowired
    DepartementServiceImpl departementService;

    @GetMapping
    List<Departement> getAllDepartement(){
        return departementService.getAllDepartement();
    }

    @GetMapping("/{id}")
    Departement getDepartement(@PathVariable("id") int id){
        return departementService.getDepartementById(id);
    }

    @PostMapping
    Departement createDepartement(@RequestBody Departement departement){
        return departementService.addDepartement(departement);
    }
    @PutMapping
    Departement updateDepartement(@RequestBody Departement departement){
        return departementService.updateDepartement(departement);
    }
    @DeleteMapping("/{id}")
    void deleteDepartement(@PathVariable("id") int id){
         departementService.deleteDepartement(id);
    }
}
