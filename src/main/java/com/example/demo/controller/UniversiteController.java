package com.example.demo.controller;


import com.example.demo.entity.Universite;
import com.example.demo.service.UniversiteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universite")
public class UniversiteController {
    @Autowired
    UniversiteServiceImpl universiteService;
    @PostMapping
    Universite createUniversity(@RequestBody Universite universite){
        return universiteService.addUniversite(universite);
    }

    @GetMapping
    List<Universite> getAllUniversity(){
        return universiteService.getAllUniversity();
    }

    @GetMapping("/{id}")
    Universite getUniversityById(@PathVariable("id") int id){
        return universiteService.getUniversiteById(id);
    }

    @PutMapping
    Universite updateUniversite(@RequestBody Universite universite){
        return universiteService.updateUniversite(universite);
    }

    @DeleteMapping
    void deleteUniversity(@PathVariable("id") int id){
        universiteService.deleteUniversite(id);
    }

    @PutMapping("/assignUniversiteToDepartement/{idUniversite}/{idDepartement}")
    public void assignUniversiteToDepartement(@PathVariable("idUniversite") int idUniversite,@PathVariable("idDepartement") int idDepartement){
        universiteService.assignUniversiteToDepartement(idUniversite,idDepartement);
    }
}
