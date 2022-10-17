package com.example.demo.controller;


import com.example.demo.entity.DetailEquipe;
import com.example.demo.service.DetailEquipeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("detailEquipe")
public class DetailEquipeController {
    @Autowired
    DetailEquipeServiceImpl detailEquipeService;

    @GetMapping
    List<DetailEquipe> getDetailsEquipe(){
        return this.detailEquipeService.getDetailsEquipe();
    }
    @GetMapping("/{id}")
    DetailEquipe getDetailEquipeById(@PathVariable("id") long id ){
        return detailEquipeService.getDetailEquipeById(id);
    }

    @PostMapping
    DetailEquipe createDetailEquipe(@RequestBody DetailEquipe detailEquipe){
        return detailEquipeService.addDetailEquipe(detailEquipe);
    }

    @PutMapping
    DetailEquipe updateDetailEquipe(@RequestBody DetailEquipe detailEquipe){
        return detailEquipeService.updateDetailEquipe(detailEquipe);
    }

    @DeleteMapping("{id}")
    void deleteEquipe(@PathVariable("id") long id){
        detailEquipeService.deleteDetailEquipe(id);
    }
}
