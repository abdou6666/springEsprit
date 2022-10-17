package com.example.demo.service;

import com.example.demo.entity.Contrat;

import java.util.List;

public interface IContrat {
    List<Contrat> getAllContrat();
    Contrat addContrat(Contrat contrat);
    Contrat updateContrat(Contrat updateContrat);
    void deleteContrat(long id);
    Contrat getContratById(long id);
}
