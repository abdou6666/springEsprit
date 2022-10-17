package com.example.demo.service;

import com.example.demo.entity.Equipe;
import com.example.demo.entity.Universite;

import java.util.List;

public interface IUniversite {
    List<Universite> getAllUniversity();
    Universite addUniversite(Universite universite);
    Universite updateUniversite(Universite updateUniversite);
    void deleteUniversite(int id);
    Universite getUniversiteById(int id);
}
