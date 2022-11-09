package com.example.demo.service;

import com.example.demo.entity.Equipe;


import java.util.List;

public interface IEquipe {
    List<Equipe> getAllEquipe();
    Equipe addEquipe(Equipe equipe);
    Equipe updateEquipe(Equipe updateEquipe);
    void deleteEquipe(long id);
    Equipe getEquipeById(long id);

    //List<Equipe> findbyEtudiantsIdEtudiant(Long idEtudiant);

}
