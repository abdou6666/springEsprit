package com.example.demo.service;

import com.example.demo.entity.Departement;

import java.util.List;

public interface IDepartement {
    List<Departement> getAllDepartement();
    Departement addDepartement(Departement departement);
    Departement updateDepartement(Departement updateDepartement);
    void deleteDepartement(int id);
    Departement getDepartementById(int id);
}
