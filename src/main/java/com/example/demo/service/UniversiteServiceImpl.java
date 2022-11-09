package com.example.demo.service;

import com.example.demo.entity.Departement;
import com.example.demo.entity.Universite;
import com.example.demo.repository.DepartementRepository;
import com.example.demo.repository.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements IUniversite{

    UniversiteRepository universiteRepository;
    DepartementRepository departementRepository;
    @Override
    public List<com.example.demo.entity.Universite> getAllUniversity() {
        return universiteRepository.findAll();
    }

    @Override
    public com.example.demo.entity.Universite addUniversite(com.example.demo.entity.Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public com.example.demo.entity.Universite updateUniversite(com.example.demo.entity.Universite updateUniversite) {
        return universiteRepository.save(updateUniversite);
    }

    @Override
    public void deleteUniversite(int id) {
        universiteRepository.deleteById(id);
    }

    @Override
    public com.example.demo.entity.Universite getUniversiteById(int id) {
        return universiteRepository.findById(id).get();
    }

    @Override
    public void assignUniversiteToDepartement(int idUniversite, int idDepartement) {
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        Departement departement = departementRepository.findById(idDepartement).orElse(null);
        universite.getDepartements().add(departement);
        universiteRepository.save(universite);

    }
}
